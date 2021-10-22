package Map_1;

import java.util.Map;

/*Map-1 > topping3
Given a map of food keys and topping values, modify and return the map as follows:
If the key "potato" has a value, set that as the value for the key "fries".
If the key "salad" has a value, set that as the value for the key "spinach".
topping3({"potato": "ketchup"}) ¡æ {"potato": "ketchup", "fries": "ketchup"}
topping3({"potato": "butter"}) ¡æ {"potato": "butter", "fries": "butter"}
topping3({"salad": "oil", "potato": "ketchup"}) ¡æ {"spinach": "oil", "salad": "oil", "potato": "ketchup", "fries": "ketchup"}*/
public class a6_topping3 {
	public Map<String, String> topping3(Map<String, String> map) {
		  if(map.get("potato")!=null){
		    map.put("fries",map.get("potato"));
		  }
		  if(map.get("salad")!=null){
		    map.put("spinach",map.get("salad"));
		  }
		  return map;
		}
	
	// Solution
    public Map<String, String> stopping3(Map<String, String> map) {
        if (map.get("potato") != null) map.put("fries", map.get("potato"));
        if (map.get("salad") != null) map.put("spinach", map.get("salad"));
        return map;
    }
}
