package Recursion_1;
/*Recursion-1 > sumDigits
Given a non-negative int n, return the sum of its digits recursively (no loops).
Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
sumDigits(126) ¡æ 9
sumDigits(49) ¡æ 13
sumDigits(12) ¡æ 3*/
public class a6_sumDigits {
	public int sumDigits(int n) {
		  return (n/10)+(n%10);
		}
	
	// Solution
    public int ssumDigits(int n) {
        if (n < 10) return n;
        return n % 10 + sumDigits(n / 10);
    }
}
