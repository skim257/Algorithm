package CodingBat_Warmup1;
/*
 * 
Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.


nearHundred(93) ¡æ true
nearHundred(90) ¡æ true
nearHundred(89) ¡æ false
 */
public class a7_nearHundread {
	public boolean nearHundred(int n) {
		  Boolean s=true;
		  for(int i=10; i<200; i++)
		  {
		    if(i>90)
		    {
		      s=true;
		    }
		    else if(i<90)
		    {
		      s=false;
		    }
		  }
		  
		  return s;

		}

	// Solution
	public boolean snearHundred(int n) {
		  return ((Math.abs(100 - n) <= 10) ||
		    (Math.abs(200 - n) <= 10));
		}
}
