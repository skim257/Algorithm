package Recursion_1;
/*Recursion-1 > pairStar
Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
pairStar("hello") ¡æ "hel*lo"
pairStar("xxyy") ¡æ "x*xy*y"
pairStar("aaaa") ¡æ "a*a*a*a"*/
public class c1_pairStar {
	public String pairStar(String str) {
		  if(str.length()<2)return str;
		  if(str.substring(0,1).equals("a"))
		  return str.substring(0,1)+"*"+pairStar(str.substring(1));
		  if(str.substring(0,1).equals(str.substring(1,2)))
		  return str.substring(0,1)+"*"+str.substring(1,2)+pairStar(str.substring(2));
		  return pairStar(str);
		}
	
	// Solution
    public String spairStar(String str) {
        if (str.length() < 2) return str;
        if (str.charAt(0) == str.charAt(1)) return str.charAt(0) + "*" + pairStar(str.substring(1));
        return str.substring(0, 1) + pairStar(str.substring(1));
    }
}
