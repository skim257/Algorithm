package Array_2;
/*Array-2 > bigDiff
Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.
Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.
bigDiff([10, 3, 5, 6]) ¡æ 7
bigDiff([7, 2, 10, 9]) ¡æ 8
bigDiff([2, 10, 7, 2]) ¡æ 8*/
public class a2_bigDiff {
	public int bigDiff(int[] nums) {
		  int max=0,min=0;
		  for(int i=0; i<nums.length-1; i++){
		    min=Math.min(nums[i],nums[i+1]);
		    max=Math.max(nums[i],nums[i+1]);
		  }
		  return max-min;
		}
	
	// Solution
    public int sbigDiff(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            min = Math.min(nums[i], nums[i+1]) < min ? Math.min(nums[i], nums[i+1]) : min;
            max = Math.max(nums[i], nums[i+1]) > max ? Math.max(nums[i], nums[i+1]) : max;
        }
        return max - min;
    }
}
