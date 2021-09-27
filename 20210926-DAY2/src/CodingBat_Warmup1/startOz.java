package CodingBat_Warmup1;

public class startOz {
	public String startOz1(String str) {
		  if(str.length()>2||str.substring(0,2).equals("oz"))
		    return "oz";
		  else if(str.substring(0,1).equals("o"))
		    return "o";
		  else if(str.substring(1,2).equals("z"))
		    return "z";
		  else 
		    return "";
	}
	
	// Solution
	public String startOz2(String str) {
		  String result = "";
		  
		  if (str.length() >= 1 && str.charAt(0)=='o') {
		    result = result + str.charAt(0);
		  }
		  
		  if (str.length() >= 2 && str.charAt(1)=='z') {
		    result = result + str.charAt(1);
		  }
		  
		  return result;
	}
}
