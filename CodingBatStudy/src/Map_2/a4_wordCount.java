package Map_2;

import java.util.HashMap;
import java.util.Map;

/*Map-2 > wordCount
The classic word-count algorithm: given an array of strings, return a Map<String, Integer> with a key for each different string,
with the value the number of times that string appears in the array.
wordCount(["a", "b", "a", "c", "b"]) ¡æ {"a": 2, "b": 2, "c": 1}
wordCount(["c", "b", "a"]) ¡æ {"a": 1, "b": 1, "c": 1}
wordCount(["c", "c", "c", "c"]) ¡æ {"c": 4}*/
public class a4_wordCount {
	public Map<String, Integer> wordCount(String[] strings) {
		  Map<String, Integer> map=new HashMap();
		  int count=0;
		  // for(int i=0; i<strings.length-1; i++){
		  //   if(strings[i].equals(strings[i+1])) {
		  //     count++;
		  //     map.put(strings[i],count);
		  //   }
		  // }
		  for(String s:strings){
		    if(map.get(s)==map.get(s)){
		      count++;
		      map.put(s,count);
		    }
		  }
		  return map;
		}
	
	// Solution
    public Map<String, Integer> swordCount(String[] strings) {
        Map<String, Integer> out = new HashMap();
        for (String s:strings) {
            if (out.containsKey(s)) {
                out.put(s, out.get(s)+1);
            } else {
                out.put(s, 1);
            }
        }
        return out;
    }
}
