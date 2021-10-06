package Logic_2;
/*Logic-2 > noTeenSum
Given 3 int values, a b c, return their sum.
However, if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens.
Write a separate helper "public int fixTeen(int n) {"that takes in an int value and returns that value fixed for the teen rule.
In this way, you avoid repeating the teen code 3 times (i.e. "decomposition").
Define the helper below and at the same indent level as the main noTeenSum().
noTeenSum(1, 2, 3) ¡æ 6
noTeenSum(2, 13, 1) ¡æ 3
noTeenSum(2, 1, 14) ¡æ 3*/
public class a4_noTeenSum {
	public int noTeenSum(int a, int b, int c) {
		  
		  // public int fixTeen(int n){
		  //   for(int i=13; i<=19; i++){
		  //     if(i!=15||i!=16)n=0;
		  //     n=i;
		  //   }
		  //   return n;
		  // }
		  
		  int sum=0;
		  // if(a==n)sum=n+b+c;
		  // if(b==n)sum=a+n+c;
		  // if(c==n)sum=a+b+n;
		  return sum;
		  
		}
	
	// Solution
    public int snoTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public int fixTeen(int n) {
        return n > 12 && n < 15 || n > 16 && n < 20 ? 0 : n;
    }
}
