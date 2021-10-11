package String_3;
/*String-3 > gHappy
We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
Return true if all the g's in the given string are happy.
gHappy("xxggxx") ¡æ true
gHappy("xxgxx") ¡æ false
gHappy("xxggyygxx") ¡æ false*/
public class a4_gHappy {
	public boolean gHappy(String str) {
		  boolean out=false;
		  for(int i=0;i<str.length()-1; i++){
		    if(str.charAt(i)=='g'&&
		        str.charAt(i+1)=='g')out=true;
		    if(str.charAt(i)=='g'&&
		        str.charAt(i+1)!='g')out=false;

		  }
		  return out;
		}
	
	// Solution
    public boolean sgHappy(String str) {
        if (str.equals("g")) return false;
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 && i + 1 < str.length() && str.substring(i, i + 1).equals("g") && !str.substring(i + 1, i + 2).equals("g")) return false;
            if (i > 0 && i + 1 < str.length()) {
                if (str.substring(i, i + 1).equals("g") && !str.substring(i - 1, i).equals("g") && !str.substring(i + 1, i + 2).equals("g")) return false;
            }
            if (i + 1 == str.length() && str.substring(i, i+1).equals("g") && !str.substring(i - 1, i).equals("g")) return false;
        }
        return true;
    }
}
