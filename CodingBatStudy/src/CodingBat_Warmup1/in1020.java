package CodingBat_Warmup1;

public class in1020 {
	public boolean in10201(int a, int b) {
		  if((a>=10 && a<=20)||(b>=10 && b<=20))
		    return true;
		  else 
		    return false;
	}
	
	// Solution
	public boolean in10202(int a, int b) {
		  return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
	}
}
