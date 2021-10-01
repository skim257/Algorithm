package Array_1;
/*Array-1 > reverse3
Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
reverse3([1, 2, 3]) ¡æ [3, 2, 1]
reverse3([5, 11, 9]) ¡æ [9, 11, 5]
reverse3([7, 0, 0]) ¡æ [0, 0, 7]*/
public class a7_reverse3 {
	public int[] reverse3(int[] nums) {
		  return new int[]{nums[nums.length-1], nums[1], nums[0]};
		}
	
	// Solution
    public int[] sreverse3(int[] nums) {
        int[] out = new int[3];
        for (int i = 0; i < nums.length; i++) {
            out[i] = nums[nums.length - (i+1)];
        }
        return out;
    }
}
