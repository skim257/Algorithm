package String_1;
/*String-1 > without2
Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning,
so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.
without2("HelloHe") ¡æ "lloHe"
without2("HelloHi") ¡æ "HelloHi"
without2("Hi") ¡æ ""*/
public class d2_without2 {
	public String without2(String str) {
		  if(str.length()==2)
		  return "";
		  if(str.length()>2&&
		    str.substring(0,2).equals(str.substring(str.length()-2)))
		  return str.substring(2);
		  return str;
		}
	
	// Solution
    public String swithout2(String str) {
        if (str.length() == 2) return "";
        if (str.length() > 2 && str.substring(0, 2).equals(str.substring(str.length() - 2))) return str.substring(2);
        return str;
    }
}
