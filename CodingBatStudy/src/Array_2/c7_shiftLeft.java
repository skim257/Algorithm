package Array_2;
/*Array-2 > shiftLeft
Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and return the given array, or return a new array.
shiftLeft([6, 2, 5, 3]) ¡æ [2, 5, 3, 6]
shiftLeft([1, 2]) ¡æ [2, 1]
shiftLeft([1]) ¡æ [1]*/
public class c7_shiftLeft {
	public int[] shiftLeft(int[] nums) {
		  int tmp=0;
		  for(int i=0; i<nums.length-1; i++){
		    tmp=nums[i];
		    nums[i]=nums[i+1];
		    nums[i+1]=tmp;
		  }
		  return nums;
		}
	
	// Solution
    public int[] sshiftLeft(int[] nums) {
        if (nums.length < 2) return nums;
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i+1] ^= (nums[i] ^= nums[i+1]);
            nums[i] ^= nums[i+1];
        }
        return nums;
    }
}
