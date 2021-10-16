package AP_1;
/*AP-1 > sumHeights
We have an array of heights, representing the altitude along a walking trail. Given start/end indexes into the array,
return the sum of the changes for a walk beginning at the start index and ending at the end index.
For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1 + 5 = 6.
The start end end index will both be valid indexes into the array with start <= end.
sumHeights([5, 3, 6, 7, 2], 2, 4) ¡æ 6
sumHeights([5, 3, 6, 7, 2], 0, 1) ¡æ 2
sumHeights([5, 3, 6, 7, 2], 0, 4) ¡æ 11*/
public class b7_sumHeights {
	public int sumHeights(int[] heights, int start, int end) {
		  int out=0;
		  for(int i=start; i<heights.length; i++){
		    if(i<end)out+=Math.abs(heights[i+1]-heights[i]);
		  }
		  return out;
		}
	
	// Solution
    public int ssumHeights(int[] heights, int start, int end) {
        int out = 0;
        for (int i = start; i < end; i++) {
            out = out + Math.abs(heights[i] - heights[i + 1]);
        }
        return out;
    }
}
