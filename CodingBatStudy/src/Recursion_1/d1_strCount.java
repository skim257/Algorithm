package Recursion_1;
/*Recursion-1 > strCount
Given a string and a non-empty substring sub, compute recursively the number of times that sub appears in the string, without the sub strings overlapping.
strCount("catcowcat", "cat") ¡æ 2
strCount("catcowcat", "cow") ¡æ 1
strCount("catcowcat", "dog") ¡æ 0*/
public class d1_strCount {
	public int strCount(String str, String sub) {
		  if(str.length()<sub.length())return 0;
		  if(str.substring(0,sub.length()).equals(sub))return 1+strCount(str.substring(sub.length()),sub);
		  return strCount(str.substring(1),sub);
		}
	
	// Solution
    public int sstrCount(String str, String sub) {
        if (str.length() < sub.length()) return 0;
        if (str.substring(0, sub.length()).equals(sub)) return 1 + strCount(str.substring(sub.length()), sub);
        return strCount(str.substring(1), sub);
    }
}
