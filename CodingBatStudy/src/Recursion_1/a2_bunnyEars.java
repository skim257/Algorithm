package Recursion_1;
/*Recursion-1 > bunnyEars
We have a number of bunnies and each bunny has two big floppy ears.
We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
Hint:
First detect the base case (bunnies == 0), and in that case just return 0. Otherwise, make a recursive call to bunnyEars(bunnies-1).
Trust that the recursive call returns the correct value, and fix it up by adding 2.
bunnyEars(0) ¡æ 0
bunnyEars(1) ¡æ 2
bunnyEars(2) ¡æ 4*/
public class a2_bunnyEars {
	public int bunnyEars(int bunnies) {
		  if(bunnies==0) return 0;
		  return 2+(bunnies+2);
		}

	// Solution
	public int sbunnyEars(int bunnies) {
		  // Base case: if bunnies==0, just return 0.
		  if (bunnies == 0) return 0;
		  
		  // Recursive case: otherwise, make a recursive call with bunnies-1
		  // (towards the base case), and fix up what it returns.
		  return 2 + bunnyEars(bunnies-1);
		}
	
    public int ssbunnyEars(int bunnies) {
        if (bunnies == 0) return 0;
        return 2 + bunnyEars(bunnies - 1);
    }
}
