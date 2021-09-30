package String_1;
/*String-1 > conCat
Given two strings, append them together (known as "concatenation") and return the result.
However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
conCat("abc", "cat") ¡æ "abcat"
conCat("dog", "cat") ¡æ "dogcat"
conCat("abc", "") ¡æ "abc"*/
public class c5_conCat {
	public String conCat(String a, String b) {
		  if(a.length()<1 || b.length()<1)
		  return a+b;
		  if(a.substring(a.length()-1).equals(b.substring(0,1)))
		  return a.substring(0,a.length())+b.substring(1,b.length());
		  return a+b;
		}

	// Solution
    public String sconCat(String a, String b) {
        if (a.length() == 0 || b.length() == 0) return a + b;
        if (a.substring(a.length() - 1).equals(b.substring(0, 1))) return a + b.substring(1);
        return a + b;
    }
}
