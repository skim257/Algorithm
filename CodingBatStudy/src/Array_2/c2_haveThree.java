package Array_2;
/*Array-2 > haveThree
Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.
haveThree([3, 1, 3, 1, 3]) ¡æ true
haveThree([3, 1, 3, 3]) ¡æ false
haveThree([3, 4, 3, 3, 4]) ¡æ false*/
public class c2_haveThree {
	public boolean haveThree(int[] nums) {
		  int count=0;
		  for(int i=0; i<nums.length-1; i++){
		    if(nums[i]==3&&nums[i+1]!=3) count++;
		  }
		  if(count==3)return true;
		  return false;
		}
	
	// Solution
    public boolean shaveThree(int[] nums) {
        int count = 0;
        int next = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) count++;
            if (i > 0 && nums[i-1] == 3 && nums[i] == 3) next++;
        }
        return count == 3 && next == 0 ? true : false;
    }
}
