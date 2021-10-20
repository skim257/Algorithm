package Recursion_2;
/*Recursion-2 > groupSumClump
Given an array of ints, is it possible to choose a group of some of the ints,
such that the group sums to the given target, with this additional constraint:
if there are numbers in the array that are adjacent and the identical value, they must either all be chosen, or none of them chosen.
For example, with the array {1, 2, 2, 2, 5, 2}, either all three 2's in the middle must be chosen or not, all as a group.
(one loop can be used to find the extent of the identical values).
groupSumClump(0, [2, 4, 8], 10) ¡æ true
groupSumClump(0, [1, 2, 4, 8, 1], 14) ¡æ true
groupSumClump(0, [2, 4, 4, 8], 14) ¡æ false*/
public class a5_groupSumClump {
	public boolean groupSumClump(int start, int[] nums, int target) {
		  if(start>=nums.length){
		    if(target==0) return true;
		    else return false;
		  }
		  else{
		    if(start+1<nums.length&&nums[start]==nums[start+1]){
		      return groupSumClump(start+1, nums, target-nums[start]-nums[start+1]) ||
		          groupSumClump(start+1, nums, target);
		    }
		    else
		    return groupSumClump(start+1, nums, target-nums[start]);
		  }
		  /*
		    if(target==0)return true;
		    else if(start>=nums.length) return false;
		    else{
		      int end=start;
		      while(end<nums.length&&nums[end]==nums[start]) end=+;
		      int length=end-start;
		      return groupSumClump(end, nums, target) || 
		        groupSumClump(end, nums, target-nums[start]*length);
		    }
		  */
		}
	
	// Solution
    public boolean sgroupSumClump(int start, int[] nums, int target) {
        if (start >= nums.length) return target == 0;
        int sum = nums[start];
        int count = 1;
        for (int i = start + 1; i < nums.length; i++) {
            if (nums[i] == nums[start]) {
                sum += nums[i];
                count++;
            }
        }
        return (start < nums.length && groupSumClump(start + count, nums, target - sum)) ||
                (start < nums.length && groupSumClump(start + count, nums, target));
    }
}
