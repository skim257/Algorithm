package String_1;
/*
 * 
Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.


makeOutWord("<<>>", "Yay") ¡æ "<<Yay>>"
makeOutWord("<<>>", "WooHoo") ¡æ "<<WooHoo>>"
makeOutWord("[[]]", "word") ¡æ "[[word]]"
 */
public class makeOutWord {
	public String makeOutWord1(String out, String word) {
		  String front=out.substring(0,2);
		  String back=out.substring(2,out.length());
		  return front+word+back;
	}
	
	// Solution
    public String makeOutWord2(String out, String word) {
        return out.substring(0, out.length()/2) + word + out.substring(out.length()/2);
    }
}
