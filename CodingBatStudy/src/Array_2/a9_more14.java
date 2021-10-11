package Array_2;
/*Array-2 > more14
Given an array of ints, return true if the number of 1's is greater than the number of 4's
more14([1, 4, 1]) ¡æ true
more14([1, 4, 1, 4]) ¡æ false
more14([1, 1]) ¡æ true*/
public class a9_more14 {
	public boolean more14(int[] nums) {
		  int a=0,b=0;
		  boolean c=true;
		  for(int i=0; i<nums.length; i++){
		    if(nums[i]==1) a++;
		    if(nums[i]==4) b++;
		  }
		  if(a<=b) c=false;
		  if(a>b) c=true;
		  return c;
		}
	
	// Solution
    public boolean smore14(int[] nums) {
        int ones = 0;
        int fours = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) ones++;
            if (nums[i] == 4) fours++;
        }
        return ones > fours ? true: false;
    }
}
