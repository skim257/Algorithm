package String_1;
/*
 * 
Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.


extraEnd("Hello") ¡æ "lololo"
extraEnd("ab") ¡æ "ababab"
extraEnd("Hi") ¡æ "HiHiHi"
 */
public class extraEnd {
	public String extraEnd1(String str) {


		  String cut=str.substring(str.length()-2,str.length());
		  return cut+cut+cut;
		  
		  
	}
	
	// Solution
	public String extraEnd2(String str) {
		  String end = str.substring(str.length()-2);
		  return end + end + end;
		  
		  // Solution notes: the last two chars begin at index str.length()-2
		  // Here we store the chars in a local variable, which makes the code
		  // longer but simpler.
	}
}
