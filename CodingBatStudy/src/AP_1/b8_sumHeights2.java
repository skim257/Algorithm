package AP_1;
/*AP-1 > sumHeights2
(A variation on the sumHeights problem.) We have an array of heights, representing the altitude along a walking trail.
Given start/end indexes into the array, return the sum of the changes for a walk beginning at the start index and ending at the end index,
however increases in height count double. For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1*2 + 5 = 7.
The start end end index will both be valid indexes into the array with start <= end.
sumHeights2([5, 3, 6, 7, 2], 2, 4) ¡æ 7
sumHeights2([5, 3, 6, 7, 2], 0, 1) ¡æ 2
sumHeights2([5, 3, 6, 7, 2], 0, 4) ¡æ 15*/
public class b8_sumHeights2 {
	public int sumHeights2(int[] heights, int start, int end) {
		  int sum=0;
		  for(int i=start; i<end; i++){
		    if(heights[i+1]>heights[i])
		    sum+=Math.abs((heights[i+1]-heights[i])*2);
		    else
		    sum+=Math.abs(heights[i+1]-heights[i]);
		  }
		  return sum;
		}
	
	 // Solution
    public int ssumHeights2(int[] heights, int start, int end) {
        int out = 0;
        for (int i = start; i < end; i++) {
            int alt = Math.abs(heights[i] - heights[i + 1]);
            if (heights[i] < heights[i + 1]) out += 2 * alt;
            if (heights[i] > heights[i + 1]) out += alt;
        }
        return out;
    }
}
