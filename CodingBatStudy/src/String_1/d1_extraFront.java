package String_1;
/*String-1 > extraFront
Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
The string may be any length. If there are fewer than 2 chars, use whatever is there.
extraFront("Hello") ¡æ "HeHeHe"
extraFront("ab") ¡æ "ababab"
extraFront("H") ¡æ "HHH"*/
public class d1_extraFront {
	public String extraFront(String str) {
		  if(str.length()>=2)
		  {
		    String cut=str.substring(0,2);
		    return cut+cut+cut;
		  }
		  return str+str+str;
		}
	
	// Solution
    public String sextraFront(String str) {
        String out = str.length() > 1 ? str.substring(0, 2) : str;
        return out + out + out;
    }
}
