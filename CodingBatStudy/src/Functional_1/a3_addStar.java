package Functional_1;

import java.util.List;

/*Functional-1 > addStar
Given a list of strings, return a list where each string has "*" added at its end.
addStar(["a", "bb", "ccc"]) ¡æ ["a*", "bb*", "ccc*"]
addStar(["hello", "there"]) ¡æ ["hello*", "there*"]
addStar(["*"]) ¡æ ["**"]*/
public class a3_addStar {
	public List<String> addStar(List<String> strings) {
		  strings.replaceAll(n->n+"*");
		  return strings;
		}
	
	// Solution
    public List<String> saddStar(List<String> strings) {
        strings.replaceAll(s -> s + "*");
        return strings;
    }
}
