package CodingBat_Warmup1;

public class b3_front3 {
	public String front31(String str) {
		  if(str.length()>3)
		  {
		  str=str.substring(0,3);
		  return str+str+str;
		  }
		  else
		  return str+str+str;
	}
	
	// Solution
	public String front32(String str) {
		  String front;
		  
		  if (str.length() >= 3) {
		    front = str.substring(0, 3);
		  }
		  else {
		    front = str;
		  }

		  return front + front + front;
	}

}
