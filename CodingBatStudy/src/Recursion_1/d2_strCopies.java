package Recursion_1;
/*Recursion-1 > strCopies
Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in the string somewhere,
possibly with overlapping. N will be non-negative.
strCopies("catcowcat", "cat", 2) ¡æ true
strCopies("catcowcat", "cow", 2) ¡æ false
strCopies("catcowcat", "cow", 1) ¡æ true*/
public class d2_strCopies {
	public boolean strCopies(String str, String sub, int n) {
		  if(str.length()<sub.length())return false;
		  if(str.substring(0,str.length()).equals(sub)){
		    return strCopies(str.substring(sub.length()),sub,n);
		  }
		  return false;
		}
	
	// Solution
    public boolean sstrCopies(String str, String sub, int n) {
        if (n < 1) return true;
        if (str.length() < sub.length() && n > 0)return false;
        if (str.substring(0, sub.length()).equals(sub)) return strCopies(str.substring(1), sub, n - 1);
        return strCopies(str.substring(1), sub, n);
    }
}
