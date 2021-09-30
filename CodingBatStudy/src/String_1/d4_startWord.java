package String_1;
/*String-1 > startWord
Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string,
except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string.
So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.
startWord("hippo", "hi") ¡æ "hi"
startWord("hippo", "xip") ¡æ "hip"
startWord("hippo", "i") ¡æ "h"*/
public class d4_startWord {
	public String startWord(String str, String word) {
		  if(!str.contains(word))
		  return "";
		  return str.substring(0,word.length());
		}
	
	// Solution
    public String sstartWord(String str, String word) {
        if (word.length() == 1 && str.length() > 0) return str.substring(0, 1);
        if (word.length() > 1 && word.length() <= str.length() && word.substring(1).equals(str.substring(1, word.length()))) {
            return str.substring(0, 1) + word.substring(1);
        }
        return "";
    }
}
