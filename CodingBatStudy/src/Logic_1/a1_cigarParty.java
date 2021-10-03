package Logic_1;
/*Logic-1 > cigarParty
When squirrels get together for a party, they like to have cigars.
A squirrel party is successful when the number of cigars is between 40 and 60, inclusive.
Unless it is the weekend, in which case there is no upper bound on the number of cigars.
Return true if the party with the given values is successful, or false otherwise.
cigarParty(30, false) ¡æ false
cigarParty(50, false) ¡æ true
cigarParty(70, true) ¡æ true*/
public class a1_cigarParty {
	public boolean cigarParty(int cigars, boolean isWeekend) {
		  if(40<=cigars && cigars<=60) 
		  return true;
		  if(cigars>=40 && isWeekend==true)
		  return true;
		  return false;
		}
	
	// Solution
	public boolean scigarParty(int cigars, boolean isWeekend) {
		  if (isWeekend) {
		    return (cigars >= 40);
		    // A longer way to write the above line:
		    // if (cigars >= 40) {
		    //   return true;
		    // } else {
		    //   return false;
		    // }
		  } else {
		    return (cigars >= 40 && cigars <= 60);
		  }
		}
	
    public boolean sscigarParty(int cigars, boolean isWeekend) {
        if (cigars > 60 && isWeekend) return true;
        if (cigars > 39 && cigars < 61) return true;
        return false;
    }
}
