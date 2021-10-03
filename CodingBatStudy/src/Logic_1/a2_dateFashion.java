package Logic_1;
/*Logic-1 > dateFashion
You and your date are trying to get a table at a restaurant.
The parameter "you" is the stylishness of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes.
The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is very stylish, 8 or more,
then the result is 2 (yes). With the exception that if either of you has style of 2 or less, then the result is 0 (no).
Otherwise the result is 1 (maybe).
dateFashion(5, 10) ¡æ 2
dateFashion(5, 2) ¡æ 0
dateFashion(5, 5) ¡æ 1*/
public class a2_dateFashion {
	public int dateFashion(int you, int date) {
		  int out=0;
		  if(you<=2||date<=2)
		  out=0;
		  else if(you>=8||date>=8)
		  out=2;
		  else
		  out=1;
		  return out;
		}
	
	// Solution
	public int sdateFashion(int you, int date) {
		  // Check the <=2 case first, since it takes precedence
		  // over the >=8 case.
		  if (you <= 2 || date <= 2) {
		    return 0;
		  }
		  else if (you >= 8 || date >= 8) {
		    return 2;
		  }
		  else {
		    return 1;
		  }
		}
	
    public int ssdateFashion(int you, int date) {
        if (you > 7 && date > 2 || you > 2 && date > 7) return 2;
        if (you < 3 || date < 3) return 0;
        return 1;
    }
}
