package Array_2;
/*Array-2 > sum13
Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky,
so it does not count and numbers that come immediately after a 13 also do not count.
sum13([1, 2, 2, 1]) ¡æ 6
sum13([1, 1]) ¡æ 2
sum13([1, 2, 2, 1, 13]) ¡æ 6*/
public class a4_sum13 {
	public int sum13(int[] nums) {
		  int sum=0;
		  for(int i=0; i<nums.length; i++){
		    if(i<nums.length-2&&nums[i]==13){
		      sum+=nums[i+2];
		    }
		    if(nums[i]!=13){
		      sum+=nums[i];
		    }
		  }
		  return sum;
		}
	
	// Solution
    public int ssum13(int[] nums) {
        if (nums.length == 0) return 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i = i + 1;
                continue;
            }
            sum += nums[i];
        }
        return sum;
    }
}
