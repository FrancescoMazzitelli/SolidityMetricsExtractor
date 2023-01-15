package extractor.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.TokenStream;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import com.opencsv.CSVWriter;

import grammar_ANTLR.solidity.SolidityLexer;
import grammar_ANTLR.solidity.SolidityParser;
import grammar_ANTLR.solidity.SolidityParser.*;
import extractor.visitors.ContractVisitor;


public class Main {
	
	public static File input_dir = new File("C:\\Users\\panne\\eclipse-workspace1\\SolidityMetricsExtractor\\INPUT");
	public static String output_dir = "C:\\Users\\panne\\eclipse-workspace1\\SolidityMetricsExtractor\\OUTPUT";

	static String readFile(String path, Charset encoding) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return new String(encoded, encoding);
	}

	public static void main(String[] args) throws Exception {
		try {
			
			List<String> solPaths = new ArrayList<>();
			File[] contents = input_dir.listFiles();
			
			if (contents.length > 0) {
				for(File content : contents) {
					if(content.isFile()) solPaths.add(content.toString());
				}
			}

			if (solPaths.isEmpty()) {
				throw new ParseException("Empty contract list!", 0);
			}
			
			try (BufferedWriter writer = new BufferedWriter(new FileWriter(output_dir+"\\metrics.csv"));
					CSVPrinter csvPrinter = new CSVPrinter(writer,
							CSVFormat.EXCEL.withHeader("SolidityFile", "ContractName", "Type", 
											"SLOC", "CLOC", "McCC", "NOS", "CBO", "DIT"))) {
	            
	            for (String solPath : solPaths) {
					System.out.println("Parsing " + new File(solPath).getPath());
					String contractCode = readFile(solPath, Charset.forName("UTF-8"));
					CharStream charStream = CharStreams.fromString(contractCode);
					TokenSource lexer = new SolidityLexer(charStream);
					//Tokenizza il testo
					//System.out.println(lexer.getAllTokens());
					//--------------------------------------
					//Resituisce un stream concatenato di Token
					BufferedTokenStream tokens = new BufferedTokenStream(lexer);
					tokens.fill(); //<- Lui effettua la conversione da token a TokenStream
					//System.out.println(tokens.getText());
					//--------------------------------------
					SolidityParser parser = new SolidityParser(tokens);
				
				
					ContractVisitor contractVisitor = new ContractVisitor(contractCode);
					contractVisitor.visit(parser.sourceUnit());
					Map<DefinizioneContrattoContext, Integer[]> metrics = contractVisitor.getMetricMap();
					ArrayList<Object> record = new ArrayList<Object>();
					for(DefinizioneContrattoContext contract : metrics.keySet()) {
						record.add(new File(solPath).getName());
						record.add(contract.getChild(1).getText());
						record.add(contract.getChild(0).getText());
						record.addAll(Arrays.asList(metrics.get(contract)));
						csvPrinter.printRecord(record);
						csvPrinter.flush();
					}
				}
	        }

		} catch (ParseException exp) {
			System.out.println(exp.getMessage());
		}
	}

}
