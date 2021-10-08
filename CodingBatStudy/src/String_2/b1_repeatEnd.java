package String_2;
/*String-2 > repeatEnd
Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
You may assume that n is between 0 and the length of the string, inclusive.
repeatEnd("Hello", 3) ¡æ "llollollo"
repeatEnd("Hello", 2) ¡æ "lolo"
repeatEnd("Hello", 1) ¡æ "o"*/
public class b1_repeatEnd {
	public String repeatEnd(String str, int n) {
		  String s="";
		  for(int i=0; i<n; i++)
		  {
		    s=s+str.substring(str.length()-n,str.length());
		  }
		  return s;
		}
	
	// Solution
    public String srepeatEnd(String str, int n) {
        String out = "";
        for (int i = 0; i < n; i++) {
            out = out + str.substring(str.length() - n);
        }
        return out;
    }
}
