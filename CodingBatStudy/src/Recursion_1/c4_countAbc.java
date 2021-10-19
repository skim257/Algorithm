package Recursion_1;
/*Recursion-1 > countAbc
Count recursively the total number of "abc" and "aba" substrings that appear in the given string.
countAbc("abc") ¡æ 1
countAbc("abcxxabc") ¡æ 2
countAbc("abaxxaba") ¡æ 2*/
public class c4_countAbc {
	public int countAbc(String str) {
		  if(str.length()<3)return 0;
		  if(str.substring(0,3).equals("abc")
		      ||str.substring(0,3).equals("aba"))
		  return 1+countAbc(str.substring(3));
		  return countAbc(str.substring(3));
		}
	
	// Solution
    public int scountAbc(String str) {
        if (str.length() < 3) return 0;
        if (str.substring(0, 3).equals("abc") || str.substring(0, 3).equals("aba")) return 1 + countAbc(str.substring(1));
        return countAbc(str.substring(1));
    }
}
