package CodingBat_Warmup2;

import java.util.Arrays;

/*
 * Given an array of ints, return the number of 9's in the array.


arrayCount9([1, 2, 9]) ¡æ 1
arrayCount9([1, 9, 9]) ¡æ 2
arrayCount9([1, 9, 9, 3, 9]) ¡æ 3
 */
public class a8_arrayCount9 {
	public int arrayCount91(int[] nums) {
		  return Arrays.asList(nums).indexOf(9);
	}
	
	// Solution
	public int arrayCount92(int[] nums) {
		  int count = 0;
		  for (int i=0; i<nums.length; i++) {
		    if (nums[i] == 9) {
		      count++;
		    }
		  }
		  return count;
	}
}
