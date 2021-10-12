package Array_2;
/*Array-2 > has12
Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.
has12([1, 3, 2]) ¡æ true
has12([3, 1, 2]) ¡æ true
has12([3, 1, 4, 5, 2]) ¡æ true*/
public class b9_has12 {
	public boolean has12(int[] nums) {
		  for(int i=0; i<nums.length; i++){
		    for(int j=nums.length-1; j<0; j--){
		      if(nums[i]==1&&nums[j]==2)
		      return true;
		    }
		  }
		  return false;
		}
	
	// Solution
    public boolean shas12(int[] nums) {
        int out = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) out = 1;
            if (nums[i] == 2 && out == 1) out = 2;
        }
        return out == 2 ? true : false;
    }
}
