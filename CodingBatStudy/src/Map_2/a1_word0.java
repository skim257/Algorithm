package Map_2;

import java.util.HashMap;
import java.util.Map;

/*Map-2 > word0
Given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, always with the value 0.
For example the string "hello" makes the pair "hello":0. We'll do more complicated counting later, but for this problem the value is simply 0.
word0(["a", "b", "a", "b"]) ¡æ {"a": 0, "b": 0}
word0(["a", "b", "a", "c", "b"]) ¡æ {"a": 0, "b": 0, "c": 0}
word0(["c", "b", "a"]) ¡æ {"a": 0, "b": 0, "c": 0}*/
public class a1_word0 {
	public Map<String, Integer> word0(String[] strings) {
		  Map<String, Integer> map = new HashMap<String, Integer>();
		  for(int i=0; i<strings.length; i++){
		    // if(map.get("strings[i]")!=null){
		      map.put(strings[i], 0);
		    // }
		  }
		  return map;
		}
	
	// Solution
    public Map<String, Integer> sword0(String[] strings) {
        Map<String, Integer> out = new HashMap();
        for (String s:strings) {
            if (!out.containsKey(s)) out.put(s, 0);
        }
        return out;
    }
}
