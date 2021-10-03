package Logic_1;
/*Logic-1 > specialEleven
We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11.
Return true if the given non-negative number is special. Use the % "mod" operator -- see Introduction to Mod
specialEleven(22) ¡æ true
specialEleven(23) ¡æ true
specialEleven(24) ¡æ false*/
public class a9_specialEleven {
	public boolean specialEleven(int n) {
		  if(n%11==0||n%11==1)
		  return true;
		  return false;
		}

	// Solution
    public boolean sspecialEleven(int n) {
        return n % 11 == 0 || (n - 1) % 11 == 0 ? true : false;
    }
}
