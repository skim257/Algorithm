package Functional_1;

import java.util.List;

/*Functional-1 > square
Given a list of integers, return a list where each integer is multiplied with itself.
square([1, 2, 3]) ¡æ [1, 4, 9]
square([6, 8, -6, -8, 1]) ¡æ [36, 64, 36, 64, 1]
square([]) ¡æ []*/
public class a2_square {
	public List<Integer> square(List<Integer> nums) {
		  nums.replaceAll(n->n*n);
		  return nums;
		}

	// Solution
    public List<Integer> ssquare(List<Integer> nums) {
        nums.replaceAll(n -> n * n);
        return nums;
    }
}
