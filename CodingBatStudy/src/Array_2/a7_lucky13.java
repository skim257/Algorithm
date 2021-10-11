package Array_2;
/*Array-2 > lucky13
Given an array of ints, return true if the array contains no 1's and no 3's.
lucky13([0, 2, 4]) ¡æ true
lucky13([1, 2, 3]) ¡æ false
lucky13([1, 2, 4]) ¡æ false*/
public class a7_lucky13 {
	public boolean lucky13(int[] nums) {
		  for(int i=0; i<nums.length; i++){
		    if(nums[i]==1||nums[i]==3)
		    return false;
		  }
		  return true;
		}
	
	// Solution
    public boolean slucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) return false;
        }
        return true;
    }
}
