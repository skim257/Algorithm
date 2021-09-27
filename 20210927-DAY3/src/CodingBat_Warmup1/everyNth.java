package CodingBat_Warmup1;
/*
 * 
Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.


everyNth("Miracle", 2) ¡æ "Mrce"
everyNth("abcdefg", 2) ¡æ "aceg"
everyNth("abcdefg", 3) ¡æ "adg"
 */
public class everyNth {
	public String everyNth1(String str, int n) {
		  int count=0;
		  for(int i=0; i<str.length(); i=i+n)
		  {
		    
		  }
		  
		  return str;
	}
	
	// Solution
	public String everyNth2(String str, int n) {
		  String result = "";
		  
		  // Look at every nth char
		  for (int i=0; i<str.length(); i = i + n) {
		    result = result + str.charAt(i);
		  }
		  return result;
	}
}
