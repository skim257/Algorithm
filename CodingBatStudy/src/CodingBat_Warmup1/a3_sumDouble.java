package CodingBat_Warmup1;

public class a3_sumDouble {
	public int sumDouble1(int a, int b) {
		  int sum = 0;
		  if(a==b)
		  {
		    sum = (a+b)*2;
		    return sum;
		  }
		  else
		  {
		    sum = a+b;
		    return sum;
		  }
	}
	
	// Solution
	public int sumDouble2(int a, int b) {
		  // Store the sum in a local variable
		  int sum = a + b;
		  
		  // Double it if a and b are the same
		  if (a == b) {
		    sum = sum * 2;
		  }
		  
		  return sum;
		}
}
