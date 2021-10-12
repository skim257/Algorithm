package Array_2;
/*Array-2 > tripleUp
Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.
tripleUp([1, 4, 5, 6, 2]) ¡æ true
tripleUp([1, 2, 3]) ¡æ true
tripleUp([1, 2, 4]) ¡æ false*/
public class c5_tripleUp {
	public boolean tripleUp(int[] nums) {
		  for(int i=0; i<nums.length-1; i++){
		    if(i>0&&nums[i]-nums[i-1]==1&&nums[i+1]-nums[i]==1)return true;
		    if(i==0&&i<nums.length-2&&nums[i+2]-nums[i+1]==1
		        &&nums[i+1]-nums[i]==1)return true;
		  }
		  return false;
		}
	
	// Solution
    public boolean stripleUp(int[] nums) {
        int len = nums.length;
        if (len < 3) return false;
        for (int i = 1; i < len - 1; i++) {
            if (nums[i-1] + 1 == nums[i] && nums[i] + 1 == nums[i+1]) return true;
        }
        return false;
    }
}
