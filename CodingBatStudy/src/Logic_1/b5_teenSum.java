package Logic_1;
/*Logic-1 > teenSum
Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky.
So if either value is a teen, just return 19.
teenSum(3, 4) ¡æ 7
teenSum(10, 13) ¡æ 19
teenSum(13, 2) ¡æ 19*/
public class b5_teenSum {
	public int teenSum(int a, int b) {
		  return (13<=a&&a<=19)||
		          (13<=b&&b<=19)?19:a+b;
		}
	
	// Solution
    public int steenSum(int a, int b) {
        return (a > 12 && a < 20 || b > 12 && b < 20) ? 19 : a + b;
    }
}
