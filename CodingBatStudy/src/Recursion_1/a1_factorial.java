package Recursion_1;
/*Recursion-1 > factorial
Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).
Hint:
First, detect the "base case", a case so simple that the answer can be returned immediately (here when n==1).
Otherwise make a recursive call of factorial(n-1) (towards the base case).
Assume the recursive call returns a correct value, and fix that value up to make our result.
factorial(1) ¡æ 1
factorial(2) ¡æ 2
factorial(3) ¡æ 6*/
public class a1_factorial {
	public int factorial(int n) {
		  if(n>1)return n*(n-1);
		  return n;
		}
	
	// Solution
	public int sfactorial(int n) {
		  // Base case: if n is 1, we can return the answer directly
		  if (n == 1) return 1;
		  
		  // Recursion: otherwise make a recursive call with n-1
		  // (towards the base case), i.e. call factorial(n-1).
		  // Assume the recursive call works correctly, and fix up
		  // what it returns to make our result.
		  return n * factorial(n-1);
		}
}
