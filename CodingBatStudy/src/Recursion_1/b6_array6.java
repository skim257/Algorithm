package Recursion_1;
/*Recursion-1 > array6
Given an array of ints, compute recursively if the array contains a 6.
We'll use the convention of considering only the part of the array that begins at the given index.
In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
array6([1, 6, 4], 0) ¡æ true
array6([1, 4], 0) ¡æ false
array6([6], 0) ¡æ true*/
public class b6_array6 {
	public boolean array6(int[] nums, int index) {
		  if(nums.length==0)return false;
		  // if(array6(nums[1], index))return true;
		  return false;
		}
	
	// Solution
    public boolean sarray6(int[] nums, int index) {
        if (nums.length == 0) return false;
        if (index == nums.length - 1) return nums[index] == 6;
        if (nums[index] == 6) return true;
        return array6(nums, index + 1);
    }
}
