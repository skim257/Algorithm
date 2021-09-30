package CodingBat_Warmup1;

public class b2_frontBack {
	public String frontBack1(String str) {
		  if(str.length()>1)
		  {
		  String front=str.substring(0,1);
		  String back=str.substring(str.length()-1);
		  String middle=str.substring(1,str.length()-1);
		  return back+middle+front;
		  }
		  else
		  return str;
	}
	
	// Solution
	public String frontBack2(String str) {
		  if (str.length() <= 1) return str;
		  
		  String mid = str.substring(1, str.length()-1);
		  
		  // last + mid + first
		  return str.charAt(str.length()-1) + mid + str.charAt(0);
	}
}
