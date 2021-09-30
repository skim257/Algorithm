package String_1;
/*String-1 > lastChars
Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya".
If either string is length 0, use '@' for its missing char.
lastChars("last", "chars") ¡æ "ls"
lastChars("yo", "java") ¡æ "ya"
lastChars("hi", "") ¡æ "h@"*/
public class c4_lastChars {
	public String lastChars(String a, String b) {
		  if(a.length()==0&&b.length()==0)
		  return "@@";
		  if(a.length()<1)
		  return "@"+b.substring(b.length()-1);
		  if(b.length()<1)
		  return a.substring(0,1)+"@";
		  return a.substring(0,1)+b.substring(b.length()-1);
		}

	// Solution
    public String slastChars(String a, String b) {
        String aaa = a.length() > 0 ? a.substring(0, 1) : "@";
        String bbb = b.length() > 0 ? b.substring(b.length() - 1) : "@";
        return aaa + bbb;
    }
}
