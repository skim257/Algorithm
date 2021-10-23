package Functional_1;

import java.util.List;

/*Functional-1 > doubling
Given a list of integers, return a list where each integer is multiplied by 2.
doubling([1, 2, 3]) ¡æ [2, 4, 6]
doubling([6, 8, 6, 8, -1]) ¡æ [12, 16, 12, 16, -2]
doubling([]) ¡æ []*/
public class a1_doubling {
	public List<Integer> doubling(List<Integer> nums) {
		  // List<Integer> numss = -something-;
		  // for(int s:nums){
		  //   numss=nums.replaceAll(s->s*2);
		  // }
		  // return numss;
		  nums.replaceAll(n->n*2);
		  return nums;
		}
	
	// Solution
    public List<Integer> sdoubling(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        return nums;
    }
}
