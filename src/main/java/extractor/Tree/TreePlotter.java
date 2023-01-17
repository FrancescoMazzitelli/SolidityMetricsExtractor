package extractor.Tree;

import java.util.Arrays;
import java.util.List;


import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.misc.Utils;
import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.tree.Trees;
import extractor.grammar.SolidityParser;


public class TreePlotter {
	
	 /** Rilevatore End-Of-Line */
    public static final String Eol = System.lineSeparator();
    /** Carattere d'indentazione utilizzato per il pretty-printing */
    public static final String Indents = "  ";
    private static int level;
    
    private static List<String> ruleNamesList;
    private static ParseTree tree;

    public TreePlotter(){}
    
    public static void createParseTree(SolidityParser parser) {
    	tree = parser.sourceUnit();
	}
    
    public static void getRules(SolidityParser parser) {
    	ruleNamesList = Arrays.asList(parser.getRuleNames());
    }

	/**
     * Pretty print di un intero albero. getNodeText viene utilizzato per 
     * ottenere il contenuto del nodo. (Trees.toStringTree(....))
     */
    public static String toPrettyTree(final Tree t, final List<String> ruleNames) {
        level = 0;
        return process(t, ruleNames).replaceAll("(?m)^\\s+$", "").replaceAll("\\r?\\n\\r?\\n", Eol);
    }

    private static String process(final Tree t, final List<String> ruleNames) {
        if (t.getChildCount() == 0) return Utils.escapeWhitespace(Trees.getNodeText(t, ruleNames), false);
        StringBuilder sb = new StringBuilder();
        sb.append(lead(level));
        level++; //incrementa numero di indentazioni
        String s = Utils.escapeWhitespace(Trees.getNodeText(t, ruleNames), false);
        sb.append(s + ' ');
        for (int i = 0; i < t.getChildCount(); i++) {
            sb.append(process(t.getChild(i), ruleNames)); //chiamata ricorsiva al metodo
        }
        level--; //decrementa numero di indentazioni
        sb.append(lead(level));
        return sb.toString();
    }

    private static String lead(int level) {
        StringBuilder sb = new StringBuilder();
        if (level > 0) {
            sb.append(Eol);
            for (int cnt = 0; cnt < level; cnt++) {
                sb.append(Indents);
            }
        }
        return sb.toString();
    }
    
    public static void plot() {
    	System.out.println(toPrettyTree(tree, ruleNamesList));
    }
}
