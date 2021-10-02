package Array_1;
/*Array-1 > frontPiece
Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length 2,
use whatever elements are present.
frontPiece([1, 2, 3]) ¡æ [1, 2]
frontPiece([1, 2]) ¡æ [1, 2]
frontPiece([1]) ¡æ [1]*/
public class c6_frontPiece {
	public int[] frontPiece(int[] nums) {
		  if(nums.length>1)
		  return new int[]{nums[0], nums[1]};
		  return nums;
		}
	
	// Solution
    public int[] sfrontPiece(int[] nums) {
        if (nums.length > 1) return new int[]{nums[0], nums[1]};
        if (nums.length == 1) return new int[]{nums[0]};
        return nums;
    }
}
