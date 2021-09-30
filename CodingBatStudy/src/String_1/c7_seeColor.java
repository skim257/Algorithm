package String_1;
/*String-1 > seeColor
Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
seeColor("redxx") ¡æ "red"
seeColor("xxred") ¡æ ""
seeColor("blueTimes") ¡æ "blue"*/
public class c7_seeColor {
	public String seeColor(String str) {
		  if(str.equals("red"))
		    return "red";
		  if(str.length()<=3)
		    return "";
		  if(str.substring(0,3).equals("red"))
		     return "red";
		  if(str.substring(0,4).equals("blue"))
		     return "blue";
		  return "";
		     
		}
	
	// Solution
    public String sseeColor(String str) {
        if (str.length() > 2 && str.substring(0, 3).equals("red")) return "red";
        if (str.length() > 3 && str.substring(0, 4).equals("blue")) return "blue";
        return "";
    }
}
