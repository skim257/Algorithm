package Functional_2;

import java.util.List;
import java.util.stream.Collectors;

/*Functional-2 > no34
Given a list of strings, return a list of the strings, omitting any string length 3 or 4.
no34(["a", "bb", "ccc"]) ¡æ ["a", "bb"]
no34(["a", "bb", "ccc", "dddd"]) ¡æ ["a", "bb"]
no34(["ccc", "dddd", "apple"]) ¡æ ["apple"]*/
public class a6_no34 {
	public List<String> no34(List<String> strings) {
		  strings.removeIf(s->s.length()==3||s.length()==4);
		  return strings;
		}
	
	// Solution
    public List<String> sno34(List<String> strings) {
        return strings.stream()
                .filter(s -> s.length() != 3 && s.length() != 4)
                .collect(Collectors.toList());
    }
}
