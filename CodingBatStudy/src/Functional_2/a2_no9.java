package Functional_2;

import java.util.List;
import java.util.stream.Collectors;

/*Functional-2 > no9
Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note: % by 10)
no9([1, 2, 19]) ¡æ [1, 2]
no9([9, 19, 29, 3]) ¡æ [3]
no9([1, 2, 3]) ¡æ [1, 2, 3]*/
public class a2_no9 {
	public List<Integer> no9(List<Integer> nums) {
		  nums.removeIf(n->n%10==9);
		  return nums;
		}
	
	// Solution
    public List<Integer> sno9(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n % 10 != 9)
                .collect(Collectors.toList());
    }
}
