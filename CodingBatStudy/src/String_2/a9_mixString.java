package String_2;
/*String-2 > mixString
Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on.
Any leftover chars go at the end of the result.
mixString("abc", "xyz") ¡æ "axbycz"
mixString("Hi", "There") ¡æ "HTihere"
mixString("xxxx", "There") ¡æ "xTxhxexre"*/
public class a9_mixString {
	public String mixString(String a, String b) {
		  // String[] c="";
		  // String[] b="";
		  // for(int i=0; i<a.length(); i++)
		  // {
		  //   if()
		  // }
		  return a;
		}
	
	// Solution
    public String smixString(String a, String b) {
        String out = "";
        int len = a.length() < b.length() ? a.length() : b.length();
        for (int i = 0; i < len; i++) {
            out = out + a.substring(i, i+1) + b.substring(i, i+1);
        }
        if (a.length() > len) out = out + a.substring(len);
        if (b.length() > len) out = out + b.substring(len);
        return out;
    }
}
