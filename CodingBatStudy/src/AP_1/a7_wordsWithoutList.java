package AP_1;
import java.util.*;
/*AP-1 > wordsWithoutList
Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given length are omitted.
See wordsWithout() below which is more difficult because it uses arrays.
wordsWithoutList(["a", "bb", "b", "ccc"], 1) ¡æ ["bb", "ccc"]
wordsWithoutList(["a", "bb", "b", "ccc"], 3) ¡æ ["a", "bb", "b"]
wordsWithoutList(["a", "bb", "b", "ccc"], 4) ¡æ ["a", "bb", "b", "ccc"]*/
public class a7_wordsWithoutList {
	public List wordsWithoutList(String[] words, int len) {
		  String a="";
		  for(int i=0; i<words.length; i++){
		    if(words[i].length()!=len) {
		      a=words[i];
		      break;
		    }
		  }
		  List<String> out = new ArrayList<>(Arrays.asList(a));
		  return out;
		}

	// Solution
    public List<String> swordsWithoutList(String[] words, int len) {
        List<String> out = new ArrayList();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != len) out.add(words[i]);
        }
        return out;
    }
}
