package Array_2;
/*Array-2 > fizzBuzz
This is slightly more difficult version of the famous FizzBuzz problem which is sometimes given as a first problem for job interviews.
Consider the series of numbers beginning at start and running up to but not including end, so for example start=1 and end=5 gives the series 1, 2, 3, 4.
Return a new String[] array containing the string form of these numbers, except for multiples of 3,
use "Fizz" instead of the number, for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz".
In Java, String.valueOf(xxx) will make the String form of an int or other type.
This version is a little more complicated than the usual version since you have to allocate and index into an array instead of just printing,
and we vary the start/end instead of just always doing 1..100.
fizzBuzz(1, 6) ¡æ ["1", "2", "Fizz", "4", "Buzz"]
fizzBuzz(1, 8) ¡æ ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7"]
fizzBuzz(1, 11) ¡æ ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]*/
public class d7_fizzBuzz {
	public String[] fizzBuzz(int start, int end) {
		  int a=end-start;
		  String[] out=new String[a];
		  for(int i=0; i<a; i++){
		    out[i]=String.valueOf(i+1);
		    if(Integer.parseInt(out[i])%3==0)out[i]="Fizz";
		    if(Integer.parseInt(out[i])%5==0)out[i]="Buzz";
		  }
		  return out;
		}
	
	// Solution
    public String[] sfizzBuzz(int start, int end) {
        int len = end - start;
        String[] out = new String[len];
        for (int i = 0; i < len; i++) {
            String str = "";
            if (start % 3 == 0) str = str + "Fizz";
            if (start % 5 == 0) str = str + "Buzz";
            if (start % 3 != 0 && start % 5 != 0) str = str + String.valueOf(start);
            out[i] = str;
            start++;
        }
        return out;
    }
}
