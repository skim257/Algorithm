package Map_1;

import java.util.Map;

/*Map-1 > mapAB
Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys.
If both keys are present, append their 2 string values together and store the result under the key "ab".
mapAB({"a": "Hi", "b": "There"}) ¡æ {"a": "Hi", "ab": "HiThere", "b": "There"}
mapAB({"a": "Hi"}) ¡æ {"a": "Hi"}
mapAB({"b": "There"}) ¡æ {"b": "There"}*/
public class a3_mapAB {
	public Map<String, String> mapAB(Map<String, String> map) {
		  if(map.get("a")!=null&&map.get("b")!=null){
		    map.put("ab",map.get("a")+map.get("b"));
		  }
		  return map;
		}
	
	// Solution
    public Map<String, String> smapAB(Map<String, String> map) {
        if (map.get("a") != null && map.get("b") != null) {
            map.put("ab", map.get("a") + map.get("b"));
        }
        return map;
    }
}
