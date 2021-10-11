package String_3;
/*String-3 > countTriple
We'll say that a "triple" in a string is a char appearing three times in a row. Return the number of triples in the given string.
The triples may overlap.
countTriple("abcXXXabc") ¡æ 1
countTriple("xxxabyyyycd") ¡æ 3
countTriple("a") ¡æ 0*/
public class a5_countTriple {
	public int countTriple(String str) {
		  int count=0;
		  for(int i=0; i<str.length(); i++){
		    if(str.length()==0&&
		    str.substring(i,i+1).equals(str.substring(i+1,i+2))&&
		    str.substring(i+1,i+2).equals(str.substring(i+2,i+3)))
		    count++;
		    if(i<str.length()-2&&
		    str.substring(i,i+1).equals(str.substring(i+1,i+2))&&
		    str.substring(i+1,i+2).equals(str.substring(i+2,i+3)))
		    count++;
		    if(i==str.length()&&
		    str.substring(i-1).equals(str.substring(i-2,i-3))&&
		    str.substring(i-2,i-3).equals(str.substring(i-3,i-4)))
		    count++;
		  }
		  return count;
		}
	
	// Solution
    public int scountTriple(String str) {
        int out = 0;
        for (int i = 0; i + 2 < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i+1) && str.charAt(i+1) == str.charAt(i+2)) out++;
        }
        return out;
    }
}
