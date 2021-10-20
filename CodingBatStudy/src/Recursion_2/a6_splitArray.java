package Recursion_2;
/*Recursion-2 > splitArray
Given an array of ints, is it possible to divide the ints into two groups, so that the sums of the two groups are the same.
Every int must be in one group or the other. Write a recursive helper method that takes whatever arguments you like,
and make the initial call to your recursive helper from splitArray(). (No loops needed.)
splitArray([2, 2]) ¡æ true
splitArray([2, 3]) ¡æ false
splitArray([5, 2, 3]) ¡æ true*/
public class a6_splitArray {
	public boolean splitArray(int[] nums) {
		  return ok(0, nums, 0, 0);
		}

		public boolean ok(int start, int[] nums, int sum1, int sum2){
		  if(nums.length<=start) return false;
		  else{
		    if(start+1<nums.length&&nums[start]==nums[start+1]) 
		    return true;
		  }
		  return true;
		}
	
	// Solution
	    public boolean ssplitArray(int[] nums) {
	        return helper1(0, nums, 0, 0);
	    }

	    public boolean helper1(int start, int[] nums, int sum1, int sum2) {
	        if (start >= nums.length) return sum1 == sum2;
	        return helper1(start + 1, nums, sum1 + nums[start], sum2) || helper1(start + 1, nums, sum1, sum2 + nums[start]);
	    }
}
