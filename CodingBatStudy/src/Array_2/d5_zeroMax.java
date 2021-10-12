package Array_2;
/*Array-2 > zeroMax
Return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array.
If there is no odd value to the right of the zero, leave the zero as a zero.
zeroMax([0, 5, 0, 3]) ¡æ [5, 5, 3, 3]
zeroMax([0, 4, 0, 3]) ¡æ [3, 4, 3, 3]
zeroMax([0, 1, 0]) ¡æ [1, 1, 0]*/
public class d5_zeroMax {
	public int[] zeroMax(int[] nums) {
		  int[] out=new int[nums.length];
		  for(int i=0; i<nums.length-1; i++){
		    if(nums[i]==0){
		      out[i]=nums[i+1];
		      out[i+1]=nums[i+1];
		      if(out[i]%2==0){
		        out[i]=nums[i+1];
		      }
		    }
		  }
		  return out;
		}
	
	// Solution
    public int[] szeroMax(int[] nums) {
        int odd = 0;
        int len = nums.length - 1;
        for (int i = len; i > -1; i--) {
            if (nums[i] % 2 != 0 && nums[i] > odd) odd = nums[i];
            if (nums[i] == 0 && odd != 0) nums[i] = odd;
        }
        return nums;
    }
}
