package String_1;
/*
 * 
Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".


firstHalf("WooHoo") ¡æ "Woo"
firstHalf("HelloThere") ¡æ "Hello"
firstHalf("abcdef") ¡æ "abc"
 */
public class a7_firstHalf {
	public String firstHalf1(String str) {
		  return str.substring(0,str.length()/2);
	}
	
	// Solution
    public String firstHalf2(String str) {
        return str.substring(0, str.length()/2);
    }
}
