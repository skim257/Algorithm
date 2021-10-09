package String_2;
/*String-2 > starOut
Return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone.
So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
starOut("ab*cd") ¡æ "ad"
starOut("ab**cd") ¡æ "ad"
starOut("sm*eilly") ¡æ "silly"*/
public class c1_starOut {
	public String starOut(String str) {
		  int a=str.indexOf("*");
		  int b=str.lastIndexOf("*");
		  String out="";
		  if(b==0)
		  {
		    out=str.substring(0,a)+str.substring(a+1,str.length()-1);
		  }
		  if(b>=1)
		  {
		    out=str.substring(0,a)+str.substring(b+1,str.length());
		  }
		  return out;
		}
	
	// Solution
    public String sstarOut(String str) {
        String out = "";
        int len = str.length();
        if (len == 0) return str;
        if (len == 1 && !str.equals("*")) return str;
        if (len == 2 && !str.substring(0, 1).equals("*") && !str.substring(1, 2).equals("*")) return str;
        for (int i = 0; i < len; i++) {
            if (str.substring(i, i+1).equals("*")) {
                i += 1;
                continue;
            }
            if (i < len-1 && str.substring(i+1, i+2).equals("*")) {
                i += 2;
                continue;
            }
            if (i == 0 && !str.substring(i, i+1).equals("*") && !str.substring(i+1, i+2).equals("*")) out = out + str.substring(i, i+1);
            if (i > 0 && i < len-1 && !str.substring(i-1, i).equals("*") && !str.substring(i, i+1).equals("*") && !str.substring(i+1, i+2).equals("*")) out = out + str.substring(i, i+1);
            if (i == len-1 && !str.substring(i, i+1).equals("*")) out = out + str.substring(i, i+1);
        }
        return out;
    }
}
