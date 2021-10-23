package Functional_1;

import java.util.List;

/*Functional-1 > math1
Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.
math1([1, 2, 3]) ¡æ [20, 30, 40]
math1([6, 8, 6, 8, 1]) ¡æ [70, 90, 70, 90, 20]
math1([10]) ¡æ [110]*/
public class a6_math1 {
	public List<Integer> math1(List<Integer> nums) {
		  nums.replaceAll(n->(n+1)*10);
		  return nums;
		}

	// Solution
    public List<Integer> smath1(List<Integer> nums) {
        nums.replaceAll(n -> (n + 1) * 10);
        return nums;
    }
}
