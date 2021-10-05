package Logic_1;
/*Logic-1 > sumLimit
Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a.
If the sum has more digits than a, just return a without b.
(Note: one way to compute the number of digits of a non-negative int n is to convert it to a string with String.valueOf(n)
and then check the length of the string.)
sumLimit(2, 3) ¡æ 5
sumLimit(8, 3) ¡æ 8
sumLimit(8, 1) ¡æ 9*/
public class d3_sumLimit {
	public int sumLimit(int a, int b) {
		  int sum=a+b;
		  if(sum<a)
		  return a;
		  if(sum<b)
		  return b;
		  return sum;
		}
	
	// Solution
    public int ssumLimit(int a, int b) {
        int ab = a + b;
        int alen = String.valueOf(a).length();
        int ablen = String.valueOf(ab).length();
        return alen == ablen ? ab : a;
    }
}
