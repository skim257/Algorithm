package Array_1;
/*Array-1 > has23
Given an int array length 2, return true if it contains a 2 or a 3.
has23([2, 5]) ¡æ true
has23([4, 3]) ¡æ true
has23([4, 5]) ¡æ false*/
public class b3_has23 {
	public boolean has23(int[] nums) {
		  if(nums[0]==2||nums[0]==3||
		      nums[nums.length-1]==2||nums[nums.length-1]==3)
		      return true;
		  return false;
		}
	
	// Solution
    public boolean shas23(int[] nums) {
        if (nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3) return true;
        return false;
    }
}
