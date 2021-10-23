package Functional_2;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/*Functional-2 > noNeg
Given a list of integers, return a list of the integers, omitting any that are less than 0.
noNeg([1, -2]) ¡æ [1]
noNeg([-3, -3, 3, 3]) ¡æ [3, 3]
noNeg([-1, -1, -1]) ¡æ []*/
public class a1_noNeg {
	public List<Integer> noNeg(List<Integer> nums) {
		  nums.replaceAll(n->func.apply(n));
		  return nums;
		}

		final Function<Integer, Integer> func=n->{
		  if(n==0) return n;
		  else if(n<0) return this.func.apply(null);
		  else return n;
		};
		
	// Solution
	    public List<Integer> snoNeg(List<Integer> nums) {
	        return nums.stream()
	                .filter(n -> n >= 0)
	                .collect(Collectors.toList());
	    }
}
