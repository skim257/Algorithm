package Recursion_1;
/*Recursion-1 > count7
Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops).
Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
count7(717) ¡æ 2
count7(7) ¡æ 1
count7(123) ¡æ 0*/
public class a7_count7 {
	public int count7(int n) {
		  int sum=0;
		  if(count7(n/10)==7||n%10==7) sum+=1;
		  return sum;
		}
	
	// Solution
    public int scount7(int n) {
        if (n == 0) return 0;
        if (n % 10 == 7) return 1 + count7(n - 1);
        return count7(n / 10);
    }
}
