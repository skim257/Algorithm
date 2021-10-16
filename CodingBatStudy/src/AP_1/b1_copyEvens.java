package AP_1;
/*AP-1 > copyEvens
Given an array of positive ints, return a new array of length "count" containing the first even numbers from the original array.
The original array will contain at least "count" even numbers.
copyEvens([3, 2, 4, 5, 8], 2) ¡æ [2, 4]
copyEvens([3, 2, 4, 5, 8], 3) ¡æ [2, 4, 8]
copyEvens([6, 1, 2, 4, 5, 8], 3) ¡æ [6, 2, 4]*/
public class b1_copyEvens {
	public int[] copyEvens(int[] nums, int count) {
		  int[] out=new int[count];
		  for(int i=0; i<count; i++){
		      if(nums[i]%2!=0) continue;
		      out[i]=nums[i];
		  }
		  return out;
		}
	
	// Solution
    public int[] scopyEvens(int[] nums, int count) {
        int n = 0;
        int[] out = new int[count];
        for (int i:nums) {
            if (n < count && i % 2 == 0) out[n++] = i;
        }
        return out;
    }
}
