package AP_1;
/*AP-1 > copyEndy
We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive).
Given an array of positive ints, return a new array of length "count" containing the first endy numbers from the original array.
Decompose out a separate isEndy(int n) method to test if a number is endy. The original array will contain at least "count" endy numbers.
copyEndy([9, 11, 90, 22, 6], 2) ¡æ [9, 90]
copyEndy([9, 11, 90, 22, 6], 3) ¡æ [9, 90, 6]
copyEndy([12, 1, 1, 13, 0, 20], 2) ¡æ [1, 1]*/
public class b2_copyEndy {
	public int[] copyEndy(int[] nums, int count) {
		  int[] out=new int[count];
		  int n=0;
		  for(int i:nums){
		    if(((0<=i&&i<=10)||(90<=i&&i<=100))&&n<count)out[n++]=i;
		  }
		  return out;
		}
	
	// Solution
    public int[] scopyEndy(int[] nums, int count) {
        int n = 0;
        int[] out = new int[count];
        for (int i:nums) {
            if (n < count && isEndy(i)) out[n++] = i;
        }
        return out;
    }

    public boolean isEndy(int n) {
        if (n >= 0 && n <= 10 || n >= 90 && n <= 100) return true;
        return false;
    }
}
