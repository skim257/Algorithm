package Array_1;
/*Array-1 > makeLast
Given an int array, return a new array with double the length where its last element is the same as the original array,
and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
makeLast([4, 5, 6]) ¡æ [0, 0, 0, 0, 0, 6]
makeLast([1, 2]) ¡æ [0, 0, 0, 2]
makeLast([3]) ¡æ [0, 3]*/
public class b5_makeLast {
	public int[] makeLast(int[] nums) {
		  int[] out=new int[nums.length*2];
		  for(int i=0; i<nums.length; i++)
		  {
		    out[i]=0;
		  }
		  out[out.length-1]=nums[nums.length-1];
		  return out;
		}
	
	// Solution
	public int[] smakeLast(int[] nums) {
		  // Make a new result array with double the length
		  int[] res = new int[nums.length * 2];
		  
		  // Copy over the last element
		  res[res.length - 1] = nums[nums.length - 1];
		  return res;
		}
}
