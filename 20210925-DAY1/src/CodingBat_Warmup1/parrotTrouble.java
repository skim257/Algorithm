package CodingBat_Warmup1;

public class parrotTrouble {
	public boolean parrotTrouble1(boolean talking, int hour) {
		  return (talking && (hour < 7 || hour>20));
	}
	
	// Solution
	public boolean parrotTrouble2(boolean talking, int hour) {
		  return (talking && (hour < 7 || hour > 20));
		  // Need extra parenthesis around the || clause
		  // since && binds more tightly than ||
		  // && is like arithmetic *, || is like arithmetic +
	}
}
