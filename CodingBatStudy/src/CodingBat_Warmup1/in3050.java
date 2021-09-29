package CodingBat_Warmup1;

public class in3050 {
	public boolean in30501(int a, int b) {
		  if((a>=30&&a<=40)&&(b>=30&&b<=40))
		    return true;
		  else if((a>=40&&a<=50)&&(b>=40&&b<=50))
		    return true;
		  else
		    return false;
	}
	
	// Solution
	public boolean in30502(int a, int b) {
		  if (a >= 30 && a <= 40 && b >= 30 && b <= 40) {
		    return true;
		  }
		  if (a >= 40 && a <= 50 && b >= 40 && b <= 50) {
		    return true;
		  }
		  return false;
		  // This could be written as one very large expression,
		  // connecting the two main parts with ||
	}
}
