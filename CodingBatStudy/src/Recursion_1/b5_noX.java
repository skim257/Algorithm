package Recursion_1;
/*Recursion-1 > noX
Given a string, compute recursively a new string where all the 'x' chars have been removed.
noX("xaxb") ¡æ "ab"
noX("abc") ¡æ "abc"
noX("xx") ¡æ ""*/
public class b5_noX {
	public String noX(String str) {
		  if(!str.contains("xx")) return str;
		  if(str.substring(0,1).equals("x")) return noX(str.substring(2));
		  return noX(str.substring(1));
		}
	
	// Solution
    public String snoX(String str) {
        if (str.length() == 0) return "";
        if (str.substring(0, 1).equals("x")) return noX(str.substring(1));
        return str.substring(0, 1) + noX(str.substring(1));
    }
}
