package AP_1;
/*AP-1 > dividesSelf
We'll say that a positive int divides itself if every digit in the number divides into the number evenly.
So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly.
We'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides itself.
Note: use % to get the rightmost digit, and / to discard the rightmost digit.
dividesSelf(128) ¡æ true
dividesSelf(12) ¡æ true
dividesSelf(120) ¡æ false*/
public class a9__dividesSelf {
	public boolean dividesSelf(int n) {
		  int a=n%10;
		  if(a==0)return false;
		  return true;
		}
	
	// Solution
    public boolean sdividesSelf(int n) {
        int div = n;
        while (div > 0) {
            if (div % 10 == 0 || n % (div % 10) != 0) return false;
            div = div / 10;
        }
        return true;
    }
}
