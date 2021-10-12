package Array_2;
/*Array-2 > sameEnds
Return true if the group of N numbers at the start and end of the array are the same.
For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2,
and false for n=1 and n=3. You may assume that n is in the range 0..nums.length inclusive.
sameEnds([5, 6, 45, 99, 13, 5, 6], 1) ¡æ false
sameEnds([5, 6, 45, 99, 13, 5, 6], 2) ¡æ true
sameEnds([5, 6, 45, 99, 13, 5, 6], 3) ¡æ false*/
public class c4_sameEnds {
	public boolean sameEnds(int[] nums, int len) {
		  for(int i=0; i<len; i++){
		    if(nums[i]==nums[nums.length-len+i])return true;
		  }
		  return false;
		}
	
	// Solution
    public boolean ssameEnds(int[] nums, int len) {
        int n = nums.length;
        boolean out = true;
        for (int i = 0; i < len; i++) {
            if (nums[i] != nums[n-len+i]) out = false;
        }
        return out;
    }
}
