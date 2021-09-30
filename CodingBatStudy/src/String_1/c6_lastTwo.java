package String_1;
/*String-1 > lastTwo
Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
lastTwo("coding") ¡æ "codign"
lastTwo("cat") ¡æ "cta"
lastTwo("ab") ¡æ "ba"*/
public class c6_lastTwo {
	public String lastTwo(String str) {
		  if(str.length()<2)
		  return str;
		  String a=str.substring(str.length()-2,str.length()-1);
		  String b=str.substring(str.length()-1);
		  return str.substring(0,str.length()-2)+b+a;
		}
	
	// Solution
    public String slastTwo(String str) {
        return str.length() > 1 ?
                str.substring(0, str.length() - 2) + str.substring(str.length() - 1) + str.substring(str.length() - 2, str.length() - 1)
                : str ;
    }
}
