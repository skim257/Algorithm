package String_1;
/*String-1 > withoutX2
Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged.
This is a little harder than it looks.
withoutX2("xHi") ¡æ "Hi"
withoutX2("Hxi") ¡æ "Hi"
withoutX2("Hi") ¡æ "Hi"*/
public class d6_withoutX2 {
	public String withoutX2(String str) {
		  if(str.contains("x"))
		  return str;
		  
		  return str;
	}
	
	// Solution
    public String swithoutX2(String str) {
        if (str.length() > 1 && str.substring(0, 2).equals("xx")) return str.substring(2);
        if (str.length() > 1 && str.substring(1, 2).equals("x")) return str.substring(0, 1) + str.substring(2);
        if (str.length() > 0 && str.substring(0, 1).equals("x")) return str.substring(1);
        return str;
    }

}
