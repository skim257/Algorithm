package Recursion_1;
/*Recursion-1 > countHi
Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
countHi("xxhixx") ¡æ 1
countHi("xhixhix") ¡æ 2
countHi("hi") ¡æ 1*/
public class b2_countHi {
	public int countHi(String str) {
		  if(str.length()<2)return 0;
		  if(str.substring(0,2).equals("hi"))return 1+countHi(str.substring(1));
		  return countHi(str.substring(1));
		}
	
	// Solution
	public int scountHi(String str) {
		  if (str.length() <= 1) return 0;
		  int count = 0;
		  if (str.substring(0, 2).equals("hi")) count = 1;  // could use startsWith()
		  return count + countHi(str.substring(1));
		}

    public int sscountHi(String str) {
        if (str.length() < 2) return 0;
        if (str.substring(0, 2).equals("hi")) return 1 + countHi(str.substring(2));
        return countHi(str.substring(1));
    }
}
