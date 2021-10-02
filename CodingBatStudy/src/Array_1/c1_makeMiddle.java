package Array_1;
/*Array-1 > makeMiddle
Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array.
The original array will be length 2 or more.
makeMiddle([1, 2, 3, 4]) ¡æ [2, 3]
makeMiddle([7, 1, 2, 3, 4, 9]) ¡æ [2, 3]
makeMiddle([1, 2]) ¡æ [1, 2]*/
public class c1_makeMiddle {
	public int[] makeMiddle(int[] nums) {
		 int out[]={nums[nums.length/2-1], nums[nums.length/2]};
		 return out;
		}
	
	// Solution
    public int[] smakeMiddle(int[] nums) {
        return new int[]{nums[nums.length / 2 - 1], nums[nums.length / 2]};
    }
}
