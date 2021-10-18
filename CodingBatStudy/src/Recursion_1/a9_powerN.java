package Recursion_1;
/*Recursion-1 > powerN
Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
powerN(3, 1) ¡æ 3
powerN(3, 2) ¡æ 9
powerN(3, 3) ¡æ 27*/
public class a9_powerN {
	public int powerN(int base, int n) {
		  if(n==0) return 0;
		  return base*powerN(base, n-1);
		}
	
	// Solution
    public int spowerN(int base, int n) {
        if (n == 0) return 1;
        return base * powerN(base, n - 1);
    }
}
