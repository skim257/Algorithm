package Logic_2;
/*Logic-2 > luckySum
Given 3 int values, a b c, return their sum.
However, if one of the values is 13 then it does not count towards the sum and values to its right do not count.
So for example, if b is 13, then both b and c do not count.
luckySum(1, 2, 3) ¡æ 6
luckySum(1, 2, 13) ¡æ 3
luckySum(1, 13, 3) ¡æ 1*/
public class a3_luckySum {
	public int luckySum(int a, int b, int c) {
		  int sum=0;
		  if(a==13)
		  return sum;
		  if(b==13)
		  return sum +=a;
		  if(c==13)
		  return sum=a+b;
		  return a+b+c;
		}
	
	// Solution
    public int sluckySum(int a, int b, int c) {
        int out = 0;
        if (a != 13) out = out + a;
        if (a != 13 && b != 13) out = out + b;
        if (a != 13 && b != 13 && c != 13) out = out + c;
        return out;
    }
}
