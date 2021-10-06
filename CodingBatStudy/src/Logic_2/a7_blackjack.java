package Logic_2;
/*Logic-2 > blackjack
Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.
blackjack(19, 21) ¡æ 21
blackjack(21, 19) ¡æ 21
blackjack(19, 22) ¡æ 19*/
public class a7_blackjack {
	public int blackjack(int a, int b) {
		  if(21-a<21-b)return a;
		  if(21-b<21-a)return b;
		  if(a>21)return b;
		  if(b>21)return a;
		  return 0;
		}
	
	// Solution
    public int sblackjack(int a, int b) {
        int out = 0;
        if (a > b && a < 22 || a < 22 && b > 21) out = a;
        if (b > a && b < 22 || b < 22 && a > 21) out = b;
        return out;
    }
}
