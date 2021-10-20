package Recursion_2;
/*Recursion-2 > splitOdd10
Given an array of ints, is it possible to divide the ints into two groups, so that the sum of one group is a multiple of 10,
and the sum of the other group is odd. Every int must be in one group or the other.
Write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper from splitOdd10().
(No loops needed.)
splitOdd10([5, 5, 5]) ¡æ true
splitOdd10([5, 5, 6]) ¡æ false
splitOdd10([5, 5, 6, 1]) ¡æ true*/
public class a7_splitOdd10 {
	public boolean splitOdd10(int[] nums) {
		  return ok(0, nums, 0);
		}

		public boolean ok(int start, int[] nums, int sum){
		  if(start>=nums.length)return sum==0;
		  // else if(sum==0)return true;
		  else{
		    if(nums[start]%10==0||nums[start]%2!=0) 
		    return ok(start+1, nums, sum-nums[start]);
		    return ok(start+1, nums, sum);
		  }
		}
	
	// Solution
	    public boolean ssplitOdd10(int[] nums) {
	        return helper2(0, nums, 0, 0);
	    }

	    public boolean helper2(int start, int[] nums, int sum1, int sum2) {
	        if (start >= nums.length) return sum1 % 10 == 0 && sum2 % 2 != 0 || sum1 % 2 != 0 && sum2 % 10 == 0;
	        return helper2(start + 1, nums, sum1 + nums[start], sum2) || helper2(start + 1, nums, sum1, sum2 + nums[start]);
	    }
}
