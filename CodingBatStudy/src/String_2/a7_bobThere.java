package String_2;
/*String-2 > bobThere
Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
bobThere("abcbob") ¡æ true
bobThere("b9b") ¡æ true
bobThere("bac") ¡æ false*/
public class a7_bobThere {
	public boolean bobThere(String str) {
		  for(int i=0; i<str.length()-2; i++)
		  {
		    if(str.substring(i,i+1).equals("b")
		        &&str.substring(i+2,i+3).equals("b"))
		        return true;
		  }
		  return false;
		}

	// Solution
    public boolean sbobThere(String str) {
        if (str.length() == 3 && str.substring(0, 1).equals("b") && str.substring(2, 3).equals("b")) return true;
        if (str.length() > 3) {
            for (int i = 1; i < str.length() - 2; i++) {
                if (str.substring(i, i+1).equals("b") && str.substring(i+2, i+3).equals("b")) return true;
            }
        }
        return false;
    }
}
