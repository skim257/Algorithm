package Logic_1;
/*Logic-1 > in1To10
Given a number n, return true if n is in the range 1..10, inclusive. Unless "outsideMode" is true,
in which case return true if the number is less or equal to 1, or greater or equal to 10.
in1To10(5, false) ¡æ true
in1To10(11, false) ¡æ false
in1To10(11, true) ¡æ true*/
public class a8_in1To10 {
	public boolean in1To10(int n, boolean outsideMode) {
		  if(n>=1&&n<=10&&outsideMode==false)
		  return true;
		  if(n<=1&&n>=10||outsideMode==true)
		  return true;
		  return false;
		}
	
	// Solution
    public boolean sin1To10(int n, boolean outsideMode) {
        if (!outsideMode && n > 0 && n < 11) return true;
        if (outsideMode && n < 2 || outsideMode && n > 9) return true;
        return false;
    }
}
