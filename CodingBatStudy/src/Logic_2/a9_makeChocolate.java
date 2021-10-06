package Logic_2;
/*Logic-2 > makeChocolate
We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each).
Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.
makeChocolate(4, 1, 9) ¡æ 4
makeChocolate(4, 1, 10) ¡æ -1
makeChocolate(4, 1, 7) ¡æ 2*/
public class a9_makeChocolate {
	public int makeChocolate(int small, int big, int goal) {
		  if(goal<big)
		  return big;
		  goal=goal-(big*5);
		  if(small==goal)
		  return small;
		  if(small<goal)
		  return -1;
		  return goal;
		}
	
	// Solution
    public int smakeChocolate(int small, int big, int goal) {
        if (goal > small + big * 5) return -1;
        if (goal % 5 > small) return -1;
        return goal / 5 >= big ? goal - big * 5 : goal % 5;
    }
}
