package Array_1;
/*Array-1 > makeEnds
Given an array of ints, return a new array length 2 containing the first and last elements from the original array.
The original array will be length 1 or more.
makeEnds([1, 2, 3]) ¡æ [1, 3]
makeEnds([1, 2, 3, 4]) ¡æ [1, 4]
makeEnds([7, 4, 6, 2]) ¡æ [7, 2]*/
public class b2_makeEnds {
	public int[] makeEnds(int[] nums) {
		  return new int[]{nums[0], nums[nums.length-1]};
		}
	
	// Solution
    public int[] smakeEnds(int[] nums) {
        if (nums.length > 0) return new int[]{nums[0], nums[nums.length - 1]};
        return new int[]{0, 0};
    }

}
