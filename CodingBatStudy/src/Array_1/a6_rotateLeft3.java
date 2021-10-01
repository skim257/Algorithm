package Array_1;
/*Array-1 > rotateLeft3
Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
rotateLeft3([1, 2, 3]) ¡æ [2, 3, 1]
rotateLeft3([5, 11, 9]) ¡æ [11, 9, 5]
rotateLeft3([7, 0, 0]) ¡æ [0, 0, 7]*/
public class a6_rotateLeft3 {
	public int[] rotateLeft3(int[] nums) {
		  int a=nums[0];
		  int b=nums[1];
		  int c=nums[2];
		  return new int[]{b, c, a};
		}
	
	// Solution
    public int[] srotateLeft3(int[] nums) {
        int[] out = new int[]{nums[1], nums[2], nums[0]};
        return out;
    }
}
