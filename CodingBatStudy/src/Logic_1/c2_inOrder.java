package Logic_1;
/*Logic-1 > inOrder
Given three ints, a b c, return true if b is greater than a, and c is greater than b.
However, with the exception that if "bOk" is true, b does not need to be greater than a.
inOrder(1, 2, 4, false) ¡æ true
inOrder(1, 2, 1, false) ¡æ false
inOrder(1, 1, 2, true) ¡æ true*/
public class c2_inOrder {
	public boolean inOrder(int a, int b, int c, boolean bOk) {
		  if(a<b&&b<c)
		  return true;
		  if(b<c&&bOk==true)
		  return true;
		  return false;
		}

	// Solution
    public boolean sinOrder(int a, int b, int c, boolean bOk) {
        if (b > a && c > b) return true;
        if (bOk && c > b) return true;
        return false;
    }
}
