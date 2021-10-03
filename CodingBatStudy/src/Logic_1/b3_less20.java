package Logic_1;
/*Logic-1 > less20
Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38 and 39 return true, but 40 returns false.
See also: Introduction to Mod
less20(18) ¡æ true
less20(19) ¡æ true
less20(20) ¡æ false*/
public class b3_less20 {
	public boolean less20(int n) {
		  if(n%20!=(n-1)%20||n%20!=(n-2)%20)
		  {
		    return false;
		  }
		  return true;
		}

	// Solution
    public boolean sless20(int n) {
        return (n + 1) % 20 == 0 || (n + 2) % 20 == 0 ? true : false;
    }
}
