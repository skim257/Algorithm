package CodingBat_Warmup1;

public class b7_startHi {
	public boolean startHi1(String str) {
		  if(str.startsWith("hi"))
		    return true;
		  else
		    return false;
	}
	
	// Solution
	public boolean startHi2(String str) {
		  // First test if the string is not at least length 2
		  // (so the substring() below does not go past the end).
		  if (str.length() < 2) return false;
		  
		  // Pull out the string of the first two chars
		  String firstTwo = str.substring(0, 2);
		  
		  // Test if it is equal to "hi"
		  if (firstTwo.equals("hi")) {
		    return true;
		  } else {
		    return false;
		  }
		  // This last part can be shortened to: return(firstTwo.equals("hi"));
	}
}
