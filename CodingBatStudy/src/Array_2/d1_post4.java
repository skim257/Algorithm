package Array_2;
/*Array-2 > post4
Given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4 in the original array.
The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.
post4([2, 4, 1, 2]) ¡æ [1, 2]
post4([4, 1, 4, 2]) ¡æ [2]
post4([4, 4, 1, 2, 3]) ¡æ [1, 2, 3]*/
public class d1_post4 {
	public int[] post4(int[] nums) {
		  for(int i=0; i<nums.length-i; i++){
		    if(nums[i]==4){
		      int[] out=new int[nums.length-i-1];
		      for(int j=0; j<nums.length-i-1; j++){
		        out[j]=nums[nums.length-i];
		      }
		      return out;
		    }
		  }
		  return nums;
		}
	
	// Solution
    public int[] spost4(int[] nums) {
        int len = nums.length - 1;
        for (int i = len; i > -1; i--) {
            if (nums[i] == 4) {
                int[] out = new int[len - i];
                for (int j = 0; j < out.length; j++) {
                    out[j] = nums[j+i+1];
                }
                return out;
            }
        }
        return nums;
    }
}
