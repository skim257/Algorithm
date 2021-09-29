package CodingBat_Warmup2;
/*
 * 
Given a string and a non-negative int n, return a larger string that is n copies of the original string.


stringTimes("Hi", 2) ¡æ "HiHi"
stringTimes("Hi", 3) ¡æ "HiHiHi"
stringTimes("Hi", 1) ¡æ "Hi"
 */
public class stringTimes {
	public String stringTimes1(String str, int n) {
		  String tmp="";
		  for(int i=0; i<n; i++)
		  {
		    tmp=tmp+str;
		  }
		  return tmp;
	}
	
	// Solution
	public String stringTimes2(String str, int n) {
		  String result = "";
		  for (int i=0; i<n; i++) {
		    result = result + str;  // could use += here
		  }
		  return result;
	}
}
