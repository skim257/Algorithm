package Logic_1;
/*Logic-1 > love6
The number 6 is a truly great number. Given two int values, a and b, return true if either one is 6. Or if their sum or difference is 6.
Note: the function Math.abs(num) computes the absolute value of a number.
love6(6, 4) ¡æ true
love6(4, 5) ¡æ false
love6(1, 5) ¡æ true*/
public class a7_love6 {
	public boolean love6(int a, int b) {
		  // int plus=Math.abs(a)+b;
		  // int minus=Math.abs(a-b);
		  // if(a==6||b==6)
		  // return true;
		  // if(plus==6)
		  // return true;
		  // if(minus==6)
		  // return true;
		  // return false;
		  int plus=0;
		  int minus=0;
		  if(a==6||b==6)
		  return true;
		  if(a<0&&b>0)
		  {plus=Math.abs(b)+a;
		  minus=a-b;}
		  if(b<0&&a>0)
		  return true;
		  return false;
		}
	
	// Solution
    public boolean slove6(int a, int b) {
        if (a == 6 || b == 6) return true;
        if (a + b == 6 || Math.abs(a - b) == 6) return true;
        return false;
    }
}
