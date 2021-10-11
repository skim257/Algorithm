package Array_2;
/*Array-2 > countEvens
Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
countEvens([2, 1, 2, 3, 4]) ¡æ 3
countEvens([2, 2, 0]) ¡æ 3
countEvens([1, 3, 5]) ¡æ 0*/
public class a1_countEvens {
	public int countEvens(int[] nums) {
		  int count=0;
		  for(int i=0; i<nums.length; i++){
		    if(nums[i]%2==0)
		    count++;
		  }
		  return count;
		}
	
	// Solution
    public int scountEvens(int[] nums) {
        int out = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) out++;
        }
        return out;
    }
}
