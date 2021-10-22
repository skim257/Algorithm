package Map_2;

import java.util.HashMap;
import java.util.Map;

/*Map-2 > wordMultiple
Given an array of strings, return a Map<String, Boolean> where each different string is a key
and its value is true if that string appears 2 or more times in the array.
Hint: One way to solve with a Map<String, Boolean>:
-no value: string not seen yet
-value false: string seen once
-value true: string seen 2 or more times
wordMultiple(["a", "b", "a", "c", "b"]) ¡æ {"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"]) ¡æ {"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"]) ¡æ {"c": true}*/
public class a7_wordMultiple {
	public Map<String, Boolean> wordMultiple(String[] strings) {
		  Map<String, Boolean> map=new HashMap();
		  int i=0;
		  for(String s:strings){
		    if(map.containsKey(s)){
		      i++;
		      if(i>=2){
		        map.put(s,true);
		      }
		      else{
		        map.put(s,false);
		      }
		    }
		    else{
		      map.put(s,false);
		    }
		  }
		  return map;
		}
	
	// Solution
    public Map<String, Boolean> swordMultiple(String[] strings) {
        Map<String, Boolean> out = new HashMap<String, Boolean>();
        for (String s:strings) {
            if (out.containsKey(s) && !out.get(s)) out.put(s, true);
            if (!out.containsKey(s)) out.put(s, false);
        }
        return out;
    }
}
