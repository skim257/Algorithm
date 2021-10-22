package Map_2;

import java.util.HashMap;
import java.util.Map;

/*Map-2 > allSwap
We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
Loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2 strings in the array.
When a position in the array has been swapped, it no longer matches anything. Using a map, this can be solved making just one pass over the array.
More difficult than it looks.
Hint: Make a Map<String, Integer> with the first char as the key and the index in the array as the value.
After doing a swap, remove that key so it won't match anything in the future.
allSwap(["ab", "ac"]) ¡æ ["ac", "ab"]
allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) ¡æ ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) ¡æ ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]*/
public class a8_allSwap {
	public String[] allSwap(String[] strings) {
		  Map<String, Integer> map=new HashMap();
		  String[] out=new String[strings.length];
		  int a=0;
		  for(String s:strings){
		    if(map.containsKey(s)){
		      map.remove(s);
		    }
		    else{
		      map.put(s.substring(0,1),1);
		      out[a]=s;
		      a++;
		    }
		  }
		  return out;
		}
	
	// Solution
	public String[] sallSwap(String[] strings) {
		  Map<String, Integer> map = new HashMap();
		  for (int i=0; i<strings.length; i++) {
		    String key = strings[i].substring(0, 1);
		    if (map.containsKey(key)) {
		      int match = map.get(key);
		      String temp = strings[match];  // swap strings at match/i
		      strings[match] = strings[i];
		      strings[i] = temp;
		      map.remove(key);  // so this old one won't match anything
		    }
		    else {
		      map.put(key, i);
		    }
		  }
		  return strings;
		}
	
    public String[] ssallSwap(String[] strings) {
        Map<String, Integer> map = new HashMap();
        for (int i = 0; i < strings.length; i++) {
            String key = strings[i].substring(0, 1);
            if (map.containsKey(key)) {
                int pos = map.get(key);
                String tmp = strings[pos];
                strings[pos] = strings[i];
                strings[i] = tmp;
                map.remove(key);
            } else {
                map.put(key, i);
            }
        }
        return strings;
    }
}
