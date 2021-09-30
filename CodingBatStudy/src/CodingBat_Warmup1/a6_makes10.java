package CodingBat_Warmup1;

public class a6_makes10 {
	public boolean makes101(int a, int b) {
		  if(a==10 || b==10) 
		  {
		    return true;
		  }
		  else if(a+b==10)
		  {
		    return true;
		  }
		  return false;
	}
	
	// Solution
	public boolean makes102(int a, int b) {
		  return (a == 10 || b == 10 || a+b == 10);
	}
}
