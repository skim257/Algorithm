package String_1;
/*
 * Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.


nonStart("Hello", "There") ¡æ "ellohere"
nonStart("java", "code") ¡æ "avaode"
nonStart("shotl", "java") ¡æ "hotlava"
 */
public class nonStart {
	public String nonStart1(String a, String b) {
		  return a.substring(1,a.length())+b.substring(1,b.length());
	}
	
	// Solution
    public String nonStart2(String a, String b) {
        return a.substring(1) + b.substring(1);
    }
}
