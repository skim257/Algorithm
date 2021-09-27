package CodingBat_Warmup1;

public class backAround {
	public String backAround1(String str) {
		  
	    char tmp=str.charAt(str.length()-1);
	    return tmp+str+tmp;
	  
	}
	
	// Solution
	public String backAround2(String str) {
		  // Get the last char
		  String last = str.substring(str.length() - 1);
		  return last + str + last;
	}
}
