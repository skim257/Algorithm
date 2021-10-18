package Recursion_1;
/*Recursion-1 > changeXY
Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.
changeXY("codex") ¡æ "codey"
changeXY("xxhixx") ¡æ "yyhiyy"
changeXY("xhixhix") ¡æ "yhiyhiy"*/
public class b3_changeXY {
	public String changeXY(String str) {
		  if(str.length()<1) return "";
		  if(str.substring(0,1).equals("x")) return "y"+changeXY(str.substring(1));
		  return changeXY(str.substring(1));
		}
	
	// Solution
    public String schangeXY(String str) {
        if (str.length() == 0) return "";
        if (str.substring(0, 1).equals("x")) return "y" + changeXY(str.substring(1));
        return str.substring(0, 1) + changeXY(str.substring(1));
    }
}
