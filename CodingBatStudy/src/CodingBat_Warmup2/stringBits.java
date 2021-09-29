package CodingBat_Warmup2;
/*
 * 
Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".


stringBits("Hello") ¡æ "Hlo"
stringBits("Hi") ¡æ "H"
stringBits("Heeololeo") ¡æ "Hello"
 */
public class stringBits {
	public String stringBits1(String str) {
		  return str;
	}
	
	// Solution
	public String stringBits2(String str) {
		  String result = "";
		  // Note: the loop increments i by 2
		  for (int i=0; i<str.length(); i+=2) {
		    result = result + str.substring(i, i+1);
		    // Alternately could use str.charAt(i)
		  }
		  return result;
		}
}
