package String_1;
/*
 * Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.


nTwice("Hello", 2) ¡æ "Helo"
nTwice("Chocolate", 3) ¡æ "Choate"
nTwice("Chocolate", 1) ¡æ "Ce"
 */
public class nTwice {
	public String nTwice1(String str, int n) {
		  String first=str.substring(0,n);
		  String second=str.substring(str.length()-n);
		  return first+second;
	}
	
	// Solution
    public String nTwice2(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }
}
