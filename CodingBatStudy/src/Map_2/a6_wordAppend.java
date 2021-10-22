package Map_2;

import java.util.HashMap;
import java.util.Map;

/*Map-2 > wordAppend
Loop over the given array of strings to build a result string like this: when a string appears the 2nd, 4th, 6th, etc. time in the array,
append the string to the result. Return the empty string if no string appears a 2nd time.
wordAppend(["a", "b", "a"]) ¡æ "a"
wordAppend(["a", "b", "a", "c", "a", "d", "a"]) ¡æ "aa"
wordAppend(["a", "", "a"]) ¡æ "a"*/
public class a6_wordAppend {
	public String wordAppend(String[] strings) {
		  String out="";
		  for(int i=0; i<strings.length; i++){
		    if(i>0&&i%2==0){
		      out+=strings[i];
		    }
		  }
		  return out;
		}
	
	// Solution
    public String swordAppend(String[] strings) {
        String out = "";
        Map<String, Integer> map = new HashMap();
        for (String s:strings) {
            if (map.containsKey(s)) {
                int val = map.get(s) + 1;
                if (val % 2 == 0) out = out + s;
                map.put(s, val);
            } else {
                map.put(s, 1);
            }
        }
        return out;
    }
}
