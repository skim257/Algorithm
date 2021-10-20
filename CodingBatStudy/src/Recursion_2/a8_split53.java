package Recursion_2;
/*Recursion-2 > split53
Given an array of ints, is it possible to divide the ints into two groups,
so that the sum of the two groups is the same, with these constraints:
all the values that are multiple of 5 must be in one group, and all the values that
are a multiple of 3 (and not a multiple of 5) must be in the other.
(No loops needed.)
split53([1, 1]) ¡æ true
split53([1, 1, 1]) ¡æ false
split53([2, 4, 2]) ¡æ true*/
public class a8_split53 {
	public boolean split53(int[] nums) {
		  return ok(0, nums, 0, 0);
		}

		public boolean ok(int start, int[] nums, int sum1, int sum2){
		  if(start>=nums.length) return sum1==sum2;
		  return ok(start+1, nums, sum1+ nums[start], sum2) 
		  || ok(start + 1, nums, sum1, sum2 + nums[start]);
		}
		
	// Solution
	    public boolean ssplit53(int[] nums) {
	        return helper3(0, nums, 0, 0);
	    }

	    public boolean helper3(int start, int[] nums, int sum1, int sum2) {
	        if (start >= nums.length) return sum1 == sum2;
	        if (nums[start] % 5 == 0) return helper3(start + 1, nums, sum1 + nums[start], sum2);
	        if (nums[start] % 3 == 0) return helper3(start + 1, nums, sum1, sum2 + nums[start]);
	        return helper3(start + 1, nums, sum1 + nums[start], sum2) || helper3(start + 1, nums, sum1, sum2 + nums[start]);
	    }
}
