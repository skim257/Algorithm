package AP_1;
/*AP-1 > bigHeights
(A variation on the sumHeights problem.) We have an array of heights, representing the altitude along a walking trail.
Given start/end indexes into the array, return the number of "big" steps for a walk starting at the start index and ending at the end index.
We'll say that step is big if it is 5 or more up or down. The start end end index will both be valid indexes into the array with start <= end.
bigHeights([5, 3, 6, 7, 2], 2, 4) ¡æ 1
bigHeights([5, 3, 6, 7, 2], 0, 1) ¡æ 0
bigHeights([5, 3, 6, 7, 2], 0, 4) ¡æ 1*/
public class b9_bigHeights {
	public int bigHeights(int[] heights, int start, int end) {
		  int out=0;
		  for(int i=start; i<end; i++){
		    if(Math.abs(heights[i+1]-heights[i])>4)out+=1;
		  }
		  return out;
		}
	
	// Solution
    public int sbigHeights(int[] heights, int start, int end) {
        int out = 0;
        for (int i = start; i < end; i++) {
            int alt = Math.abs(heights[i] - heights[i + 1]);
            if (alt > 4) out++;
        }
        return out;
    }
}
