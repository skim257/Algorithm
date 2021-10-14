package AP_1;
/*AP-1 > scores100
Given an array of scores, return true if there are scores of 100 next to each other in the array. The array length will be at least 2.
scores100([1, 100, 100]) ¡æ true
scores100([1, 100, 99, 100]) ¡æ false
scores100([100, 1, 100, 100]) ¡æ true*/
public class a2_scores100 {
	public boolean scores100(int[] scores) {
		  for(int i=0; i<scores.length-1; i++){
		    if(scores[i]==100&&scores[i+1]==100)return true;
		  }
		  return false;
		}
	
	// Solution
    public boolean sscores100(int[] scores) {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i - 1] == 100 && scores[i] == 100) return true;
        }
        return false;
    }
}
