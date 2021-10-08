package String_2;
/*String-2 > repeatSeparator
Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.
repeatSeparator("Word", "X", 3) ¡æ "WordXWordXWord"
repeatSeparator("This", "And", 2) ¡æ "ThisAndThis"
repeatSeparator("This", "And", 1) ¡æ "This"*/
public class b3_repeatSeparator {
	public String repeatSeparator(String word, String sep, int count) {
		  String s="";
		  for(int i=0; i<count; i++)
		  {
		    s=s+word;
		    for(int j=0; j<count-1; j++)
		    {
		      s=s+sep;
		      break;
		    }
		  }
		  return s;
		}

	// Solution
    public String srepeatSeparator(String word, String sep, int count) {
        String out = "";
        for (int i = 0; i < count; i++) {
            out = out + word;
            if (count - i != 1) out = out + sep;
        }
        return out;
    }
}
