package CodingBat_Warmup1;

public class c4_mixStart {
	public boolean mixStart1(String str) {
		  if(str.contains("ix"))
		    return true;
		  else
		    return false;
	}
	
	// Solution
	public boolean mixStart2(String str) {
		  // Check if string is too small
		  // (so substring() below does not go off the end)
		  if (str.length() < 3) return false;
		  
		  // Pull out length 2 string for the "ix" part
		  // (i.e. substring starting at index 1 and stopping just before 3).
		  String two = str.substring(1, 3);
		  
		  if (two.equals("ix")) {
		    return true;
		  } else {
		    return false;
		  }
		  // This last part can be shortened to just:
		  // return(two.equals("ix"));
	}
}
