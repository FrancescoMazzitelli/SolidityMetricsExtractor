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
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import extractor.Tree.TreePlotter;
import extractor.grammar.SolidityLexer;
import extractor.grammar.SolidityParser;
import extractor.grammar.SolidityParser.*;
import extractor.metrics.MainVisitor;
import extractor.symbolTable.SymbolTable;


public class Main {
	
	public static File input_dir = new File("C:\\Users\\panne\\SolidityMetricsExtractor\\INPUT");
	public static String output_dir = "C:\\Users\\panne\\SolidityMetricsExtractor\\OUTPUT";

	/**
	 * Funzione adibita alla lettura di un file, specificandone il path
	 * e ne effettua direttamente la conversione da array di bytes a String
	 * 
	 * @param path
	 * @param encoding
	 * @return Stringa convertita
	 * @throws IOException
	 */
	static String read(String path, Charset encoding) throws IOException {
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
				throw new ParseException("Directory contenente i file vuota!", 0);
			}
			
			/****************************************************************
			 * Inizializzazione del file CSV con specifica dell'header
			 * Vengono creati il writer, adibito alla scrittura sul buffer e
			 * il printer, adibito alla stampa effettiva sul file
			 ***************************************************************/
			
			try (BufferedWriter writer = new BufferedWriter(new FileWriter(output_dir+"\\metrics.csv"));
					CSVPrinter csvPrinter = new CSVPrinter(writer,
							CSVFormat.EXCEL.withHeader("SolidityFile", "ContractName", "Type", 
											"SLOC", "CLOC", "McCC", "NOS", "CBO", "DIT"))) {
	            
				/*********************************************************************************
				 * Per ogni file contenuto nella directory INPUT, viene effettuata una
				 * operazione di lettura e di successiva generazione della stringa "contractCode".
				 * La stringa viene convertita in uno stream di caratteri e passata come argomento
				 * al lexer, che effettuera' un'operazione di tokenizzazione del testo. I token
				 * generati dal lexer verranno poi convertiti in uno stream di token che a sua
				 * volta verra' passato al parser per la generazione di un albero di derivazione
				 ********************************************************************************/
	            
				for (String solPath : solPaths) {
					System.out.println("Parsing " + new File(solPath).getPath());
					String contractCode = read(solPath, Charset.forName("UTF-8"));
					CharStream charStream = CharStreams.fromString(contractCode);
					SymbolTable table = new SymbolTable();
					
					//Tokenizza il testo
					TokenSource lexer = new SolidityLexer(charStream);
					
					/*
					List<? extends Token> tok = new ArrayList<Token>();
					Lexer lex = new SolidityLexer(charStream);
					tok = lex.getAllTokens();
					for(Token t : tok) {
						System.out.println(t);
					}
					*/

					//Resituisce un stream concatenato di Token
					BufferedTokenStream tokens = new BufferedTokenStream(lexer);
					
					/*
					tokens.fill();
					System.out.println(tokens.getText());
					*/
					
					SolidityParser parser = new SolidityParser(tokens);
					
					//List<String> ruleNamesList = Arrays.asList(parser.getRuleNames());
					//ParseTree tree = parser.sourceUnit();
					//table.populateMap(tree, ruleNamesList);
					//table.printTable();
					
					//parser.reset();
					
					//TreePlotter.getRules(parser);
					//TreePlotter.createParseTree(parser);
					//TreePlotter.plot(); //<- Funzione che stampa l'albero di derivazione
					
					//parser.reset();
				
					/*****************************************************************************************
					 * Viene quindi chiamato il main visitor, componente che detiene la logica relativa
					 * all'estrazione delle metriche. Tramite la chiamata al metodo "visit" della superclasse
					 * AbstractParseTreevisitor, viene attraversato il parseTree il cui nodo radice e'
					 * contrassegnato dal metodo sourceUnit() che indica l'inizio della grammatica. Vengono
					 * quindi estratte le metriche e salvate in una lista chiamata record. Questa lista verra'
					 * poi salvata nella sua interezza sul file CSV. Questa operazione viene svolta per ogni
					 * file in input.				 
					 ****************************************************************************************/
					
					MainVisitor visitor = new MainVisitor(contractCode);
					visitor.visit(parser.sourceUnit());
					Map<DefinizioneContrattoContext, Integer[]> metrics = visitor.getMetricMap();

					for(DefinizioneContrattoContext contract : metrics.keySet()) {
						ArrayList<Object> record = new ArrayList<Object>();
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
