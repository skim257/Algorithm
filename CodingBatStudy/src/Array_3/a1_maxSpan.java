package Array_3;
/*Array-3 > maxSpan
Consider the leftmost and righmost appearances of some value in an array.
We'll say that the "span" is the number of elements between the two inclusive.
A single value has a span of 1. Returns the largest span found in the given array.
(Efficiency is not a priority.)
maxSpan([1, 2, 1, 1, 3]) ¡æ 4
maxSpan([1, 4, 2, 1, 4, 1, 4]) ¡æ 6
maxSpan([1, 4, 2, 1, 4, 4, 4]) ¡æ 6*/
public class a1_maxSpan {
	public int maxSpan(int[] nums) {
		  int span=0;
		  for(int i=0; i<nums.length; i++){
		    for(int j=0;j<i; j++){
		      if(nums[i]==nums[j]){
		        span=(nums.length-j)-(nums.length-i)+1;
		      }
		    }
		  }
		  return span;
		}
	
	// Solution
    public int smaxSpan(int[] nums) {
        if (nums.length > 0) {
            int max = 1;
            for (int i = 0; i < nums.length; i++) {
                for (int j = nums.length - 1; j > i; j--) {
                    if (nums[j] == nums[i]) {
                        int span = j - i + 1;
                        max = span > max ? span : max;
                        break;
                    }
                }
            }
            return max;
        }
        return 0;
    }
}
