package Functional_1;

import java.util.List;

/*Functional-1 > lower
Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).
lower(["Hello", "Hi"]) ¡æ ["hello", "hi"]
lower(["AAA", "BBB", "ccc"]) ¡æ ["aaa", "bbb", "ccc"]
lower(["KitteN", "ChocolaTE"]) ¡æ ["kitten", "chocolate"]*/
public class a8_lower {
	public List<String> lower(List<String> strings) {
		  strings.replaceAll(s->s.toLowerCase());
		  return strings;
		}
	
	// Solution
    public List<String> slower(List<String> strings) {
        strings.replaceAll(s -> s.toLowerCase());
        return strings;
    }
}
