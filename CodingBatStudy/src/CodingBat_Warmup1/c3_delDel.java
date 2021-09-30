package CodingBat_Warmup1;

public class c3_delDel {
	public String delDel1(String str) {
		  if(str.length()>3&&str.substring(1,4).equals("del"))
		    return str.substring(0,1)+str.substring(4,str.length());
		  else
		    return str;
	}
	
	// Solution
	public String delDel2(String str) {
		  if (str.length()>=4 && str.substring(1, 4).equals("del")) {
		    // First char + rest of string starting at 4
		    return str.substring(0, 1) + str.substring(4);
		  }
		  // Otherwise return the original string.
		  return str;
	}
}
