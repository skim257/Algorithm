package Array_1;
/*Array-1 > maxEnd3
Given an array of ints length 3, figure out which is larger, the first or last element in the array,
and set all the other elements to be that value.
Return the changed array.
maxEnd3([1, 2, 3]) ¡æ [3, 3, 3]
maxEnd3([11, 5, 9]) ¡æ [11, 11, 11]
maxEnd3([2, 11, 3]) ¡æ [3, 3, 3]*/
public class a8_maxEnd3 {
	public int[] maxEnd3(int[] nums) {
		/*  int max=nums[0];
		  for(int i=0;i<nums.length; i++)
		  {
		    if(max<nums[i])
		    max=nums[i];
		  }
		  return new int[]{max, max, max};*/

		  int x=nums[0]>nums[nums.length-1]?nums[0]:nums[nums.length-1];
		  return new int[]{x, x, x};
		}
	
	// Solution
	public int[] smaxEnd3(int[] nums) {
		  int max = Math.max(nums[0], nums[2]);
		  nums[0] = max;
		  nums[1] = max;
		  nums[2] = max;
		  return nums;
		  
		  // Solution notes: you could write if-logic to figure out
		  // which element is the biggest, but here we use Math.max()
		  // to solve that part nicely.
		}
	
    public int[] ssmaxEnd3(int[] nums) {
        int x = nums[0] > nums[nums.length-1] ? nums[0] : nums[nums.length-1];
        return new int[]{x, x, x};
    }
}
