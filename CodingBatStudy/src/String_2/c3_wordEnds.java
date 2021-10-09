package String_2;
/*String-2 > wordEnds
Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string.
Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.
wordEnds("abcXY123XYijk", "XY") ¡æ "c13i"
wordEnds("XY123XY", "XY") ¡æ "13"
wordEnds("XY1XY", "XY") ¡æ "11"*/
public class c3_wordEnds {
	public String wordEnds(String str, String word) {
		  String out="";
		  for(int i=0; i<str.length()-2; i++){
		    if(i==0&&str.substring(i,i+2).equals(word))
		    out=out+str.substring(i+2,i+3);
		    if(i>0&&str.substring(i,i+2).equals(word))
		    out=out+str.substring(i-1,i)+str.substring(i+2,i+3);
		  }
		  return out;
		  /*
		  int slen=str.length();
		  int wlen=word.length();
		  String fin="";
		  
		  for(int i=0; i<slen-wlen+1; i++){
		    String temp=str.substring(i,i<wlen);
		    if(i>0&&temp.euqals(word))
		    fin+=str.substring(i-1,i);
		    
		    if(i<slen-wlen&&temp.equals(word))
		    fin+=str.substring(i+wlen,i+wlen+1);
		  }
		  return fin;
		  */
		}
	
	// Solution
    public String swordEnds(String str, String word) {
        String out = "";
        for (int i = 0; i <= str.length(); i++) {
            if (i + word.length() < str.length() && str.substring(i + 1, i + word.length()+1).equals(word)) {
                out += str.substring(i, i+1);
            }
            if (i + word.length() <= str.length() - 1 && str.substring(i, i + word.length()).equals(word)) {
                out += str.substring(i + word.length(), i + word.length() + 1);
            }
        }
        return out;
    }
}
