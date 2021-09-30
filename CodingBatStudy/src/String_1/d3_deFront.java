package String_1;
/*String-1 > deFront
Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'.
The string may be any length. Harder than it looks.
deFront("Hello") ¡æ "llo"
deFront("java") ¡æ "va"
deFront("away") ¡æ "aay"*/
public class d3_deFront {
	public String deFront(String str) {    
		  if(str.substring(0,1).equals("a"))
		  return str;
		  if(str.substring(1,2).equals("b"))
		  return str.substring(1);
		  if(str.substring(0,1).equals("a")
		      &&str.substring(2,3).equals("a"))
		      return str.substring(0,1)+str.substring(2);
		  return str.substring(2,str.length());
		}
	
	// Solution
    public String sdeFront(String str) {
        String out = "";
        if (str.length() > 0 && str.substring(0, 1).equals("a")) out = out + "a";
        if (str.length() > 1 && str.substring(1, 2).equals("b")) out = out + "b";
        if (str.length() > 2) out = out + str.substring(2);
        return out;
    }
}
