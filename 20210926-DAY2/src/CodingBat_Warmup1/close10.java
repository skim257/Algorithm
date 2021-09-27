package CodingBat_Warmup1;

public class close10 {
	public int close101(int a, int b) {
		  int tmp1=(Math.abs(10-a));
		  int tmp2=(Math.abs(10-b));
		  int max;
		  if(tmp1<tmp2)
		  max=a;
		  else if(tmp1>tmp2)
		  max=b;
		  else
		  max=0;
		  return max;
	}
	
	// Solution
	public int close102(int a, int b) {
		  int aDiff = Math.abs(a - 10);
		  int bDiff = Math.abs(b - 10);
		  
		  if (aDiff < bDiff) {
		    return a;
		  }
		  if (bDiff < aDiff) {
		    return b;
		  }
		  return 0;  // i.e. aDiff == bDiff
		  
		  // Solution notes: aDiff/bDiff local vars clean the code up a bit.
		  // Could have "else" before the second if and the return 0.
	}
}
