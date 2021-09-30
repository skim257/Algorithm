package String_1;
/*
 * 
Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.


middleTwo("string") ¡æ "ri"
middleTwo("code") ¡æ "od"
middleTwo("Practice") ¡æ "ct"
 */
public class b6_middleTwo {
	public String middleTwo1(String str) {
		  return str.substring(str.length()/2-1,str.length()/2+1);	  
	}
	
	// Solution
    public String middleTwo2(String str) {
        return str.substring(str.length()/2 - 1, str.length()/2 + 1);
    }
}
