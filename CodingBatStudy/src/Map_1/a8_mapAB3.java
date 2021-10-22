package Map_1;

import java.util.HashMap;
import java.util.Map;

/*Modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map (but not both), set the other to have that same value in the map.


mapAB3({"a": "aaa", "c": "cake"}) ¡æ {"a": "aaa", "b": "aaa", "c": "cake"}
mapAB3({"b": "bbb", "c": "cake"}) ¡æ {"a": "bbb", "b": "bbb", "c": "cake"}
mapAB3({"a": "aaa", "b": "bbb", "c": "cake"}) ¡æ {"a": "aaa", "b": "bbb", "c": "cake"}*/
public class a8_mapAB3 {
	public Map<String, String> mapAB3(Map<String, String> map) {
		  if(map.get("a")!=null&&map.get("b")==null){
		    map.put("b", map.get("a"));
		  }
		  else if(map.get("a")==null&&map.get("b")!=null){
		    map.put("a",map.get("b"));
		  }
		  else{
		    return map;
		  }
		  return map;
		}
	
	// Solution
	public Map<String, String> smapAB3(Map<String, String> map) {
		  if(map.containsKey("a") && !map.containsKey("b")) {
		    map.put("b" , map.get("a"));
		  }
		  if(map.containsKey("b") && !map.containsKey("a")) {
		    map.put("a" , map.get("b"));
		  }
		  return map;
		}
}
