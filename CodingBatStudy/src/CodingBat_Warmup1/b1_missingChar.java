package CodingBat_Warmup1;

public class b1_missingChar {
	public String missingChar1(String str, int n) {
		  str="kitten";
		  for(int i=0; i<str.length()-1; i++)
		  {
		    str=str.substring(0,i);
		  }
		  return str;
	}
	
	// Solution
	public String missingChar2(String str, int n) {
		  String front = str.substring(0, n);
		  
		  // Start this substring at n+1 to omit the char.
		  // Can also be shortened to just str.substring(n+1)
		  // which goes through the end of the string.
		  String back = str.substring(n+1, str.length());
		  
		  return front + back;
	}
}
