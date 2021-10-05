package Logic_1;
/*Logic-1 > fizzString
Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz".
If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged.
(See also: FizzBuzz Code)
fizzString("fig") ¡æ "Fizz"
fizzString("dib") ¡æ "Buzz"
fizzString("fib") ¡æ "FizzBuzz"*/
public class b8_fizzString {
	public String fizzString(String str) {
		  if(str.substring(0,1).equals("f")
		        &&str.substring(str.length()-1).equals("b"))
		  return "FizzBuzz";
		  if(str.substring(0,1).equals("f"))
		  return "Fizz";
		  if(str.substring(str.length()-1).equals("b"))
		  return "Buzz";
		  return str;
		}
	
	// Solution
	public String sfizzString(String str) {
		  boolean f = str.startsWith("f");
		  boolean b = str.endsWith("b");
		  
		  if (f && b) return "FizzBuzz";
		  if (f) return "Fizz";
		  if (b) return "Buzz";
		  return str;
		  
		  // Style: you could use a series of "else" there, but it seems simpler
		  // to just not have them.
		}
	
    public String ssfizzString(String str) {
        String out = "";
        if (str.startsWith("f")) out = out + "Fizz";
        if (str.endsWith("b")) out = out + "Buzz";
        return out.equals("") ? str : out;
    }
}
