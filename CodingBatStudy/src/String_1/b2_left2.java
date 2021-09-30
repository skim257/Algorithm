package String_1;
/*
 * 
Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.


left2("Hello") ¡æ "lloHe"
left2("java") ¡æ "vaja"
left2("Hi") ¡æ "Hi"
 */
public class b2_left2 {
	public String left21(String str) {
		  String front=str.substring(0,2);
		  if(str.length()>2)
		  return str.substring(2,str.length())+front;
		  return str;
	}
	
	// Solution
	public String left22(String str) {
		  return str.substring(2) + str.substring(0, 2);
		  
		  // Solution notes: conveniently, substring(2) extracts the string from index 2
		  // through the end. So we put that first, followed by substring(0, 2)
	}
}
