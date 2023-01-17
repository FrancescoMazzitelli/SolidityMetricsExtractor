package extractor.symbolTable;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.Tree;
import org.antlr.v4.runtime.tree.Trees;

import extractor.grammar.SolidityParser;

import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class SymbolTable {
	
private static HashMap<String, String> table;

	
	public SymbolTable() {
		SymbolTable.table = new HashMap<String, String>();
	}
	
	public static void addSymbol(String id, String symbol) {
		if(!table.containsKey(id))
			table.put(id, symbol);
	}
	
	public static void modifyValue(String id, String symbol) {
		table.remove(id);
		if(!table.containsKey(id))
			table.put(id, symbol);
	}

	public boolean populateMap(final Tree t, final List<String> ruleNames) {
		
		boolean flag = false;
		
		if (t.getChildCount() == 0) return false;
		
		Stack<Tree> stack = new Stack<>();
		stack.push(t);
		while(stack.empty() == false) {
			Tree t0 = stack.pop();
			for(int i = 0; i < t0.getChildCount(); i++) {
				stack.push(t0.getChild(i));
				String value = Trees.getNodeText(t0, ruleNames);
				if(value.equals("identificatore") && flag == false) {
					addSymbol(Trees.getNodeText(stack.pop(), ruleNames), value);
					flag = true;
				}
			}
			flag = false;
		}
		return true;
	}
	
	public static String getSymbol(String id) {
		return table.get(id);
	}
	
	public static boolean contains(String id) {
		if(table.containsKey(id)) return true;
		else return false;
	}
	
	public void printTable() {
		Set<String> keys =table.keySet();
		for(String key:keys) {
			System.out.println("ID: "+key+" | VALUE: "+table.get(key));

		}
	}
}
