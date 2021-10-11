package String_3;
/*String-3 > equalIsNot
Given a string, return true if the number of appearances of "is" anywhere in the string is equal
to the number of appearances of "not" anywhere in the string (case sensitive).
equalIsNot("This is not") ¡æ false
equalIsNot("This is notnot") ¡æ true
equalIsNot("noisxxnotyynotxisi") ¡æ true*/
public class a3_equalIsNot {
	public boolean equalIsNot(String str) {
		  int scount=0;
		  int ncount=0;
		  for(int i=0; i<str.length()-2; i++){
		    if(str.substring(i,i+2).equals("is"))scount++;
		    if(str.substring(i,i+3).equals("not"))ncount++;
		  }
		  if(scount==ncount) return true;
		  return false;
		}
	
	// Solution
    public boolean sequalIsNot(String str) {
        int is = 0, not = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.substring(i, i + 2).equals("is")) is++;
            if (i + 2 < str.length() && str.substring(i, i + 3).equals("not")) not++;
        }
        return is == not;
    }
}
