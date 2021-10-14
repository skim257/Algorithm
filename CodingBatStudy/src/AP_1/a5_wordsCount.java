package AP_1;
/**AP-1 > wordsCount
Given an array of strings, return the count of the number of strings with the given length.
wordsCount(["a", "bb", "b", "ccc"], 1) ¡æ 2
wordsCount(["a", "bb", "b", "ccc"], 3) ¡æ 1
wordsCount(["a", "bb", "b", "ccc"], 4) ¡æ 0*/
public class a5_wordsCount {
	public int wordsCount(String[] words, int len) {
		  // String l="";
		  // int a=0;
		  int count=0;
		  for(int i=0; i<words.length; i++){
		    // l=words[i];
		    // a=Integer.parseInt(l);
		    // if(a==len) count++;
		    if(words[i].length()==len)count++;
		  }
		  return count;
		}
	
	// Solution
    public int swordsCount(String[] words, int len) {
        int out = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == len) out++;
        }
        return out;
    }
}
