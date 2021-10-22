package Map_2;

import java.util.HashMap;
import java.util.Map;

/*Map-2 > firstChar
Given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen,
with the value of all the strings starting with that character appended together in the order they appear in the array.
firstChar(["salt", "tea", "soda", "toast"]) ¡æ {"s": "saltsoda", "t": "teatoast"}
firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) ¡æ {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}*/
public class a5_firstChar {
	public Map<String, String> firstChar(String[] strings) {
		  Map<String, String> map=new HashMap();
		  for(String s:strings){
		    if(!map.containsKey(s)){
		      if(s.substring(0,1).equals(map.get(s))){
		        
		      map.put(s.substring(0,1),s);
		      }
		    }
		    else{
		      map.put(s.substring(0,1),s);
		    }
		  }
		  return map;
		}
	
	// Solution
    public Map<String, String> sfirstChar(String[] strings) {
        Map<String, String> out = new HashMap();
        for (String s:strings) {
            if (out.containsKey(s.substring(0, 1))) {
                out.put(s.substring(0, 1), out.get(s.substring(0, 1)) + s);
            } else {
                out.put(s.substring(0, 1), s);
            }
        }
        return out;
    }
}
