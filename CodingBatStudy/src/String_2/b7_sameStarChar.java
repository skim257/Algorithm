package String_2;
/*String-2 > sameStarChar
Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.
sameStarChar("xy*yzz") ¡æ true
sameStarChar("xy*zzz") ¡æ false
sameStarChar("*xa*az") ¡æ true*/
public class b7_sameStarChar {
	public boolean sameStarChar(String str) {
		  int a=str.indexOf("*");
		  int b=str.lastIndexOf("*");
		  if(a>0)
		  {
		  if(str.substring(a-1,a).equals(str.substring(a+1,a+2)))
		  return true;
		  if(str.substring(b-1,b).equals(str.substring(b+1,b+2)))
		  return true;
		  }
		  if(str.contains("*")) return true;
		  return false;
		}
	
	// Solution
    public boolean ssameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.substring(i, i + 1).equals("*") && !str.substring(i - 1, i).equals(str.substring(i + 1, i + 2))) return false;
        }
        return true;
    }
}
