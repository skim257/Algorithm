package Array_3;
/*Array-3 > maxMirror
We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array,
the same group appears in reverse order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part).
Return the size of the largest mirror section found in the given array.
maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) ¡æ 3
maxMirror([1, 2, 1, 4]) ¡æ 3
maxMirror([7, 1, 2, 9, 7, 2, 1]) ¡æ 2*/
public class a8_maxMirror {
	public int maxMirror(int[] nums) {
		  int count=0;
		  for(int i=0; i<nums.length; i++){
		    for(int j=nums.length; j<=0; j--){
		      if(nums[i]==nums[j]) count++;
		    }
		  }
		  return count;
		  /*
		    int len=nums.length, count=0, max=0;
		    for(int i=0; i<len; i++){
		      count=0;
		      for(int j=len-1; j>-1&&i+count<len;j--){
		        if(nums[i+count]==nums[j]){
		          count++;
		        }else{
		          if(count>0){
		            max=Math.max(count,max);
		            count=0;
		          }
		        }
		      }
		      max=Math.max(count, max);
		    }
		    return max;
		  */
		}
	
	// Solution
    public int smaxMirror(int[] nums) {
        int[] numsCopy = new int[nums.length];
        for (int i = nums.length - 1, j = 0; i >= 0; i--, j++) {
            numsCopy[j] = nums[i];
        }
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            int pos1 = i;
            int pos2 = 0;
            boolean flag = false;
            while (pos1 < nums.length && pos2 < nums.length) {
                if (!flag) {
                    if (nums[pos1] != numsCopy[pos2]) pos2++;
                    else {
                        flag = true;
                        count = 1;
                        pos1++;
                        pos2++;
                    }
                } else {
                    if (nums[pos1] == numsCopy[pos2]) {
                        count++;
                        pos1++;
                        pos2++;
                    } else {
                        if (count > max) max = count;
                        pos1 = i;
                        flag = false;
                    }
                }
                if (count > max) max = count;
            }
        }
        return max;
    }
}
