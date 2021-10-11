package Array_2;
/*Array-2 > sum67
Return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7
(every 6 will be followed by at least one 7). Return 0 for no numbers.
sum67([1, 2, 2]) ¡æ 5
sum67([1, 2, 2, 6, 99, 99, 7]) ¡æ 5
sum67([1, 1, 6, 7, 2]) ¡æ 4*/
public class a5_sum67 {
	public int sum67(int[] nums) {
		  int sum=0;
		  for(int i=0; i<nums.length; i++){
		    if(i<nums.length-2&&nums[i]==6){
		      if(nums[i+1]==7){
		        sum+=nums[i+2];
		      }
		    }
		    else{
		      sum+=nums[i];
		    }
		  }
		  return sum;
		}
	
	// Solution
    public int ssum67(int[] nums) {
        int flag = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 6) flag = 1;
            if (flag == 0) count = count + nums[i];
            if (nums[i] == 7) flag = 0;
        }
        return count;
    }
}
