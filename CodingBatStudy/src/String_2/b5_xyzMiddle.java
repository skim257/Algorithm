package String_2;
/*String-2 > xyzMiddle
Given a string, does "xyz" appear in the middle of the string?
To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.
xyzMiddle("AAxyzBB") ¡æ true
xyzMiddle("AxyzBB") ¡æ true
xyzMiddle("AxyzBBB") ¡æ false*/
public class b5_xyzMiddle {
	public boolean xyzMiddle(String str) {
		  if(str.substring(str.length()/2-1,str.length()/2+1)
		          .contains("x")||
		          str.substring(str.length()/2-1,str.length()/2+1)
		          .contains("y")||
		          str.substring(str.length()/2-1,str.length()/2+1)
		          .contains("z"))
		          return true;
		          return false;
		}
	
	// Solution
    public boolean sxyzMiddle(String str) {
        int len = str.length();
        int mid = str.length() / 2;
        if (len == 3 && str.equals("xyz")) return true;
        if (len > 3 && len % 2 == 0) {
            if (str.substring(mid - 2, mid + 1).equals("xyz")) return true;
            if (str.substring(mid - 1, mid + 2).equals("xyz")) return true;
        }
        if (len > 3 && len % 2 != 0) {
            if (str.substring(mid - 1, mid + 2).equals("xyz")) return true;
        }
        return false;
    }
}
