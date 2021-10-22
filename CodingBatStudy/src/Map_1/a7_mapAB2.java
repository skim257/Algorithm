package Map_1;

import java.util.Map;

/*
Modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values, remove them both.
mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) ¡æ {"c": "cake"}
mapAB2({"a": "aaa", "b": "bbb"}) ¡æ {"a": "aaa", "b": "bbb"}
mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) ¡æ {"a": "aaa", "b": "bbb", "c": "aaa"}
*/
public class a7_mapAB2 {
	public Map<String, String> mapAB2(Map<String, String> map) {
		  if(map.get("a")!=null&&map.get("b")!=null&&
		      map.get("a").equals(map.get("b"))){
		    map.remove("a");
		    map.remove("b");
		  }
		  return map;
		}

	// Solution
	public Map<String, String> smapAB2(Map<String, String> map) {
		  String temp1 = map.get("a");
		  String temp2 = map.get("b");
		  if( temp1!= null && temp2!= null && temp1.equals(temp2) )   {
		    map.remove("a");
		    map.remove("b");
		  }
		  return map;
		}
}
