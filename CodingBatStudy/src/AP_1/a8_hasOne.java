package AP_1;
/*AP-1 > hasOne
Given a positive int n, return true if it contains a 1 digit. Note: use % to get the rightmost digit, and / to discard the rightmost digit.
hasOne(10) ¡æ true
hasOne(22) ¡æ false
hasOne(220) ¡æ false*/
public class a8_hasOne {
	public boolean hasOne(int n) {
		  return n%10==0?true:false;
		}
	
	// Solution
    public boolean shasOne(int n) {
        while (n > 0) {
            if (n % 10 == 1) return true;
            n = n / 10;
        }
        return false;
    }
}
