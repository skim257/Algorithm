package AP_1;
/*AP-1 > matchUp
Given 2 arrays that are the same length containing strings, compare the 1st string in one array to the 1st string in the other array,
the 2nd to the 2nd and so on. Count the number of times that the 2 strings are non-empty and start with the same char.
The strings may be any length, including 0.
matchUp(["aa", "bb", "cc"], ["aaa", "xx", "bb"]) ¡æ 1
matchUp(["aa", "bb", "cc"], ["aaa", "b", "bb"]) ¡æ 2
matchUp(["aa", "bb", "cc"], ["", "", "ccc"]) ¡æ 1*/
public class b3_matchUp {
	public int matchUp(String[] a, String[] b) {
		  int n=0;
		  for(int i=0; i<a.length; i++){
		    // if(a[i].contains(b[i]))n++;
		    if(a[i].charAt(0)==b[i].charAt(0))n++;
		  }
		  return n;
		}
	
	// Solution
    public int smatchUp(String[] a, String[] b) {
        int out = 0;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals("") && !b[i].equals("") && a[i].charAt(0) == b[i].charAt(0)) out++;
        }
        return out;
    }
}
