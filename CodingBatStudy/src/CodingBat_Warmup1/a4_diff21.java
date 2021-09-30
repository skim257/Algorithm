package CodingBat_Warmup1;

public class a4_diff21 {
	public int diff211(int n) {
		  int dif =0;
		  if(n<=21)
		  {
		    dif = 21-n;
		    return dif;
		  }
		  else
		  {
		    dif = (n-21)*2;
		    return dif;
		  }
	}
	
	// Solution
	public int diff212(int n) {
		  if (n <= 21) {
		    return 21 - n;
		  } else {
		    return (n - 21) * 2;
		  }
	}
}
