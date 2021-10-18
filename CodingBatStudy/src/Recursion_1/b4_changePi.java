package Recursion_1;
/*Recursion-1 > changePi
Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".
changePi("xpix") ¡æ "x3.14x"
changePi("pipi") ¡æ "3.143.14"
changePi("pip") ¡æ "3.14p"*/
public class b4_changePi {
	public String changePi(String str) {
		  if(str.length()==0) return"";
		  if(str.substring(0,2).equals("pi")) return "3.14"+changePi(str.substring(2));
		  return str.substring(0,2)+changePi(str.substring(2));
		}
	
	// Solution
    public String schangePi(String str) {
        if (str.length() == 0) return "";
        if (str.length() > 1 && str.substring(0, 2).equals("pi")) return "3.14" + changePi(str.substring(2));
        return str.substring(0, 1) + changePi(str.substring(1));
    }
}
