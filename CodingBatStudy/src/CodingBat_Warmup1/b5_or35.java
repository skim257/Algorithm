package CodingBat_Warmup1;

public class b5_or35 {
	public boolean or351(int n) {
		  if(n%3==0||n%5==0)
		  return true;
		  else
		  return false;
	}
	
	// Solution
	public boolean or352(int n) {
		  return (n % 3 == 0) || (n % 5 == 0);
	}
}
