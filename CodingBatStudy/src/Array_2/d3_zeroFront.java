package Array_2;
/*Array-2 > zeroFront
Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are grouped at the start of the array.
The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array.
zeroFront([1, 0, 0, 1]) ¡æ [0, 0, 1, 1]
zeroFront([0, 1, 1, 0, 1]) ¡æ [0, 0, 1, 1, 1]
zeroFront([1, 0]) ¡æ [0, 1]*/
public class d3_zeroFront {
	public int[] zeroFront(int[] nums) {
		  int zero=0, one=0;
		  for(int i=0; i<nums.length; i++){
		    if(nums[i]==0)zero++;
		    if(nums[i]==1)one++;
		  }
		  int[] out=new int[nums.length];
		  for(int i=0; i<one; i++){
		    out[i]=1;
		    for(int j=0; j<zero; j++){
		      out[j]=0;
		    }
		  }
		  return out;
		}
	
	// Solution
    public int[] szeroFront(int[] nums) {
        int shift = 1;
        int len = nums.length;
        int[] out = new int[len];
        for (int i = 0; i < len; i++) {
            if (nums[i] != 0) out[len - shift++] = nums[i];
        }
        return out;
    }
}
