package String_1;
/*String-1 > middleThree
Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.
middleThree("Candy") ¡æ "and"
middleThree("and") ¡æ "and"
middleThree("solving") ¡æ "lvi"*/
public class c1_middleThree {
	public String middleThree(String str) {
		  if(str.length()>3)
		  {
		    return str.substring(str.length()/2-1,str.length()/2+2);
		  }
		  return str;
		}
	
	// Solution
    public String smiddleThree(String str) {
        if (str.length() > 3) return str.substring(str.length()/2 - 1, str.length()/2 + 2);
        return str;
    }
}
