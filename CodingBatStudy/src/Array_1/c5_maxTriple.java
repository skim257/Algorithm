package Array_1;
/*Array-1 > maxTriple
Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest.
The array length will be a least 1.
maxTriple([1, 2, 3]) ¡æ 3
maxTriple([1, 5, 3]) ¡æ 5
maxTriple([5, 2, 3]) ¡æ 5*/
public class c5_maxTriple {
	public int maxTriple(int[] nums) {
		  // int max=0;
		  // for(int i=0; i<nums.length; i++)
		  // {
		  //   if(max<nums[i])
		  //   max=nums[i];
		  // }
		  // return max;
		  int max=0;
		  if(nums[0]>nums[nums.length/2]&&nums[0]>nums[nums.length-1])
		    max=nums[0];

		  if(nums[nums.length/2]>nums[0]&&
		        nums[nums.length/2]>nums[nums.length-1])
		    max=nums[nums.length/2];
		  
		  if(nums[nums.length-1]>nums[nums.length/2]&&
		          nums[nums.length-1]>nums[0])
		    max=nums[nums.length-1];
		    
		  return max;
		}
	
	// solution
    public int smaxTriple(int[] nums) {
        int out = nums[0];
        if (nums.length > 1 && nums[nums.length / 2] > out) out = nums[nums.length / 2];
        if (nums.length > 1 && nums[nums.length - 1] > out) out = nums[nums.length - 1];
        return out;
    }
}
