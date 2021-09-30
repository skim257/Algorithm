package String_1;
/*String-1 > frontAgain
Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".
frontAgain("edited") ¡æ true
frontAgain("edit") ¡æ false
frontAgain("ed") ¡æ true*/
public class c8_frontAgain {
	public boolean frontAgain(String str) {
		  if(str.length()>=2&&
		      str.substring(0,2).equals(str.substring(str.length()-2)))
		  return true;
		  return false;
		}

	// Solution
	public boolean sfrontAgain(String str) {
		  if (str.length() < 2) {
		    return false;  // screen out the short-length case
		  }
		  
		  String front = str.substring(0, 2);
		  String back = str.substring(str.length()-2);
		  return(front.equals(back));
		  
		  // Solution notes: First screen out the length < 2 case to avoid index
		  // problems with the later code.
		  // Grab the two strings with substring() and compare them
		  // with equals(). Return the result of equals() directly -- don't need
		  // check if it's true or false. Here the two strings are stored in local
		  // variables which makes the code simpler but longer.
		}
	
    public boolean s2frontAgain(String str) {
        if (str.length() > 1) return str.substring(0, 2).equals(str.substring(str.length() - 2)) ? true : false;
        return false;
    }

}
