package String_2;
/*String-2 > prefixAgain
Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear somewhere else in the string?
Assume that the string is not empty and that N is in the range 1..str.length().
prefixAgain("abXYabc", 1) ¡æ true
prefixAgain("abXYabc", 2) ¡æ true
prefixAgain("abXYabc", 3) ¡æ false*/
public class b4_prefoxAgain {
	public boolean prefixAgain(String str, int n) {
		  String a,b,c="";
		  int count=0;
		  for(int i=0; i<str.length()-5; i++)
		  {
		    a=str.substring(i,i+2);
		    b=str.substring(i+2,i+4);
		    c=str.substring(i+4,i+6);
		    if(a==b||b==c||a==c)
		    count++;
		    if(count<=n)
		    return true;
		  }
		  return false;
		}
	
	// Solution
    public boolean sprefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        for (int i = 1; i < str.length() + 1 - n; i++) {
            if (str.substring(i, i + n).equals(prefix)) return true;
        }
        return false;
    }
}
