package Functional_1;

import java.util.List;

/*Functional-1 > moreY
Given a list of strings, return a list where each string has "y" added at its start and end.
moreY(["a", "b", "c"]) ¡æ ["yay", "yby", "ycy"]
moreY(["hello", "there"]) ¡æ ["yhelloy", "ytherey"]
moreY(["yay"]) ¡æ ["yyayy"]*/
public class a5_moreY {
	public List<String> moreY(List<String> strings) {
		  strings.replaceAll(s->"y"+s+"y");
		  return strings;
		}
	
	// Solution
    public List<String> smoreY(List<String> strings) {
        strings.replaceAll(s -> "y" + s + "y");
        return strings;
    }
}
