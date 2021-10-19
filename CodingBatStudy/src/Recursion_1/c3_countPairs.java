package Recursion_1;
/*Recursion-1 > countPairs
We'll say that a "pair" in a string is two instances of a char separated by a char. So "AxA" the A's make a pair.
Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. Recursively compute the number of pairs in the given string.
countPairs("axa") ¡æ 1
countPairs("axax") ¡æ 2
countPairs("axbx") ¡æ 1*/
public class c3_countPairs {
	public int countPairs(String str) {
		  if(str.length()<3)return 0;
		  if(str.substring(0,1).equals(str.substring(2,3)))
		  return 1+countPairs(str.substring(1));
		  return countPairs(str.substring(1));
		}
	
	// Solution
    public int scountPairs(String str) {
        if (str.length() < 3) return 0;
        if (str.charAt(0) == str.charAt(2)) return 1 + countPairs(str.substring(1));
        return countPairs(str.substring(1));
    }
}
