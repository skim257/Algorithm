package String_2;
/*String-2 > xyzThere
Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.).
So "xxyz" counts but "x.xyz" does not.
xyzThere("abcxyz") ¡æ true
xyzThere("abc.xyz") ¡æ false
xyzThere("xyz.abc") ¡æ true*/
public class a6_xyzThere {
	public boolean xyzThere(String str) {
		  if(str.contains(".xyz"))
		  return false;
		  if(str.contains("xyz"))
		  return true;
		  return false;
		}
	
	// Solution
    public boolean sxyzThere(String str) {
        if (str.length() == 3 && str.substring(0, 3).equals("xyz")) return true;
        for (int i = 0; i < str.length() - 3; i++) {
            if (i == 0 && str.substring(i, i+3).equals("xyz")) return true;
            if (!str.substring(i, i+1).equals(".") && str.substring(i+1, i+4).equals("xyz")) return true;
        }
        return false;
    }
}
