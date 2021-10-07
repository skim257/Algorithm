package String_2;
/*String-2 > xyBalance
We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string.
So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
xyBalance("aaxbby") ¡æ true
xyBalance("aaxbb") ¡æ false
xyBalance("yaaxbb") ¡æ false*/
public class a8_xyBalance {
	public boolean xyBalance(String str) {
		  // int[] x=indexOf("x");
		  // int[] y=indexOf("y");
		  // String a=str.substring(x+1,y);
		  // if(a.length%2==0)
		  // return true;
		  return false;
		}
	
	// Solution
    public boolean sxyBalance(String str) {
        int index = str.lastIndexOf("x");
        if (index < 0) return true;
        for (int i = index; i < str.length(); i++) {
            if (str.substring(i, i+1).equals("y")) return true;
        }
        return false;
    }
}
