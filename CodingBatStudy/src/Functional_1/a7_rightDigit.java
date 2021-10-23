package Functional_1;

import java.util.List;

/*Functional-1 > rightDigit
Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)
rightDigit([1, 22, 93]) ¡æ [1, 2, 3]
rightDigit([16, 8, 886, 8, 1]) ¡æ [6, 8, 6, 8, 1]
rightDigit([10, 0]) ¡æ [0, 0]*/
public class a7_rightDigit {
	public List<Integer> rightDigit(List<Integer> nums) {
		  nums.replaceAll(n->n%10);
		  return nums;
		}
	
	// Solution
    public List<Integer> srightDigit(List<Integer> nums) {
        nums.replaceAll(n -> n % 10);
        return nums;
    }
}
