package CodingBat_Warmup1;

public class a2_monkeyTrouble {
	public boolean monkeyTrouble1(boolean aSmile, boolean bSmile) {
		  if(aSmile == bSmile)
		  {
		    return true;
		  }
		  return false;
	}
	
	// Solution
	public boolean monkeyTrouble2(boolean aSmile, boolean bSmile) {
		  if (aSmile && bSmile) {
		    return true;
		  }
		  if (!aSmile && !bSmile) {
		    return true;
		  }
		  return false;
		  // The above can be shortened to:
		  //   return ((aSmile && bSmile) || (!aSmile && !bSmile));
		  // Or this very short version (think about how this is the same as the above)
		  //   return (aSmile == bSmile);
		}
}
