package String_3;
/*String-3 > withoutString
Given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive).
You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
withoutString("Hello there", "llo") ¡æ "He there"
withoutString("Hello there", "e") ¡æ "Hllo thr"
withoutString("Hello there", "x") ¡æ "Hello there"*/
public class a2_withoutString {
	public String withoutString(String base, String remove) {
		  int rlen=remove.length();
		  String out="";
		  for(int i=0; i<base.length()-rlen; i+=rlen){
		    if(i==0&&base.substring(i,i+rlen).equals(remove))
		    out=base.substring(i+rlen+1);
		    if(i>0&&base.substring(i,i+rlen).equals(remove))
		    out=base.substring(i-1,i+rlen+1);
		    if(i>=0&&!base.substring(i,i+rlen).equals(remove))
		    out=base;
		  }
		  return out;
		}
	
	// Solution
    public String swithoutString(String base, String remove) {
        String out = "";
        for (int i = 0; i < base.length(); i++) {
            if (i + remove.length() <= base.length() && base.substring(i, i + remove.length()).toLowerCase().equals(remove.toLowerCase())) {
                i += remove.length() - 1;
            } else {
                out += base.substring(i, i + 1);
            }
        }
        return out;
    }
}
