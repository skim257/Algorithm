package Array_1;
/*Array-1 > sum3
Given an array of ints length 3, return the sum of all the elements.
sum3([1, 2, 3]) ¡æ 6
sum3([5, 11, 2]) ¡æ 18
sum3([7, 0, 0]) ¡æ 7*/
public class a5_sum3 {
	public int sum3(int[] nums) {
		  return nums[0]+nums[1]+nums[2];
		}
	
	// Solution
    public int ssum3(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }
}
