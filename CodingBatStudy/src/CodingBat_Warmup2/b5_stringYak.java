package CodingBat_Warmup2;
/*
 * 
Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.


stringYak("yakpak") ¡æ "pak"
stringYak("pakyak") ¡æ "pak"
stringYak("yak123ya") ¡æ "123ya"
 */
public class b5_stringYak {
	public String stringYak1(String str) {
		  String result="";
		  for(int i=0; i<str.length(); i++)
		  {
		    if(str.substring(i,i+3).equals("yak"))
		    result=result+str.substring(1);
		  }
		  return result;
	}
	
	// Solution
	public String stringYak2(String str) {
		  String result = "";
		  
		  for (int i=0; i<str.length(); i++) {
		    // Look for i starting a "yak" -- advance i in that case
		    if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
		      i =  i + 2;
		    } else { // Otherwise do the normal append
		      result = result + str.charAt(i);
		    }
		  }
		  
		  return result;
	}
}
