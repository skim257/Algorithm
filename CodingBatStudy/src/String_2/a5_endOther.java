package String_2;
/*String-2 > endOther
Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences
(in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.
endOther("Hiabc", "abc") ¡æ true
endOther("AbC", "HiaBc") ¡æ true
endOther("abc", "abXabc") ¡æ true*/
public class a5_endOther {
	public boolean endOther(String a, String b) {
		  String max="";
		  max=a.length()<b.length()?b:a;
		  for(int i=0; i<max.length(); i++)
		  {
		    if(a.toLowerCase().substring(a.length()-3,a.length()-1).equals("abc")
		      &&b.toLowerCase().substring(b.length()-3,b.length()-1).equals("abc"))
		      return true;
		  }
		  return false;
		}
	
	// Solution
    public boolean sendOther(String a, String b) {
        String[] str = a.length() < b.length() ? new String[]{a, b} : new String[]{b, a};
        if (str[1].substring(str[1].length() - str[0].length()).equalsIgnoreCase(str[0])) return true;
        return false;
    }
}
