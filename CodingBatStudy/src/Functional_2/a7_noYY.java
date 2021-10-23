package Functional_2;

import java.util.List;
import java.util.stream.Collectors;

/*Functional-2 > noYY
Given a list of strings, return a list where each string has "y" added at its end, omitting any resulting strings that contain "yy" as a substring anywhere.
noYY(["a", "b", "c"]) ¡æ ["ay", "by", "cy"]
noYY(["a", "b", "cy"]) ¡æ ["ay", "by"]
noYY(["xx", "ya", "zz"]) ¡æ ["xxy", "yay", "zzy"]*/
public class a7_noYY {
	public List<String> noYY(List<String> strings) {
		   strings.replaceAll(s->s+"y");
		   strings.removeIf(s->s.contains("yy"));
		   return strings;
		}
	
	 // Solution
    public List<String> snoYY(List<String> strings) {
        return strings.stream()
                .map(s -> s + "y")
                .filter(s -> !s.contains("yy"))
                .collect(Collectors.toList());
    }
}
