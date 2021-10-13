package Array_3;
/*Array-3 > linearIn
Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer.
The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.
linearIn([1, 2, 4, 6], [2, 4]) ¡æ true
linearIn([1, 2, 4, 6], [2, 3, 4]) ¡æ false
linearIn([1, 2, 4, 4, 6], [2, 4]) ¡æ true*/
public class a5_linearIn {
	public boolean linearIn(int[] outer, int[] inner) {
		  for(int i=1; i<outer.length-1; i++){
		    for(int j=0; j<inner.length-1; j++){
		      if(outer[i]==inner[j]&&
		        outer[i+1]==inner[j+1])return true;
		    }
		  }
		  return false;
		}
	
	// Solution
    public boolean slinearIn(int[] outer, int[] inner) {
        int indexInner = 0;
        int indexOuter = 0;
        while (indexInner < inner.length && indexOuter < outer.length) {
            if (outer[indexOuter] == inner[indexInner]) {
                indexOuter++;
                indexInner++;
            } else indexOuter++;
        }
        return (indexInner == inner.length);
    }
}
