package CodingBat_Warmup1;

public class front22 {
	public String front221(String str) {
		  if(str.length()>2)
		  {
		    String tmp=str.substring(0,2);
		    return tmp+str+tmp;
		  }
		  else
		  return str+str+str;
	}
	
	// Solution
	public String front222(String str) {
		  // First figure the number of chars to take
		  int take = 2;
		  if (take > str.length()) {
		    take = str.length();
		  }
		  
		  String front = str.substring(0, take);
		  return front + str + front;
	}
}
