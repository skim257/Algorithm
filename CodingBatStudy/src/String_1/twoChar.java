package String_1;
/*
 * 
Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.


twoChar("java", 0) ¡æ "ja"
twoChar("java", 2) ¡æ "va"
twoChar("java", 3) ¡æ "ja"
 */
public class twoChar {
	public String twoChar1(String str, int index) {
		  int a=Math.abs(index);
		  
		  if(str.length()<=a)
		  return str.substring(0,2);
		  
		  return str.substring(a,a+2);
	}
	
	// solution
    public String twoChar2(String str, int n) {
        if (n >= 0 && n <= str.length() - 2) return str.substring(n, n + 2);
        if (str.length() > 2) return str.substring(0, 2);
        return str;
    }
}
