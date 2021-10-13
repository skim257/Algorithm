package Array_3;
/*Array-3 > fix34
Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is immediately followed by a 4.
Do not move the 3's, but every other number may move.
The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.
fix34([1, 3, 1, 4]) ¡æ [1, 3, 4, 1]
fix34([1, 3, 1, 4, 4, 3, 1]) ¡æ [1, 3, 4, 1, 1, 3, 4]
fix34([3, 2, 2, 4]) ¡æ [3, 4, 2, 2]*/
public class a2_fix34 {
	public int[] fix34(int[] nums) {
		  int[] out=new int[nums.length];
		  int tmp=0;
		  for(int i=0; i<nums.length; i++){
		    for(int j=nums[nums.length-1]; j<i; i--){
		      if(nums[i]==3&&nums[j]==4){
		        out[i]=3;
		        out[i+1]=4;
		        break;
		      }
		    }
		    out[i]=nums[i];
		  }
		  return out;
		}
	
	// Solution
    public int[] sfix34(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                int temp = nums[i + 1];
                nums[i + 1] = 4;
                for (int j = i + 2; j < nums.length; j++) {
                    if (nums[j] == 4) nums[j] = temp;
                }
            }
        }
        return nums;
    }
}
