package CodingBat_Warmup2;
/*
 * 
Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).


last2("hixxhi") ¡æ 1
last2("xaxxaxaxx") ¡æ 1
last2("axxxaaxx") ¡æ 2
 */
public class a7_last2 {
	public int last21(String str) {
		  int f=0;
		  if(str.length()<3)
		  return 0;
		  String tmp1=str.substring(str.length()-2,str.length());
		  String tmp2=str.substring(str.length()-4,str.length()-2);
		  String a=tmp1.substring(0,1);
		  String b=tmp1.substring(1,tmp1.length());
		  String c=tmp2.substring(0,1);
		  String d=tmp2.substring(1,tmp2.length());
		  if(a==b&&c==d)
		  return f=2;
		  return f=1;
	}
	
	// Solution
	public int last22(String str) {
		  // Screen out too-short string case.
		  if (str.length() < 2) return 0;
		  
		  String end = str.substring(str.length()-2);
		  // Note: substring() with 1 value goes through the end of the string
		  int count = 0;
		  
		  // Check each substring length 2 starting at i
		  for (int i=0; i<str.length()-2; i++) {
		    String sub = str.substring(i, i+2);
		    if (sub.equals(end)) {  // Use .equals() with strings
		      count++;
		    }
		  }

		  return count;
	}
}
