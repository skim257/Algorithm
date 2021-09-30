package String_1;
/*String-1 > minCat
Given two strings, append them together (known as "concatenation") and return the result.
However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string.
So "Hello" and "Hi" yield "loHi". The strings may be any length.
minCat("Hello", "Hi") ¡æ "loHi"
minCat("Hello", "java") ¡æ "ellojava"
minCat("java", "Hello") ¡æ "javaello"*/
public class c9_minCat {
	public String minCat(String a, String b) {
		  String cut="";
		  if(a.length()<b.length())
		  {
		    cut=b.substring(b.length()-a.length());
		    return a+cut;
		  }
		  else if(a.length()>b.length())
		  {
		    cut=a.substring(a.length()-b.length());
		    return cut+b;
		  }
		  return a+b;
		}

	// Solution
    public String sminCat(String a, String b) {
        if (a.length() < b.length()) return a + b.substring(b.length() - a.length());
        if (a.length() > b.length()) return a.substring(a.length() - b.length()) + b;
        return a + b;
    }
}
