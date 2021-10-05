package Logic_1;
/*Logic-1 > withoutDoubles
Return the sum of two 6-sided dice rolls, each in the range 1..6.
However, if noDoubles is true, if the two dice show the same value, increment one die to the next value, wrapping around to 1 if its value was 6.
withoutDoubles(2, 3, true) ¡æ 5
withoutDoubles(3, 3, true) ¡æ 7
withoutDoubles(3, 3, false) ¡æ 6*/
public class c6_withoutDoubles {
	public int withoutDoubles(int die1, int die2, boolean noDoubles) {
		  if(die1==die2&&die1<6&&die2<6&&noDoubles)
		  return die1+die2+1;
		  if(die1==die2&&die1>=6&&noDoubles)
		  return die1+1;
		  return die1+die2;
		}
	
	// Solution
    public int swithoutDoubles(int die1, int die2, boolean noDoubles) {
        int sum = die1 + die2;
        if (sum == 12 && noDoubles) return 7;
        if (die1 == die2 && noDoubles) return sum + 1;
        return sum;
    }
}
