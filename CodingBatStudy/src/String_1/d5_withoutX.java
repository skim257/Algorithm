package String_1;
/*String-1 > withoutX
Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
withoutX("xHix") ¡æ "Hi"
withoutX("xHi") ¡æ "Hi"
withoutX("Hxix") ¡æ "Hxi"*/
public class d5_withoutX {
	public String withoutX(String str) {
		  if(str.substring(0,1).equals("x"))
		  return str.substring(1,str.length());
		  
		  if(str.substring(str.length()-1).equals("x"))
		  return str.substring(0,str.length()-1);
		  
		  return str;
		      
	}
	
	// Solution
    public String swithoutX(String str) {
        if (str.length() > 1 && str.substring(0, 1).equals("x") && str.substring(str.length() - 1).equals("x")) return str.substring(1, str.length() - 1);
        if (str.length() > 0 && str.substring(0, 1).equals("x")) return str.substring(1, str.length());
        if (str.length() > 1 && str.substring(str.length() - 1).equals("x")) return str.substring(0, str.length() - 1);
        return str;
    }
}
