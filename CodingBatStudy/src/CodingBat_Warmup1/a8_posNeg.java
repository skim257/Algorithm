package CodingBat_Warmup1;
/*
 * 
Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.


posNeg(1, -1, false) ¡æ true
posNeg(-1, 1, false) ¡æ true
posNeg(-4, -5, true) ¡æ true
 */
public class a8_posNeg {
	public boolean posNeg(int a, int b, boolean negative) {
		  if(a>0 && b>0)
		  {
		    negative=false;
		  }
		  else
		  {
		    negative=true;
		  }
		  return negative;
		}
	
	// Solution
	public boolean sposNeg(int a, int b, boolean negative) {
		  if (negative) {
		    return (a < 0 && b < 0);
		  }
		  else {
		    return ((a < 0 && b > 0) || (a > 0 && b < 0));
		  }
		}
}
