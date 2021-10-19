package Recursion_1;
/*Recursion-1 > endX
Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.
endX("xxre") ¡æ "rexx"
endX("xxhixx") ¡æ "hixxxx"
endX("xhixhix") ¡æ "hihixxx"*/
public class c2_endX {
	public String endX(String str) {
		  if(str.length()<2) return str;
		  if(str.substring(0,1).equals("x"))
		  return str.substring(1,2)+"x"+endX(str.substring(2));
		  return str.substring(1,2)+endX(str.substring(2));
		}
	
	// Solution
    public String sendX(String str) {
        if (str.length() == 0) return "";
        if (str.substring(0, 1).equals("x")) return endX(str.substring(1)) + str.substring(0, 1);
        return str.substring(0, 1) + endX(str.substring(1));
    }
}
