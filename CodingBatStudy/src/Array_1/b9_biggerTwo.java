package Array_1;
/*Array-1 > biggerTwo
Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which has the largest sum.
In event of a tie, return a.
biggerTwo([1, 2], [3, 4]) ¡æ [3, 4]
biggerTwo([3, 4], [1, 2]) ¡æ [3, 4]
biggerTwo([1, 1], [1, 2]) ¡æ [1, 2]*/
public class b9_biggerTwo {
	public int[] biggerTwo(int[] a, int[] b) {
		  if(a[0]>=b[0]&&a[1]>=b[1]&&
		      a[0]>=b[1]&&a[1]>=b[0])
		  return a;
		  
		  return b;
		}
	
	// Solution
    public int[] sbiggerTwo(int[] a, int[] b) {
        int suma = a[0] + a[1];
        int sumb = b[0] + b[1];
        if (suma == sumb) return a;
        return (suma > sumb) ? a : b;
    }
}
