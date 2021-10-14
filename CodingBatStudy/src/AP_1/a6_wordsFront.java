package AP_1;
/*AP-1 > wordsFront
Given an array of strings, return a new array containing the first N strings. N will be in the range 1..length.
wordsFront(["a", "b", "c", "d"], 1) ¡æ ["a"]
wordsFront(["a", "b", "c", "d"], 2) ¡æ ["a", "b"]
wordsFront(["a", "b", "c", "d"], 3) ¡æ ["a", "b", "c"]*/
public class a6_wordsFront {
	public String[] wordsFront(String[] words, int n) {
		  String[] out=new String[n];
		  for(int i=0; i<n; i++){
		    out[i]=words[i];
		  }
		  return out;
		}
	
	// Solution
    public String[] swordsFront(String[] words, int n) {
        String[] out = new String[n];
        for (int i = 0; i < n; i++) {
            out[i] = words[i];
        }
        return out;
    }
}
