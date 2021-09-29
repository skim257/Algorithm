package CodingBat_Warmup1;

public class sleepIn {
	public boolean sleepIn2(boolean weekday, boolean vacation) {
		  if(weekday==false)
		  {
		    return true;
		  }
		  else if(weekday==true)
		  {
		    return false;
		  }
		return vacation;
	}
	
	// Solution
	public boolean sleepIn3(boolean weekday, boolean vacation) {
		  if (!weekday || vacation) {
		    return true;
		  }
		  
		  return false;
		  
		  // Solution notes: better to write "vacation" than "vacation == true"
		  // though they mean exactly the same thing.
		  // Likewise "!weekday" is better than "weekday == false".
		  // This all can be shortened to: return (!weekday || vacation);
		  // Here we just put the return-false last, or could use an if/else.
		}
}
