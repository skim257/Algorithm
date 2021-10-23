package Functional_1;

import java.util.List;
import java.util.function.Function;

/*Functional-1 > noX
Given a list of strings, return a list where each string has all its "x" removed.
noX(["ax", "bb", "cx"]) ¡æ ["a", "bb", "c"]
noX(["xxax", "xbxbx", "xxcx"]) ¡æ ["a", "bb", "c"]
noX(["x"]) ¡æ [""]*/
public class a9_noX {
	public List<String> noX(List<String> strings) {
		  strings.removeIf(n->n.contains("x"));
		  return strings;
		}
	
	// Solution
    public List<String> snoX(List<String> strings) {
        strings.replaceAll(s -> func.apply(s));
        return strings;
    }

    final Function<String, String> func = s -> {
        if (s.equals("")) return s;
        if (s.charAt(0) == 'x') return this.func.apply(s.substring(1));
        else return s.charAt(0) + this.func.apply(s.substring(1));
    };
}
