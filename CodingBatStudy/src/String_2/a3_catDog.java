package String_2;
/*String-2 > catDog
Return true if the string "cat" and "dog" appear the same number of times in the given string.
catDog("catdog") ¡æ true
catDog("catcat") ¡æ false
catDog("1cat1cadodog") ¡æ true*/
public class a3_catDog {
	public boolean catDog(String str) {
		  int countc=0;
		  int countd=0;
		  for(int i=0; i<str.length()-2; i++)
		  {
		    if(str.substring(i,i+3).equals("cat"))
		    countc++;
		    if(str.substring(i,i+3).equals("dog"))
		    countd++;
		  }
		  if(countc==countd)
		  return true;
		  return false;
		}

	// Solution
    public boolean scatDog(String str) {
        int a = 0, b = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) a++;
            if (str.substring(i, i + 3).equals("dog")) b++;
        }
        return a == b ? true : false;
    }
}
