package Logic_2;
/*Logic-2 > makeBricks
We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each).
Return true if it is possible to make the goal by choosing from the given bricks.
This is a little harder than it looks and can be done without any loops.
See also: Introduction to MakeBricks
makeBricks(3, 1, 8) ¡æ true
makeBricks(3, 1, 9) ¡æ false
makeBricks(3, 2, 10) ¡æ true*/
public class a1_makeBricks {
	public boolean makeBricks(int small, int big, int goal) {
		  return small+(big*5)==goal?true:false;
		}
	
	// Solution
    public boolean smakeBricks(int small, int big, int goal) {
        if (goal > small + big * 5) return false;
        if (goal % 5 > small) return false;
        return true;
    }
}
