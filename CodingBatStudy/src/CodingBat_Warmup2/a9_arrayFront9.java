package CodingBat_Warmup2;
/*
 * 
Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.


arrayFront9([1, 2, 9, 3, 4]) ¡æ true
arrayFront9([1, 2, 3, 4, 9]) ¡æ false
arrayFront9([1, 2, 3, 4, 5]) ¡æ false
 */
public class a9_arrayFront9 {
	public boolean arrayFront91(int[] nums) {
		  boolean check=false;
		  if(nums.length>=4)
		  {
		    for(int i=0; i<=3; i++)
		    {
		      if(nums[i]==9)
		      check=true;
		    }
		  }
		  else
		  for(int i=0; i<nums.length; i++)
		  {
		    if(nums[i]==9)
		    check=true;
		  }
		  return check; 
	}
	
	// Solution
	public boolean arrayFront92(int[] nums) {
		  // First figure the end for the loop
		  int end = nums.length;
		  if (end > 4) end = 4;
		  
		  for (int i=0; i<end; i++) {
		    if (nums[i] == 9) return true;
		  }
		  
		  return false;
	}
}
