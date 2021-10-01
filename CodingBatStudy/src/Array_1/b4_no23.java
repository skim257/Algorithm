package Array_1;
/*Array-1 > no23
Given an int array length 2, return true if it does not contain a 2 or 3.
no23([4, 5]) ¡æ true
no23([4, 2]) ¡æ false
no23([3, 5]) ¡æ false*/
public class b4_no23 {
	public boolean no23(int[] nums) {
		  if(!(nums[0]==2||nums[0]==3||
		      nums[nums.length-1]==2||nums[nums.length-1]==3))
		      return true;
		  return false;
		}
	
	// Solution
    public boolean sno23(int[] nums) {
        // if (!has23(nums)) return true; Uses implemented method "has23()"!
        if (nums[0] != 2 && nums[0] != 3 && nums[1] != 2 && nums[1] != 3) return true;
        return false;
    }
}
