package Array_2;
/*Array-2 > has22
Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
has22([1, 2, 2]) ¡æ true
has22([1, 2, 1, 2]) ¡æ false
has22([2, 1, 2]) ¡æ false*/
public class a6_has22 {
	public boolean has22(int[] nums) {
		  for(int i=0; i<nums.length; i++){
		    if(i<nums.length-1&&nums[i]==2&&nums[i+1]==2)
		    return true;
		  }
		  return false;
		}
	
	// Solution
    public boolean shas22(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i+1] == 2) return true;
        }
        return false;
    }
}
