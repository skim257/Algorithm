package Array_2;
/*Array-2 > notAlone
We'll say that an element in an array is "alone" if there are values before and after it, and those values are different from it.
Return a version of the given array where every instance of the given value which is alone is replaced by whichever value to its left or right is larger.
notAlone([1, 2, 3], 2) ¡æ [1, 3, 3]
notAlone([1, 2, 3, 2, 5, 2], 2) ¡æ [1, 3, 3, 5, 5, 2]
notAlone([3, 4], 3) ¡æ [3, 4]*/
public class d2_notAlone {
	public int[] notAlone(int[] nums, int val) {
		  if(nums.length<3)return nums;
		  int max=0;
		  for(int i=0; i<nums.length-1; i++){
		    if(nums.length>2&&nums[i]==val){
		      if(nums[i-1]<nums[i+1])max=nums[i+1];
		    }
		    nums[i]=max;
		  }
		  return nums;
		}
	
	// Solution
    public int[] snotAlone(int[] nums, int val) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == val && nums[i-1] != val && nums[i+1] != val) nums[i] = nums[i-1] >= nums[i+1] ? nums[i-1] : nums[i+1];
        }
        return nums;
    }
}
