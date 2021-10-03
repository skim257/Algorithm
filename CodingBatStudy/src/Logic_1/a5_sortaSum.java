package Logic_1;
/*Logic-1 > sortaSum
Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.
sortaSum(3, 4) ¡æ 7
sortaSum(9, 4) ¡æ 20
sortaSum(10, 11) ¡æ 21*/
public class a5_sortaSum {
	public int sortaSum(int a, int b) {
		  int sum=0;
		  if(a+b>=10&&a+b<=19)
		  return sum=20;
		  return sum=a+b;
		}
	
	// Solution
	public int ssortaSum(int a, int b) {
		  int sum = a + b;
		  if (sum >= 10 && sum <= 19) {
		    return 20;
		  }
		  return sum;
		  
		  // Solution notes: storing a + b in a local variable first cleans
		  // the code up a bit.
		}
	
    public int sssortaSum(int a, int b) {
        int sum = a + b;
        return sum > 9 && sum < 20 ? 20 : sum;
    }
}
