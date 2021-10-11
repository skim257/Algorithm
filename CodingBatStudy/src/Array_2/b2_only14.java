package Array_2;
/*Array-2 > only14
Given an array of ints, return true if every element is a 1 or a 4.
only14([1, 4, 1, 4]) ¡æ true
only14([1, 4, 2, 4]) ¡æ false
only14([1, 1]) ¡æ true*/
public class b2_only14 {
	public boolean only14(int[] nums) {
		  int one=0, four=0;
		 for(int i=0; i<nums.length; i++){
		   if(nums[i]==1) one++;
		   if(nums[i]==4) four++;
		 } 
		 if(one==four) return true;
		 if(one%2==0&&four%2==0) return true;
		 return false;
		}
	
	// Solution
    public boolean sonly14(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1 && nums[i] != 4) return false;
        }
        return true;
    }
}
