package Map_1;

import java.util.Map;

/*Map-1 > topping1
Given a map of food keys and topping values, modify and return the map as follows:
If the key "ice cream" is present, set its value to "cherry".
In all cases, set the key "bread" to have the value "butter".
topping1({"ice cream": "peanuts"}) ¡æ {"bread": "butter", "ice cream": "cherry"}
topping1({}) ¡æ {"bread": "butter"}
topping1({"pancake": "syrup"}) ¡æ {"bread": "butter", "pancake": "syrup"}*/
public class a4_topping1 {
	public Map<String, String> topping1(Map<String, String> map) {
		  if(map.get("ice cream")!=null){
		    map.put("ice cream","cherry");
		  }
		    map.put("bread","butter");
		  return map;
		}
	
	// Solution
    public Map<String, String> stopping1(Map<String, String> map) {
        if (map.get("ice cream") != null) map.put("ice cream", "cherry");
        map.put("bread", "butter");
        return map;
    }
}
