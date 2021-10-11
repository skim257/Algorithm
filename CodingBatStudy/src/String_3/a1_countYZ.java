package String_3;
/*String-3 > countYZ
Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive).
We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it.
(Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
countYZ("fez day") ¡æ 2
countYZ("day fez") ¡æ 2
countYZ("day fyyyz") ¡æ 2*/
public class a1_countYZ {
	public int countYZ(String str) {
		  int count=0;
		  int s=str.indexOf(" ");
		  if(str.substring(str.length()-1).equals("y")||
		    str.substring(str.length()-1).equals("z"))count++;
		  if(str.substring(s-1,s).equals("y")||
		    str.substring(s-1,s).equals("z"))count++;
		  
		  return count;
		}
	
	// Solution
    public int scountYZ(String str) {
        int out = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length()-1 && str.substring(i, i+1).equals("y") && !Character.isLetter(str.charAt(i+1))) out++;
            if (i < str.length()-1 && str.substring(i, i+1).equals("z") && !Character.isLetter(str.charAt(i+1))) out++;
            if (i == str.length()-1 && str.substring(i, i+1).equals("y")) out++;
            if (i == str.length()-1 && str.substring(i, i+1).equals("z")) out++;
        }
        return out;
    }
}
