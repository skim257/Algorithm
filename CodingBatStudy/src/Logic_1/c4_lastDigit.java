package Logic_1;
/*Logic-1 > lastDigit
Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative.
Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.
lastDigit(23, 19, 13) ¡æ true
lastDigit(23, 19, 12) ¡æ false
lastDigit(23, 19, 3) ¡æ true*/
public class c4_lastDigit {
	public boolean lastDigit(int a, int b, int c) {
		  return a%2==b%2||b%2==c%2||a%2==c%2?true:false;
		}
	
	 // Solution
    public boolean slastDigit(int a, int b, int c) {
        return (a % 10 == b % 10 || a % 10 == c % 10 || b % 10 == c % 10);
    }
}
