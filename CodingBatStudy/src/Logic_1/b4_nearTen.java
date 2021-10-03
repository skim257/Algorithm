package Logic_1;
/*Logic-1 > nearTen
Given a non-negative number "num", return true if num is within 2 of a multiple of 10.
Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod
nearTen(12) ¡æ true
nearTen(17) ¡æ false
nearTen(19) ¡æ true*/
public class b4_nearTen {
	public boolean nearTen(int num) {
		  return num%10<=2||num%10>=8?true:false;
		}
	
	// Solution
    public boolean snearTen(int num) {
        if (num % 10 == 0) return true;
        if ((num + 2) % 10 == 0) return true;
        if ((num + 1) % 10 == 0) return true;
        if ((num - 1) % 10 == 0) return true;
        if ((num - 2) % 10 == 0) return true;
        return false;
    }
}
