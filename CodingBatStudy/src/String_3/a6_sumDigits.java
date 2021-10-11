package String_3;
/*String-3 > sumDigits
Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters.
Return 0 if there are no digits in the string. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
Integer.parseInt(string) converts a string to an int.)
sumDigits("aa1bc2d3") ¡æ 6
sumDigits("aa11b33") ¡æ 8
sumDigits("Chocolate") ¡æ 0*/
public class a6_sumDigits {
	public int sumDigits(String str) {
		  int sum=0;
		  for(int i=0; i<str.length(); i++){
		    if(Character.isDigit(str.charAt(i))==true){
		      sum=sum+Integer.parseInt(str.substring(i,i+1));
		    }
		  }
		  return sum;
		}
	
	// Solution
    public int ssumDigits(String str) {
        int out = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) out += Integer.parseInt(str.substring(i, i+1));
        }
        return out;
    }
}
