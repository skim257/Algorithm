package CodingBat_Warmup2;
/*
 * 
 */
public class b7_noTriples {
	public boolean noTriples1(int[] nums) {
		  for(int i=0; i<nums.length-2; i++)
		  {
		    if((nums[i]==nums[i+1])&&(nums[i+1]==nums[i+2])
		        &&(nums[i]==nums[i+2]))
		        return false;
		  }
		  return true;
	}
	
	// Solution
	public boolean noTriples2(int[] nums) {
		  // Iterate < length-2, so can use i+1 and i+2 in the loop.
		  // Return false immediately if every seeing a triple.
		  for (int i=0; i < (nums.length-2); i++) {
		    int first = nums[i];
		    if (nums[i+1]==first && nums[i+2]==first) return false;
		  }
		  
		  // If we get here ... no triples.
		  return true;
	}
}
