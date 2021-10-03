package Logic_1;
/*Logic-1 > old35
Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator -- see Introduction to Mod
old35(3) ¡æ true
old35(10) ¡æ true
old35(15) ¡æ false*/
public class b2_old35 {
	public boolean old35(int n) {
		  if(n%3==0||n%5==0)
		  {
		    if(n%15==0)
		    return false;
		    return true;
		  }
		  return false;
		}
	
	// Solution
    public boolean sold35(int n) {
        return n % 3 == 0 && n % 5 != 0 || n % 3 != 0 && n % 5 == 0;
    }
}
