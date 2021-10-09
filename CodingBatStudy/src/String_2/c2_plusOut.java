package String_2;
/*String-2 > plusOut
Given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+"),
except for appearances of the word string which are preserved unchanged.
plusOut("12xy34", "xy") ¡æ "++xy++"
plusOut("12xy34", "1") ¡æ "1+++++"
plusOut("12xy34xyabcxy", "xy") ¡æ "++xy++xy+++xy"*/
public class c2_plusOut {
	public String plusOut(String str, String word) {
		  String out="";
		  int wlen=word.length();
		  for(int i=0; i<str.length()-1; i+=2){
		    if(wlen==1&&str.substring(i,i+1).equals(word))
		    out=out+word;
		    if(wlen==1&&!str.substring(i,i+1).equals(word))
		    out=out+"+";
		    if(wlen==2&&!str.substring(i,i+2).equals(word))
		    out=out+"++";
		    if(wlen==2&&str.substring(i,i+2).equals(word))
		    out=out+word;
		    // if(wlen>2&&str.substring(i,i+3).equals(word))
		    // out=out+word;
		    // if(wlen>2&&!str.substring(i,i+3).equals(word))
		    // out=out+"+++";
		  }
		  return out;
		}
	
	// Solution
    public String splusOut(String str, String word) {
        String out = "";
        for (int i = 0; i < str.length(); i++) {
            if (i + word.length() <= str.length() && str.substring(i, i + word.length()).equals(word)) {
                out += word;
                i += word.length() - 1;
            } else {
                out += "+";
            }
        }
        return out;
    }
}
