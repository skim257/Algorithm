package String_2;
/*String-2 > countHi
Return the number of times that the string "hi" appears anywhere in the given string.
countHi("abc hi ho") ¡æ 1
countHi("ABChi hi") ¡æ 2
countHi("hihi") ¡æ 2*/
public class a2_countHi {
	public int countHi(String str) {
		  int count=0;
		  for(int i=0; i<str.length()-1; i++)
		  {
		    if(str.substring(i,i+2).contains("hi"))
		      count++;
		  }
		  return count;
		}
	
	// Solution
	public int scountHi(String str) {
		  int count = 0;
		  // Loop to length-1 so we can access index i and i+1 in the loop.
		  for (int i = 0; i < (str.length() - 1); i++) {
		    if (str.substring(i, i+2).equals("hi")) count++;
		  }
		  return count;
		}
}
