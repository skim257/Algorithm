package CodingBat_Warmup2;
/*
 * Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".


countXX("abcxx") ¡æ 1
countXX("xxx") ¡æ 2
countXX("xxxx") ¡æ 3
 */
public class countXX {
	int countXX1(String str) {
		  int a=0;
		  return a; 
	}
	
	// solution
	int countXX2(String str) {
		  int count = 0;
		  for (int i = 0; i < str.length()-1; i++) {
		    if (str.substring(i, i+2).equals("xx")) count++;
		  }
		  return count;
	}

		// Solution notes: the loop is shortened to end at str.length()-1
		// so we can pull out a length 2 substring without going out of bounds.
		// Remember to use equals() to compare strings, not ==.
}
