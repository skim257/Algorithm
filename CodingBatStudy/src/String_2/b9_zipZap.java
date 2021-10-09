package String_2;
/*String-2 > zipZap
Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'.
Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".
zipZap("zipXzap") ¡æ "zpXzp"
zipZap("zopzop") ¡æ "zpzp"
zipZap("zzzopzop") ¡æ "zzzpzp"*/
public class b9_zipZap {
	public String zipZap(String str) {
		  String out="";
		  if(str.length()<3) return str;
		  for(int i=0; i<str.length()-2; i+=3)
		  {
		    if(str.substring(i,i+1).equals("z")&&
		        str.substring(i+2,i+3).equals("p"))
		        out=out+str.substring(i,i+1)+str.substring(i+2,i+3);
		    if(!str.substring(i,i+1).equals("z")&&
		        !str.substring(i+2,i+3).equals("p"))
		        {
		          out=out+str.substring(i,i+1);
		          return str;
		        }
		  }
		  return out;
		}
	
	// Solution
    public String szipZap(String str) {
        String out = "";
        if (str.length() < 3) return str;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals("z") && str.substring(i + 2, i + 3).equals("p")) {
                out = out + "zp";
                i = i + 2;
            } else {
                out = out + str.substring(i, i + 1);
            }
        }
        return out;
    }
}
