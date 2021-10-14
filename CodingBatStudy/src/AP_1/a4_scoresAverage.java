package AP_1;
/*AP-1 > scoresAverage
Given an array of scores, compute the int average of the first half and the second half, and return whichever is larger.
We'll say that the second half begins at index length/2. The array length will be at least 2. To practice decomposition, write a separate helper method
int average(int[] scores, int start, int end) { which computes the average of the elements between indexes start..end.
Call your helper method twice to implement scoresAverage(). Write your helper method after your scoresAverage() method in the JavaBat text area.
Normally you would compute averages with doubles, but here we use ints so the expected results are exact.
scoresAverage([2, 2, 4, 4]) ¡æ 4
scoresAverage([4, 4, 4, 2, 2, 2]) ¡æ 4
scoresAverage([3, 4, 5, 1, 2, 3]) ¡æ 4*/
public class a4_scoresAverage {
	public int scoresAverage(int[] scores) {
		  int start=0,end=0;
		  if(scores.length>2){
		    for(int i=0; i<scores.length/2; i++){
		      start+=i;
		      for(int j=scores.length/2; j<scores.length; j++){
		      end+=j;
		      }
		    }
		    start=start/(scores.length/2);
		    end=end/(scores.length/2);
		    return start<end?end:start;
		  }
		  return scores[0]<scores[1]?scores[1]:scores[0];
		}

		// public int average(int[] scores, int start, int end){
		//   return start/3<end/3?end/3:start/3;
		// }

	// Solution
    public int sscoresAverage(int[] scores) {
        int first = average(scores, 0, scores.length / 2);
        int second = average(scores, scores.length / 2, scores.length);
        return  first > second ? first : second;
    }

    public int average(int[] s, int start, int end) {
        int out = 0;
        for (int i = start; i < end; i++) {
            out += s[i];
        }
        return out / (end - start);
    }
}
