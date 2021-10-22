package Map_1;

import java.util.Map;

/*Map-1 > mapShare
Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value.
In all cases remove the key "c", leaving the rest of the map unchanged.
mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) ¡æ {"a": "aaa", "b": "aaa"}
mapShare({"b": "xyz", "c": "ccc"}) ¡æ {"b": "xyz"}
mapShare({"a": "aaa", "c": "meh", "d": "hi"}) ¡æ {"a": "aaa", "b": "aaa", "d": "hi"}*/
public class a2_mapShare {
	public Map<String, String> mapShare(Map<String, String> map) {
		  if(map.containsKey("a")){
		    map.put("b",map.get("a"));
		    map.remove("c");
		  }
		  else{
		    map.remove("c");
		  }
		  return map;
		}
	
	// Solution
    public Map<String, String> smapShare(Map<String, String> map) {
        if (map.get("a") != null) {
            map.put("b", map.get("a"));
        }
        map.remove("c");
        return map;
    }
}
