package Array_1;
/*Array-1 > midThree
Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array.
The array length will be at least 3.
midThree([1, 2, 3, 4, 5]) ¡æ [2, 3, 4]
midThree([8, 6, 7, 5, 3, 0, 9]) ¡æ [7, 5, 3]
midThree([1, 2, 3]) ¡æ [1, 2, 3]*/
public class c4_midThree {
	public int[] midThree(int[] nums) {
		  return new int[]{nums[nums.length/2-1], 
		                    nums[nums.length/2],
		                    nums[nums.length/2+1]};
		}
	
	// Solution
    public int[] smidThree(int[] nums) {
        return new int[]{nums[nums.length/2 - 1], nums[nums.length/2 ], nums[nums.length/2 + 1]};
    }
}
