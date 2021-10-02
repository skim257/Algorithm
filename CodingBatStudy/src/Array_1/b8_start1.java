package Array_1;
/*Array-1 > start1
Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
start1([1, 2, 3], [1, 3]) ¡æ 2
start1([7, 2, 3], [1]) ¡æ 1
start1([1, 2], []) ¡æ 1*/
public class b8_start1 {
	public int start1(int[] a, int[] b) {
		  int count=0;
		  if(a.length>0&&a[0]==1)
		  {
		    count +=1;
		  }
		  if(b.length>0&&b[0]==1)
		  {
		    count+=1;
		    return count;
		  }
		  return count;
		}
	
	// Solution
    public int sstart1(int[] a, int[] b) {
        int out = 0;
        if (a.length > 0 && a[0] == 1) out++;
        if (b.length > 0 && b[0] == 1) out++;
        return out;
    }
}
