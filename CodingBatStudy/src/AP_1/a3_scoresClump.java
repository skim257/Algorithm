package AP_1;
/*AP-1 > scoresClump
Given an array of scores sorted in increasing order, return true if the array contains 3 adjacent scores that differ from each other by at most 2,
such as with {3, 4, 5} or {3, 5, 5}.
scoresClump([3, 4, 5]) ¡æ true
scoresClump([3, 4, 6]) ¡æ false
scoresClump([1, 3, 5, 5]) ¡æ true*/
public class a3_scoresClump {
	public boolean scoresClump(int[] scores) {
		  for(int i=0; i<scores.length; i++){
		    if(scores[i]==3){
		      for(int j=0; j<scores.length; j++){
		        if(scores[j]-3<=2)return true;
		      }
		    }
		  }
		  return false;
		  /*
		  for(int i=0; i+2<scores.length; i++){
		    if(scores[i+2]-scores[i+1]<=2&&scores[i+2]-scores[i]<=2)
		    return true;
		  }
		  return false;
		  */
		}
	
	// Solution
    public boolean sscoresClump(int[] scores) {
        for (int i = 2; i < scores.length; i++) {
            if (scores[i] - scores[i - 2] < 3) return true;
        }
        return false;
    }
}
