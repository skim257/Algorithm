package CodingBat_Warmup1;

public class c1_hasTeen {
	public boolean hasTeen1(int a, int b, int c) {
		  if((a>=13&&a<=19)||(b>=13&&b<=19)||(c>=13&&c<=19))
		    return true;
		  else 
		    return false;
	}
	
	// Solution
	public boolean hasTeen2(int a, int b, int c) {
		  // Here it is written as one big expression,
		  // vs. a series of if-statements.
		  return (a>=13 && a<=19) ||
		         (b>=13 && b<=19) ||
		         (c>=13 && c<=19);
	}

}
