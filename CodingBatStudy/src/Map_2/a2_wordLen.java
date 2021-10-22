package Map_2;

import java.util.HashMap;
import java.util.Map;

/*Map-2 > wordLen
Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, and the value is that string's length.
wordLen(["a", "bb", "a", "bb"]) ¡æ {"bb": 2, "a": 1}
wordLen(["this", "and", "that", "and"]) ¡æ {"that": 4, "and": 3, "this": 4}
wordLen(["code", "code", "code", "bug"]) ¡æ {"code": 4, "bug": 3}*/
public class a2_wordLen {
	public Map<String, Integer> wordLen(String[] strings) {
		  Map<String, Integer> map=new HashMap();
		  
		  for(int i=strings.length; i<0; i--){
		   for(int j=0; j<strings.length; j++){
		     if(strings[i].equals(strings[j])){
		       map.put(strings[i], i);
		     }
		   }
		  }
		  return map;
		}
	
	// Solution
    public Map<String, Integer> swordLen(String[] strings) {
        Map<String, Integer> out = new HashMap();
        for (String s:strings) {
            if (!out.containsKey(s)) out.put(s, s.length());
        }
        return out;
    }
}
