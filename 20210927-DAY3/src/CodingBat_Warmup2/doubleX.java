package CodingBat_Warmup2;
/*
 * 
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".


doubleX("axxbb") ¡æ true
doubleX("axaxax") ¡æ false
doubleX("xxxxx") ¡æ true
 */
public class doubleX {
	boolean doubleX1(String str) {
		  if(str.equals("xx"))
		  return true;
		  return false;
	}
	
	// solution
	boolean doubleX2(String str) {
		  int i = str.indexOf("x");
		  if (i == -1) return false; // no "x" at all

		  // Is char at i+1 also an "x"?
		  if (i+1 >= str.length()) return false; // check i+1 in bounds?
		  return str.substring(i+1, i+2).equals("x");
		  
		  // Another approach -- .startsWith() simplifies the logic
		  // String x = str.substring(i);
		  // return x.startsWith("xx");
	}
}
