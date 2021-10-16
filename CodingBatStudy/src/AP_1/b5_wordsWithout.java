package AP_1;
/*AP-1 > wordsWithout
Given an array of strings, return a new array without the strings that are equal to the target string.
One approach is to count the occurrences of the target string, make a new array of the correct length, and then copy over the correct strings.
wordsWithout(["a", "b", "c", "a"], "a") ¡æ ["b", "c"]
wordsWithout(["a", "b", "c", "a"], "b") ¡æ ["a", "c", "a"]
wordsWithout(["a", "b", "c", "a"], "c") ¡æ ["a", "b", "a"]*/
public class b5_wordsWithout {
	public String[] wordsWithout(String[] words, String target) {
		  int n=0;
		  for(int i=0; i<words.length; i++){
		    if(!words[i].equals(target)) n++;
		  }
		  String[] out=new String[n];
		  int a=0;
		  for(int i=0; i<words.length; i++){
		    if(!words[i].equals(target))out[a++]=words[i];
		  }
		  return out;
		}
	
	// Solution
    public String[] swordsWithout(String[] words, String target) {
        int len = 0;
        for (String s:words) {
            if (s.equals(target)) len++;
        }
        int n = 0;
        String[] out = new String[words.length - len];
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(target)) out[n++] = words[i];
        }
        return out;
    }
}
