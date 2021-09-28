package CodingBat_Warmup2;
/*
 * 
Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.


stringMatch("xxcaazz", "xxbaaz") ¡æ 3
stringMatch("abc", "abc") ¡æ 2
stringMatch("abc", "axc") ¡æ 0
 */
public class stringMatch {
	public int stringMatch1(String a, String b) {
		  String a1="";
		  String b1="";
		  int count=0;
		  for(int i=0; i<a.length()-1; i++)
		  {
		    a1=a.substring(i,i+1);
		    for(int j=0; j<a.length()-1; j++)
		    {
		      b1=b.substring(j,j+1);
		      if(a1.equals(b1))
		      count ++;
		    }
		  }
		  return count;
	}
	
	// Solution
	public int stringMatch2(String a, String b) {
		  // Figure which string is shorter.
		  int len = Math.min(a.length(), b.length());
		  int count = 0;
		  
		  // Look at both substrings starting at i
		  for (int i=0; i<len-1; i++) {
		    String aSub = a.substring(i, i+2);
		    String bSub = b.substring(i, i+2);
		    if (aSub.equals(bSub)) {  // Use .equals() with strings
		      count++;
		    }
		  }

		  return count;
	}
}
