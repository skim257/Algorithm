package Functional_2;

import java.util.List;
import java.util.stream.Collectors;

/*Functional-2 > noZ
Given a list of strings, return a list of the strings, omitting any string that contains a "z".
(Note: the str.contains(x) method returns a boolean)
noZ(["aaa", "bbb", "aza"]) ¡æ ["aaa", "bbb"]
noZ(["hziz", "hzello", "hi"]) ¡æ ["hi"]
noZ(["hello", "howz", "are", "youz"]) ¡æ ["hello", "are"]*/
public class a4_noZ {
	public List<String> noZ(List<String> strings) {
		  strings.removeIf(s->s.contains("z"));
		  return strings;
		}
	
	// Solution
    public List<String> snoZ(List<String> strings) {
        return strings.stream()
                .filter(s -> s.indexOf("z") == -1)
                .collect(Collectors.toList());
    }
}
