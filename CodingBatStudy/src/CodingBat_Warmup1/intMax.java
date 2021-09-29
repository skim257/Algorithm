package CodingBat_Warmup1;

public class intMax {
	public int intMax1(int a, int b, int c) {
		  if(a>b&&a>c)
		    return a;
		  else if(b>a&&b>c)
		    return b;
		  else if(c>b&&c>a)
		    return c;
		  else
		    return 0;
	}
	
	// Solution
	public int intMax2(int a, int b, int c) {
		  int max;
		  
		  // First check between a and b
		  if (a > b) {
		    max = a;
		  } else {
		    max = b;
		  }
		  
		  // Now check between max and c
		  if (c > max) {
		    max = c;
		  }
		  
		  return max;
		  
		  // Could use the built in Math.max(x, y) function which selects the larger
		  // of two values.
	}
}
