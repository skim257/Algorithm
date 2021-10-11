package Array_2;
/*Array-2 > sum28
Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.
sum28([2, 3, 2, 2, 4, 2]) ¡æ true
sum28([2, 3, 2, 2, 4, 2, 2]) ¡æ false
sum28([1, 2, 3, 4]) ¡æ false*/
public class a8_sum28 {
	public boolean sum28(int[] nums) {
		  int sum=0;
		  for(int i=0; i<nums.length; i++){
		    if(nums[i]==2) sum+=nums[i];
		  }
		  if(sum==8)return true;
		  return false;
		}
	
	// Solution
    public boolean ssum28(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) count++;
        }
        if (count * 2 == 8) return true;
        return false;
    }
}
