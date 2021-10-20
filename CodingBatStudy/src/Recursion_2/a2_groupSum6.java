package Recursion_2;
/*Recursion-2 > groupSum6
Given an array of ints, is it possible to choose a group of some of the ints, beginning at the start index,
such that the group sums to the given target? However, with the additional constraint that all 6's must be chosen.
(No loops needed.)
groupSum6(0, [5, 6, 2], 8) ¡æ true
groupSum6(0, [5, 6, 2], 9) ¡æ false
groupSum6(0, [5, 6, 2], 7) ¡æ false*/
public class a2_groupSum6 {
	public boolean groupSum6(int start, int[] nums, int target) {
		  if(target==0||target==6)return true;
		  else if(start==nums.length)return false;
		  else{
		    return groupSum6(start+1, nums, target-nums[start])
		    || groupSum6(start+1, nums, target);
		  }
		  /*
		    if(start==nums.length){
		      if(target==0)return true;
		      else return false;
		    }
		    else{
		      if(nums[start]==6) return groupSum6(start+1, nums, target-nums[start]);
		      else return groupSum6(start+1, nums, target) 
		                || groupSum6(start+1, nums, target-nums[start]);
		    }
		  */
		}
	
	// Solution
    public boolean sgroupSum6(int start, int[] nums, int target) {
        if (start >= nums.length && target == 0) return true;
        if (start < nums.length && groupSum6(start + 1, nums, target - nums[start])) return true;
        if (start < nums.length && nums[start] != 6 && groupSum6(start + 1, nums, target)) return true;
        return false;
    }
}
