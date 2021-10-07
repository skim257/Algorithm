package String_2;
/*String-2 > doubleChar
Given a string, return a string where for every char in the original, there are two chars.
doubleChar("The") ¡æ "TThhee"
doubleChar("AAbb") ¡æ "AAAAbbbb"
doubleChar("Hi-There") ¡æ "HHii--TThheerree"*/
public class a1_doubleChar {
	public String doubleChar(String str) {
		  String out="";
		  for(int i=0; i<str.length(); i++)
		  {
		    // out=out+str.substring(i,i+1)+str.substring(i,i+1);
		    out=out+str.charAt(i)+str.charAt(i);
		  }
		  return out;
		}
	
	// Solution
	public String sdoubleChar(String str) {
		  String result = "";
		  for (int i = 0; i < str.length(); i++) {
		    result = result + str.charAt(i) + str.charAt(i);
		    // Alternately:
		    // result = result + str.substring(i, i+1) + str.substring(i, i+1);
		  }
		  return result;
		}
	
    public String ssdoubleChar(String str) {
        String out = "";
        for (int i = 0; i < str.length(); i++) {
            out = out + str.substring(i, i + 1) + str.substring(i, i + 1);
        }
        return out;
    }

}
