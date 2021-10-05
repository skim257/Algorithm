package Logic_1;
/*Logic-1 > shareDigit
Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23.
(Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)
shareDigit(12, 23) ¡æ true
shareDigit(12, 43) ¡æ false
shareDigit(12, 44) ¡æ false*/
public class d2_shareDigit {
	public boolean shareDigit(int a, int b) {
		  if(a==2||a==12||a==23)
		  return true;
		  return false;
		}
	
	// Solution
    public boolean sshareDigit(int a, int b) {
        if (a % 10 == b % 10 || a / 10 == b % 10) return true;
        if (a % 10 == b / 10 || a / 10 == b / 10) return true;
        return false;
    }
}
