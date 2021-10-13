package Array_3;
/*Array-3 > countClumps
Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array.
countClumps([1, 2, 2, 3, 4, 4]) ¡æ 2
countClumps([1, 1, 2, 1, 1]) ¡æ 2
countClumps([1, 1, 1, 1, 1]) ¡æ 1*/
public class a9_countClumps {
	public int countClumps(int[] nums) {
		  int count=0;
		  for(int i=0; i<nums.length-1; i++){
		    if(nums[i]==nums[i+1])count++;
		  }
		  return count;
		}
	
	// Solution
    public int scountClumps(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++)
            if (nums[i] == nums[i + 1]) {
                count++;
                for (int j = i + 1; j < nums.length; j++)
                    if (nums[j] == nums[i]) i++;
                    else break;
            }
        return count;
    }
}
