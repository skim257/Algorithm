package Functional_1;

import java.util.List;

/*Functional-1 > copies3
Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together.
copies3(["a", "bb", "ccc"]) ¡æ ["aaa", "bbbbbb", "ccccccccc"]
copies3(["24", "a", ""]) ¡æ ["242424", "aaa", ""]
copies3(["hello", "there"]) ¡æ ["hellohellohello", "theretherethere"]*/
public class a4_copies3 {
	public List<String> copies3(List<String> strings) {
		  strings.replaceAll(n->n+n+n);
		  return strings;
		}

	// Solution
    public List<String> scopies3(List<String> strings) {
        strings.replaceAll(s -> s + s + s);
        return strings;
    }
}
