package Array_1;
/*Array-1 > sameFirstLast
Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
sameFirstLast([1, 2, 3]) ¡æ false
sameFirstLast([1, 2, 3, 1]) ¡æ true
sameFirstLast([1, 2, 1]) ¡æ true*/
public class a2_sameFirstLast {
	public boolean sameFirstLast(int[] nums) {
		  if(nums.length>=1&&nums[0]==nums[nums.length-1])
		  return true;
		  return false;
		}
	
	// Solution
	public boolean ssameFirstLast(int[] nums) {
		  return (nums.length >= 1 && nums[0] == nums[nums.length - 1]);
		   
		  // Solution notes: this is basically a direct translation of the problem
		  // statement. The length check needs to come first, so we don't get an
		  // error in the case that the length is 0.
		}
	
    public boolean sssameFirstLast(int[] nums) {
        if (nums.length > 0 && nums[0] == nums[nums.length - 1]) return true;
        return false;
    }
}
