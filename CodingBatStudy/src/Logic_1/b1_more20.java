package Logic_1;
/*Logic-1 > more20
Return true if the given non-negative number is 1 or 2 more than a multiple of 20. See also: Introduction to Mod
more20(20) ¡æ false
more20(21) ¡æ true
more20(22) ¡æ true*/
public class b1_more20 {
	public boolean more20(int n) {
		  return n%20==1||n%20==2?true:false;
		}
	
	// Solution
    public boolean smore20(int n) {
        return (n - 1) % 20 == 0 || (n - 2) % 20 == 0 ? true : false;
    }
}
