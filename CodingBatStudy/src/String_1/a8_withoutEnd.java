package String_1;
/*
 * 
Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.


withoutEnd("Hello") ¡æ "ell"
withoutEnd("java") ¡æ "av"
withoutEnd("coding") ¡æ "odin"
 */
public class a8_withoutEnd {
	public String withoutEnd1(String str) {
		  return str.substring(1,str.length()-1);
	}
	
	// Solution
    public String withoutEnd2(String str) {
        return str.substring(1, str.length()-1);
    }
}
