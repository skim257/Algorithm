package Array_2;
/*Array-2 > centeredAverage
Return the "centered" average of an array of ints, which we'll say is the mean average of the values,
except ignoring the largest and smallest values in the array.
If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value.
Use int division to produce the final average.
You may assume that the array is length 3 or more.
centeredAverage([1, 2, 3, 4, 100]) ¡æ 3
centeredAverage([1, 1, 5, 5, 10, 8, 7]) ¡æ 5
centeredAverage([-10, -4, -2, -4, -2, 0]) ¡æ -3*/
public class a3_centeredAverage {
	public int centeredAverage(int[] nums) {
		  int cen=0;
		  if(nums.length%2==0){
		    cen=nums[nums.length/2]-1;
		  }
		  if(nums.length%2!=0){
		    cen=nums[nums.length/2];
		  }
		  return cen;
		}
	
	// Solution
    public int scenteredAverage(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            min = nums[i] < min ? nums[i] : min;
            max = nums[i] > max ? nums[i] : max;
            sum = sum + nums[i];
        }
        return (sum - (min + max)) / (nums.length - 2);
    }
}
