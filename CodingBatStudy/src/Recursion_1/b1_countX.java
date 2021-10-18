package Recursion_1;
/*Recursion-1 > countX
Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
countX("xxhixx") ¡æ 4
countX("xhixhix") ¡æ 3
countX("hi") ¡æ 0*/
public class b1_countX {
	public int countX(String str) {
		  if(!str.contains("x")) return 0;
		  return 0;
		}
	
	// Solution
    public int scountX(String str) {
        if (str.length() == 0) return 0;
        if (str.substring(0, 1).equals("x")) return 1 + countX(str.substring(1));
        return countX(str.substring(1));
    }
}
