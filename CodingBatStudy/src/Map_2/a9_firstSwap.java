package Map_2;

import java.util.HashMap;
import java.util.Map;

/*Map-2 > firstSwap
We'll say that 2 strings "match" if they are non-empty and their first chars are the same.
Loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2 strings in the array.
A particular first char can only cause 1 swap, so once a char has caused a swap, its later swaps are disabled.
Using a map, this can be solved making just one pass over the array. More difficult than it looks.
firstSwap(["ab", "ac"]) ¡æ ["ac", "ab"]
firstSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) ¡æ ["ay", "by", "cy", "cx", "bx", "ax", "aaa", "azz"]
firstSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) ¡æ ["ay", "by", "ax", "bx", "ai", "aj", "bx", "by"]*/
public class a9_firstSwap {
	public String[] firstSwap(String[] strings) {
		  Map<String, Integer> map=new HashMap();
		  for(int i=0; i<strings.length-1; i++){
		    String c=strings[i].substring(1,0);
		    if(map.containsKey(strings[i])){
		      int j=map.get(strings[i]);
		      String tmp=strings[j];
		      strings[j]=strings[i];
		      tmp=strings[i];
		    }
		    else{
		      map.put(c,i);
		    }
		  }
		  return strings;
		}
	
	// Solution
    public String[] sfirstSwap(String[] strings) {
        Map<String, Integer> map = new HashMap();
        for (int i = 0; i < strings.length; i++) {
            String key = strings[i].substring(0, 1);
            if (map.containsKey(key)) {
                if (map.get(key) == -1) continue;
                int pos = map.get(key);
                String tmp = strings[pos];
                strings[pos] = strings[i];
                strings[i] = tmp;
                map.put(key, -1);
            } else {
                map.put(key, i);
            }
        }
        return strings;
    }
}
