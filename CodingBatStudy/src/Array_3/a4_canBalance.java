package Array_3;
/*Array-3 > canBalance
Given a non-empty array, return true if there is a place to split the array so that
the sum of the numbers on one side is equal to the sum of the numbers on the other side.
canBalance([1, 1, 1, 2, 1]) ¡æ true
canBalance([2, 1, 1, 2, 1]) ¡æ false
canBalance([10, 10]) ¡æ true*/
public class a4_canBalance {
	public boolean canBalance(int[] nums) {
		  int sum=0;
		  int sum2=0;
		  if(nums.length%2==0){
		    for(int i=0; i<nums.length/2; i++){
		      sum+=nums[i];
		      for(int j=nums.length; j>nums.length/2+1; j--){
		        sum2+=nums[j];
		      }
		    }
		    if(sum==sum2)return true;
		  }
		  return false;
		}
	
	// Solution
    public boolean scanBalance(int[] nums) {
        int right = 0;
        for (int i = 0; i < nums.length; i++) {
            int left = 0;
            right += nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                left += nums[j];
            }
            if (right == left) return true;
        }
        return false;
    }
}
