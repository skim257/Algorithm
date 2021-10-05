package Logic_1;
/*Logic-1 > inOrderEqual
Given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7.
However, with the exception that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5.
inOrderEqual(2, 5, 11, false) ¡æ true
inOrderEqual(5, 7, 6, false) ¡æ false
inOrderEqual(5, 5, 7, true) ¡æ true*/
public class c3_inOrderEqual {
	public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		  if(a<b&&b<c)
		  return true;
		  if(equalOk&&(a==b||b==c)&&(a<b||b<c))
		  return true;
		  if(a==b&&b==c)
		  return true;
		  return false;
		}
	
	// Solution
    public boolean sinOrderEqual(int a, int b, int c, boolean equalOk) {
        if (b > a && c > b) return true;
        if (b >= a && c >= b && equalOk) return true;
        return false;
    }
}
