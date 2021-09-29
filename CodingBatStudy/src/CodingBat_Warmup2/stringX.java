package CodingBat_Warmup2;
/*
 * Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.


stringX("xxHxix") ¡æ "xHix"
stringX("abxxxcd") ¡æ "abcd"
stringX("xabxxxcdx") ¡æ "xabcdx"
 */
public class stringX {
	public String stringX1(String str) {
		  String[] result=str.split("x");
		  return str;
	}
	
	// Solution
	public String stringX2(String str) {
		  String result = "";
		  for (int i=0; i<str.length(); i++) {
		    // Only append the char if it is not the "x" case
		    if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
		      result = result + str.substring(i, i+1); // Could use str.charAt(i) here
		    }
		  }
		  return result;
	}
}
