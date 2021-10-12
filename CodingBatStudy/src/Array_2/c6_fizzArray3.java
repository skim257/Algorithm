package Array_2;
/*Array-2 > fizzArray3
Given start and end numbers, return a new array containing the sequence of integers from start up to but not including end,
so start=5 and end=10 yields {5, 6, 7, 8, 9}. The end number will be greater or equal to the start number. Note that a length-0 array is valid.
(See also: FizzBuzz Code)
fizzArray3(5, 10) ¡æ [5, 6, 7, 8, 9]
fizzArray3(11, 18) ¡æ [11, 12, 13, 14, 15, 16, 17]
fizzArray3(1, 3) ¡æ [1, 2]*/
public class c6_fizzArray3 {
	public int[] fizzArray3(int start, int end) {
		  int a=end-start;
		  int[] out=new int[a];
		  for(int i=0; i<a; i++){
		    out[i]=start+i;
		  }
		  return out;
		}
	
	// Solution
    public int[] sfizzArray3(int start, int end) {
        int len = end - start;
        int[] out = new int[len];
        for (int i = 0; i < len; i++) {
            out[i] = start++;
        }
        return out;
    }
}
