package String_2;
/*String-2 > countCode
Return the number of times that the string "code" appears anywhere in the given string,
except we'll accept any letter for the 'd', so "cope" and "cooe" count.
countCode("aaacodebbb") ¡æ 1
countCode("codexxcode") ¡æ 2
countCode("cozexxcope") ¡æ 2*/
public class a4_countCode {
	public int countCode(String str) {
		  int count=0;
		  for(int i=0; i<str.length()-3; i++)
		  {
		    if(str.substring(i,i+2).contains("co")
		        &&str.substring(i+3,i+4).contains("e"))
		    count++;
		  }
		  return count;
		}

	// Solution
    public int scountCode(String str) {
        int out = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") && str.substring(i + 3, i + 4).equals("e")) out++;
        }
        return out;
    }
}
