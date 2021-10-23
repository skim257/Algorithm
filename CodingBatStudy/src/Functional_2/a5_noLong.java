package Functional_2;

import java.util.List;
import java.util.stream.Collectors;

/*Functional-2 > noLong
Given a list of strings, return a list of the strings, omitting any string length 4 or more.
noLong(["this", "not", "too", "long"]) ¡æ ["not", "too"]
noLong(["a", "bbb", "cccc"]) ¡æ ["a", "bbb"]
noLong(["cccc", "cccc", "cccc"]) ¡æ []*/
public class a5_noLong {
	public List<String> noLong(List<String> strings) {
		  strings.removeIf(s->s.length()>=4);
		  return strings;
		}
	
	// Solution
    public List<String> snoLong(List<String> strings) {
        return strings.stream()
                .filter(s -> s.length() < 4)
                .collect(Collectors.toList());
    }
}
