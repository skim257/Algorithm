package CodingBat_Warmup2;
/*
 * 
Given a non-empty string like "Code" return a string like "CCoCodCode".


stringSplosion("Code") ¡æ "CCoCodCode"
stringSplosion("abc") ¡æ "aababc"
stringSplosion("ab") ¡æ "aab"
 */
public class a6_stringSplosion {
	public String stringSplosion1(String str) {
		  String tmp="";
		  for(int i=0; i<str.length()+1; i++)
		  {
		    tmp=tmp+str.substring(0,i);
		  }
		  return tmp;
	}
	
	// Solution
	public String stringSplosion2(String str) {
		  String result = "";
		  // On each iteration, add the substring of the chars 0..i
		  for (int i=0; i<str.length(); i++) {
		    result = result + str.substring(0, i+1);
		  }
		  return result;
	}
}
