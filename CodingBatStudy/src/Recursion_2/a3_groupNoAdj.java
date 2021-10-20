package Recursion_2;
/*Recursion-2 > groupNoAdj
Given an array of ints, is it possible to choose a group of some of the ints,
such that the group sums to the given target with this additional constraint:
If a value in the array is chosen to be in the group, the value immediately following it in the array must not be chosen.
(No loops needed.)
groupNoAdj(0, [2, 5, 10, 4], 12) ¡æ true
groupNoAdj(0, [2, 5, 10, 4], 14) ¡æ false
groupNoAdj(0, [2, 5, 10, 4], 7) ¡æ false*/
public class a3_groupNoAdj {
	public boolean groupNoAdj(int start, int[] nums, int target) {
		  if(start>=nums.length){
		    if(target==0)return true;
		    else return false;
		  }
		  else{
		    if(start<=nums.length-2){
		    return groupNoAdj(start+2, nums, target-nums[start])
		      || groupNoAdj(start+2, nums, target);
		    }
		    else return false;
		  }
		  /*
		    if(tartget==0)return true;
		    else if(start>=nums.length)return false;
		    else{
		      return groupNoAdj(start+1, nums, target) 
		        || groupNoAdj(start+2, nums, target-nums[start]);
		    }
		  */
		}
	
	// Solution
    public boolean sgroupNoAdj(int start, int[] nums, int target) {
        if (start >= nums.length && target == 0) return true;
        if (start < nums.length && groupNoAdj(start + 2, nums, target - nums[start])) return true;
        if (start < nums.length && groupNoAdj(start + 1, nums, target)) return true;
        return false;
    }
}
