package String_1;
/*
 * 
Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).


comboString("Hello", "hi") ¡æ "hiHellohi"
comboString("hi", "Hello") ¡æ "hiHellohi"
comboString("aaa", "b") ¡æ "baaab"
 */
public class comboString {
	public String comboString1(String a, String b) {
		  if(a.length()>b.length())
		  return b+a+b;
		  
		  return a+b+a;
	}

	// Solution
    public String comboString2(String a, String b) {
        String s = (a.length() < b.length()) ? a : b;
        String l = (a.length() > b.length()) ? a : b;
        return s + l + s;
    }
}
