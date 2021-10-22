package Map_1;

import java.util.Map;

/*Map-1 > mapBully
Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value "".
Basically "b" is a bully, taking the value and replacing it with the empty string.
mapBully({"a": "candy", "b": "dirt"}) ¡æ {"a": "", "b": "candy"}
mapBully({"a": "candy"}) ¡æ {"a": "", "b": "candy"}
mapBully({"a": "candy", "b": "carrot", "c": "meh"}) ¡æ {"a": "", "b": "candy", "c": "meh"}*/
public class a1_mapBully {
	public Map<String, String> mapBully(Map<String, String> map) {
		  return map;
		}
	
	// Solution
	public Map<String, String> smapBully(Map<String, String> map) {
		  if (map.containsKey("a")) {
		    map.put("b", map.get("a"));
		    map.put("a", "");
		  }
		  return map;
		}
	
    public Map<String, String> ssmapBully(Map<String, String> map) {
        if (map.get("a") != null) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }
}
