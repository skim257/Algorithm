package Functional_2;

import java.util.List;
import java.util.stream.Collectors;

/*Functional-2 > noTeen
Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.
noTeen([12, 13, 19, 20]) ¡æ [12, 20]
noTeen([1, 14, 1]) ¡æ [1, 1]
noTeen([15]) ¡æ []*/
public class a3_noTeen {
	public List<Integer> noTeen(List<Integer> nums) {
		  nums.removeIf(n->n>=13&&n<=19);
		  return nums;
		}

	// Solution
	public List<Integer> snoTeen(List<Integer> nums) {
		  nums.removeIf(n -> n >= 13 && n <= 19);
		  return nums;
		}
	
    public List<Integer> ssnoTeen(List<Integer> nums) {
        return nums.stream()
                .filter(n -> n < 13 || n > 19)
                .collect(Collectors.toList());
    }
}
