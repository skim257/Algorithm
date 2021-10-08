package String_2;
/*String-2 > oneTwo
Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca".
Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.
oneTwo("abc") ¡æ "bca"
oneTwo("tca") ¡æ "cat"
oneTwo("tcagdo") ¡æ "catdog"*/
public class b8_oneTwo {
	public String oneTwo(String str) {
		  // String a,b,c,d,e,f="";
		  // if(str.length()==3){
		  //   a=str.substring(1);
		  //   b=str.substring(0,1);
		  //   return a+b;
		  // }
		  
		  // if(str.length()>3){
		  //   c=str.substring(0,3);
		  //   d=str.substring(4);
		  //   a=c.substring(1);
		  //   b=c.substring(0,1);
		  //   e=d.substring(1);
		  //   f=d.substring(0,1);
		  // }
		  // return a+b+e+f;
		  return "";
		}
	
	// Solution
    public String soneTwo(String str) {
        String out = "";
        int step = str.length() / 3;
        int end = step * 3;
        for (int i = 0; i < end; i += 3) {
            out = out + str.substring(i + 1, i + 3) + str.substring(i, i + 1);
        }
        return out;
    }
}
