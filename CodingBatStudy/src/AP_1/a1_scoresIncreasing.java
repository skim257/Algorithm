package AP_1;
/*AP-1 > scoresIncreasing
Given an array of scores, return true if each score is equal or greater than the one before. The array will be length 2 or more.
scoresIncreasing([1, 3, 4]) ¡æ true
scoresIncreasing([1, 3, 2]) ¡æ false
scoresIncreasing([1, 1, 4]) ¡æ true*/
public class a1_scoresIncreasing {
	public boolean scoresIncreasing(int[] scores) {
		  // for(int i=0; i<scores.length-1; i++){
		  //   for(int j=1; j<scores.length-1; j++){
		  //     if(scores[i]<scores[i+1]&&scores[j]<scores[j+1])
		  //     return true;
		  //   }
		  // }
		  for(int i=scores.length-1; i>0; i--){
		    if(scores[i]<scores[i-1])return false;
		  }
		  return true;
		}
	
	// Solution
    public boolean sscoresIncreasing(int[] scores) {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[i-1]) return false;
        }
        return true;
    }
}
