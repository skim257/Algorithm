package Array_2;
/*Array-2 > pre4
Given a non-empty array of ints, return a new array containing the elements from the original array that come before the first 4 in the original array.
The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.
pre4([1, 2, 4, 1]) ¡æ [1, 2]
pre4([3, 1, 4]) ¡æ [3, 1]
pre4([1, 4, 4]) ¡æ [1]*/
public class c9_pre4 {
	public int[] pre4(int[] nums) {
		  int a=0;
		  for(int i=0; i<nums.length; i++){
		    if(nums[i]==4){
		      a=i;
		      break;
		    }
		  }
		  int[] out=new int[a];
		  for(int i=0; i<a; i++){
		    out[i]=nums[i];
		  }
		  return out;
		}
	
	// Solution
    public int[] spre4(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                int[] out = new int[i];
                for (int j = 0; j < i; j++) {
                    out[j] = nums[j];
                }
                return out;
            }
        }
        return nums;
    }
}
