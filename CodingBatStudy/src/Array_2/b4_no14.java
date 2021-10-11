package Array_2;
/*Array-2 > no14
Given an array of ints, return true if it contains no 1's or it contains no 4's.
no14([1, 2, 3]) ¡æ true
no14([1, 2, 3, 4]) ¡æ false
no14([2, 3, 4]) ¡æ true*/
public class b4_no14 {
	public boolean no14(int[] nums) {
		  for(int i=0; i<nums.length; i++){
		    if(nums[i]!=1&&nums[i]==4){return true;}
		    else if(nums[i]==1&&nums[i]!=4){return true;}
		    else {return false;}
		  }
		  return false;
		}
	
	// Solution
    public boolean sno14(int[] nums) {
        int ones = 0;
        int fours = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) ones++;
            if (nums[i] == 4) fours++;
        }
        return ones == 0 || fours == 0 ? true : false;
    }
}
