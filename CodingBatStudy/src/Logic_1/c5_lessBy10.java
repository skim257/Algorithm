package Logic_1;
/*Logic-1 > lessBy10
Given three ints, a b c, return true if one of them is 10 or more less than one of the others.
lessBy10(1, 7, 11) ¡æ true
lessBy10(1, 7, 10) ¡æ false
lessBy10(11, 1, 7) ¡æ true*/
public class c5_lessBy10 {
	public boolean lessBy10(int a, int b, int c) {
		  return Math.abs(a)>10||
		        Math.abs(b)>10||Math.abs(c)>10?true:false;
		}
	
	// Solution
	public boolean slessBy10(int a, int b, int c) {
		  return (Math.abs(a - b) >= 10 ||
		          Math.abs(b - c) >= 10 ||
		          Math.abs(a - c) >= 10);
		  
		  // Solution notes: it's a bit surprising that this can be so short.
		  // We simplify by using Math.abs() to take the absolute value --
		  // say with the ab pair, one is smaller and one is bigger, but we don't
		  // care which is which, since we are just looking for a difference
		  // of 10 or more.
		}
}
