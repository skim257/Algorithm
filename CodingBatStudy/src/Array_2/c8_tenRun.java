package Array_2;
/*Array-2 > tenRun
For each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until encountering another multiple of 10.
So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.
tenRun([2, 10, 3, 4, 20, 5]) ¡æ [2, 10, 10, 10, 20, 20]
tenRun([10, 1, 20, 2]) ¡æ [10, 10, 20, 20]
tenRun([10, 1, 9, 20]) ¡æ [10, 10, 10, 20]*/
public class c8_tenRun {
	public int[] tenRun(int[] nums) {
		  for(int i=0; i<nums.length-1; i++){
		    if(nums[i]%10==0&&nums[i+1]%10!=0){
		      nums[i+1]=nums[i];
		    }
		  }
		  return nums;
		}
	
	// Solution
    public int[] stenRun(int[] nums) {
        int ten = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 != 0 && ten != -1) nums[i] = ten;
            if (nums[i] % 10 == 0) ten = nums[i];
        }
        return nums;
    }
}
