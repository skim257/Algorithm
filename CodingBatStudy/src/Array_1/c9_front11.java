package Array_1;
/*Array-1 > front11
Given 2 int arrays, a and b, of any length, return a new array with the first element of each array.
If either array is length 0, ignore that array.
front11([1, 2, 3], [7, 9, 8]) ¡æ [1, 7]
front11([1], [2]) ¡æ [1, 2]
front11([1, 7], []) ¡æ [1]*/
public class c9_front11 {
	public int[] front11(int[] a, int[] b) {
		  if(a.length>=1&&b.length>=1)
		  return new int[]{a[0], b[0]};
		  if(a.length>=1&&b.length<1)
		  return new int[]{a[0]};
		  if(b.length>=1&&a.length<1)
		  return new int[]{b[0]};
		  return new int[0];
		}
	
	// Solution
    public int[] sfront11(int[] a, int[] b) {
        if (a.length > 0 && b.length > 0) return new int[]{a[0], b[0]};
        if (a.length > 0) return new int[]{a[0]};
        if (b.length > 0) return new int[]{b[0]};
        return new int[]{};
    }
}
