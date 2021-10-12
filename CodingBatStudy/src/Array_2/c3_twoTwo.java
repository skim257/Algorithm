package Array_2;
/*Array-2 > twoTwo
Given an array of ints, return true if every 2 that appears in the array is next to another 2.
twoTwo([4, 2, 2, 3]) ¡æ true
twoTwo([2, 2, 4]) ¡æ true
twoTwo([2, 2, 4, 2]) ¡æ false*/
public class c3_twoTwo {
	public boolean twoTwo(int[] nums) {
		  boolean n=false;
		  for(int i=0; i<nums.length-1; i++){
		    if(nums[i]==2&&nums[i+1]==2)n=true;
		    if(i>0&&nums[i-1]==2&&nums[i+1]==2)n=false;
		  }
		  return n;
		}
	
	// Solution
    public boolean stwoTwo(int[] nums) {
        int len = nums.length;
        if (len == 1 && nums[0] == 2) return false;
        if (len == 2 && nums[0] == 2 && nums[1] != 2) return false;
        if (len == 2 && nums[0] != 2 && nums[1] == 2) return false;
        for (int i = 0; i < len; i++) {
            if (i == 0 && nums[i] == 2 && nums[i+1] != 2) return false;
            if (i > 0 && i < len - 1 && nums[i] == 2 && nums[i-1] != 2 && nums[i+1] != 2) return false;
            if (i == len - 1 && nums[i] == 2 && nums[i-1] != 2) return false;
        }
        return true;
    }
}
