package Array_2;
/*Array-2 > matchUp
Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in nums2 (at the same index).
Return the count of the number of times that the two elements differ by 2 or less, but are not equal.
matchUp([1, 2, 3], [2, 3, 10]) ¡æ 2
matchUp([1, 2, 3], [2, 3, 5]) ¡æ 3
matchUp([1, 2, 3], [2, 3, 3]) ¡æ 2*/
public class b7_matchUp {
	public int matchUp(int[] nums1, int[] nums2) {
		  int count=0;
		  for(int i=0; i<nums1.length; i++){
		    int a=nums1[i];
		    int b=nums2[i];
		    if(a!=b&&Math.abs(b-a)<=2) count++;
		  }
		  return count;
		}
	
	// Solution
    public int smatchUp(int[] nums1, int[] nums2) {
        int out = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (Math.abs(nums1[i] - nums2[i]) == 1 || Math.abs(nums1[i] - nums2[i]) == 2) out++;
        }
        return out;
    }
}
