package Logic_2;
/*Logic-2 > closeFar
Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far",
differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.
closeFar(1, 2, 10) ¡æ true
closeFar(1, 2, 3) ¡æ false
closeFar(4, 1, 3) ¡æ true*/
public class a6_closeFar {
	public boolean closeFar(int a, int b, int c) {
		  if((Math.abs(a-b)<=1 && Math.abs(a-c)>2)||
		        (Math.abs(a-c)<=1 && Math.abs(a-b)>2)) return true;
		        
		  return false;
		}
	
	// Solution
    public boolean scloseFar(int a, int b, int c) {
        if (Math.abs(b - a) < 2 && Math.abs(c - a) > 1 && Math.abs(c - b) > 1) return true;
        if (Math.abs(c - a) < 2 && Math.abs(b - a) > 1 && Math.abs(b - c) > 1) return true;
        return false;
    }
}
