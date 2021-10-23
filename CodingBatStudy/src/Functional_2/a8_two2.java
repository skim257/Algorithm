package Functional_2;
import java.util.*;
import java.util.stream.Collectors;
/*Functional-2 > two2
Given a list of non-negative integers, return a list of those numbers multiplied by 2, omitting any of the resulting numbers that end in 2.
two2([1, 2, 3]) ¡æ [4, 6]
two2([2, 6, 11]) ¡æ [4]
two2([0]) ¡æ [0]*/
public class a8_two2 {
	public List<Integer> two2(List<Integer> nums) {
		  nums.replaceAll(n->n*2);
		  nums.removeIf(n->n%10==2);
		  return nums;
		}
	
	// Solution
    public List<Integer> stwo2(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * 2)
                .filter(n -> n % 10 != 2)
                .collect(Collectors.toList());
    }
}
