package Logic_1;
/*Logic-1 > greenTicket
You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other, the result is 0.
If all of the numbers are the same, the result is 20. If two of the numbers are the same, the result is 10.
greenTicket(1, 2, 3) ¡æ 0
greenTicket(2, 2, 2) ¡æ 20
greenTicket(1, 1, 2) ¡æ 10*/
public class c9_greenTicket {
	public int greenTicket(int a, int b, int c) {
		  if(a!=b&&b!=c&&a!=c)
		  return 0;
		  if(a==b&&b==c&&a==c)
		  return 20;
		  return 10;
		}
	
	// Solution
    public int sgreenTicket(int a, int b, int c) {
        if (a == b && b == c && c == a) return 20;
        if (a == b || b == c || c == a) return 10;
        return 0;
    }
}
