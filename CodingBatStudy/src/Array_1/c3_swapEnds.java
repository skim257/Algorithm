package Array_1;
/*Array-1 > swapEnds
Given an array of ints, swap the first and last elements in the array. Return the modified array.
The array length will be at least 1.
swapEnds([1, 2, 3, 4]) ¡æ [4, 2, 3, 1]
swapEnds([1, 2, 3]) ¡æ [3, 2, 1]
swapEnds([8, 6, 7, 9, 5]) ¡æ [5, 6, 7, 9, 8]*/
public class c3_swapEnds {
	public int[] swapEnds(int[] nums) {

		  int temp=nums[0];
		  nums[0]=nums[nums.length-1];
		  nums[nums.length-1]=temp;
		  return nums;
		}
	
	// Solution
    public int[] sswapEnds(int[] nums) {
        if (nums.length > 1) {
            int temp = nums[0];
            nums[0] = nums[nums.length - 1];
            nums[nums.length - 1] = temp;
        }
        return nums;
    }
}
