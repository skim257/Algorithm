package Functional_2;

import java.util.List;
import java.util.stream.Collectors;

/*Functional-2 > square56
Given a list of integers, return a list of those numbers squared and the product added to 10, omitting any of the resulting numbers that end in 5 or 6.
square56([3, 1, 4]) ¡æ [19, 11]
square56([1]) ¡æ [11]
square56([2]) ¡æ [14]*/
public class a9_square56 {
	public List<Integer> square56(List<Integer> nums) {
		  nums.replaceAll(n->n*n+10);
		  nums.removeIf(n->n%10==5||n%10==6);
		  return nums;
		}
	
	// Solution
    public List<Integer> ssquare56(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * n + 10)
                .filter(n -> n % 10 != 5 && n % 10 != 6)
                .collect(Collectors.toList());
    }
}
