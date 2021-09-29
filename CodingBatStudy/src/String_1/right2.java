package String_1;
/*
 * Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.


right2("Hello") ¡æ "loHel"
right2("java") ¡æ "vaja"
right2("Hi") ¡æ "Hi"
 */
public class right2 {
	public String right21(String str) {
		  return str.substring(str.length()-2)+
		          str.substring(0,str.length()-2);
	}
	
	// Solution
    public String right22(String str) {
        if (str.length() > 2) return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
        return str;
    }

}
