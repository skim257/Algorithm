package Logic_2;
/*Logic-2 > evenlySpaced
Given three ints, a b c, one of them is small, one is medium and one is large.
Return true if the three values are evenly spaced, so the difference between small
and medium is the same as the difference between medium and large.
evenlySpaced(2, 4, 6) ¡æ true
evenlySpaced(4, 6, 2) ¡æ true
evenlySpaced(4, 6, 3) ¡æ false*/
public class a8_evenlySpaced {
	public boolean evenlySpaced(int a, int b, int c) {
		  if(Math.abs(a-b)!=Math.abs(a-c)&&
		      Math.abs(b-c)!=Math.abs(b-a)&&
		        Math.abs(c-a)!=Math.abs(c-b)) return false;
		  return true;
		}
	
	// Solution
    public boolean sevenlySpaced(int a, int b, int c) {
        int min = Math.min(Math.min(a, b), c);
        int mid = Math.max(Math.min(a, b), c);
        int mid2 = Math.min(Math.max(a, b), c);
        int max = Math.max(Math.max(a, b), c);
        return Math.abs(mid - min) == Math.abs(mid - max) || Math.abs(mid2 - min) == Math.abs(mid2 - max);
    }
}
