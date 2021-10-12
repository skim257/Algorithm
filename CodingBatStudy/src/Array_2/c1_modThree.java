package Array_2;
/*Array-2 > modThree
Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.
modThree([2, 1, 3, 5]) ¡æ true
modThree([2, 1, 2, 5]) ¡æ false
modThree([2, 4, 2, 5]) ¡æ true*/
public class c1_modThree {
	public boolean modThree(int[] nums) {
		  int even=0, odd=0;
		  for(int i=0; i<nums.length; i++){
		    if(nums[i]%2==0)even++;
		    if(nums[i]%2!=0)odd++;
		  }
		  if(even==3||odd==3)return true;
		  return false;
		}
	
	// Solution
    public boolean smodThree(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] % 2 == 0 && nums[i+1] % 2 == 0 && nums[i+2] % 2 == 0) return true;
            if (nums[i] % 2 != 0 && nums[i+1] % 2 != 0 && nums[i+2] % 2 != 0) return true;
        }
        return false;
    }
}
