package Map_2;

import java.util.HashMap;
import java.util.Map;

/*Map-2 > pairs
Given an array of non-empty strings, create and return a Map<String, String> as follows:
for each string add its first character as a key with its last character as the value.
pairs(["code", "bug"]) ¡æ {"b": "g", "c": "e"}
pairs(["man", "moon", "main"]) ¡æ {"m": "n"}
pairs(["man", "moon", "good", "night"]) ¡æ {"g": "d", "m": "n", "n": "t"}*/
public class a3_pairs {
	public Map<String, String> pairs(String[] strings) {
		  Map<String, String> map=new HashMap();
		  for(String s:strings){
		    if(!map.containsKey(s)){
		      map.put(s.substring(0,1),s.substring(s.length()-1));
		    }
		  }
		  return map;
		}

	// Solution
    public Map<String, String> spairs(String[] strings) {
        Map<String, String> out = new HashMap();
        for (String s:strings) {
            out.put(s.substring(0, 1), s.substring(s.length()-1));
        }
        return out;
    }
}
