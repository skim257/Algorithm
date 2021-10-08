package String_2;
/*String-2 > repeatFront
Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1 characters of the string, and so on.
You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).
repeatFront("Chocolate", 4) ¡æ "ChocChoChC"
repeatFront("Chocolate", 3) ¡æ "ChoChC"
repeatFront("Ice Cream", 2) ¡æ "IcI"*/
public class b2_repeatFront {
	public String repeatFront(String str, int n) {
		  String s="";
		  for(int i=n; i>0; i--)
		  {
		    s=s+str.substring(0,i);
		  }
		  return s;
		}

	// Solution
    public String srepeatFront(String str, int n) {
        String out = "";
        for (int i = n; i > 0; i--) {
            out = out + str.substring(0, i);
        }
        return out;
    }
}
