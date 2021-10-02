package Array_1;
/*Array-1 > make2
Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the elements from b.
The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.
make2([4, 5], [1, 2, 3]) ¡æ [4, 5]
make2([4], [1, 2, 3]) ¡æ [4, 1]
make2([], [1, 2]) ¡æ [1, 2]*/
public class c8_make2 {
	public int[] make2(int[] a, int[] b) {
		  if(a.length>=2)
		  return new int[]{a[0],a[1]};
		  if(a.length==1)
		  return new int[]{a[0],b[0]};
		  return new int[]{b[0],b[1]};
		}
	
	// Solution
    public int[] smake2(int[] a, int[] b) {
        if (a.length >= 2) return new int[]{a[0], a[1]};
        if (a.length == 1) return new int[]{a[0], b[0]};
        return new int[]{b[0], b[1]};
    }
}
