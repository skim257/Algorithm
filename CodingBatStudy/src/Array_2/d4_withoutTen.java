package Array_2;
/*Array-2 > withoutTen
Return a version of the given array where all the 10's have been removed.
The remaining elements should shift left towards the start of the array as needed, and the empty spaces a the end of the array should be 0.
So {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and return the given array or make a new array.
withoutTen([1, 10, 10, 2]) ¡æ [1, 2, 0, 0]
withoutTen([10, 2, 10]) ¡æ [2, 0, 0]
withoutTen([1, 99, 10]) ¡æ [1, 99, 0]*/
public class d4_withoutTen {
	public int[] withoutTen(int[] nums) {
		  int[] out=new int[nums.length];
		  int x=0;
		  for(int i=0; i<nums.length; i++){
		    if(nums[i]==10)nums[i]=0;
		    if(nums[i]!=0){
		      out[x++]=nums[i];
		    }
		  }
		  return out;
		}
	
	// Solution
    public int[] swithoutTen(int[] nums) {
        int shift = 0;
        int len = nums.length;
        int[] out = new int[len];
        for (int i = 0; i < len; i++) {
            if (nums[i] != 10) out[shift++] = nums[i];
        }
        return out;
    }
}
