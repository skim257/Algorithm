package Recursion_1;
/*Recursion-1 > triangle
We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on.
Compute recursively (no loops or multiplication) the total number of blocks in such a triangle with the given number of rows.
triangle(0) ¡æ 0
triangle(1) ¡æ 1
triangle(2) ¡æ 3*/
public class a5_triangle {
	public int triangle(int rows) {
		  if(rows==0) return 0;
		  return rows+triangle(rows-1);
		}
	
	// Solution
	public int striangle(int rows) {
		  if (rows == 0) return 0;
		  
		  return rows + triangle(rows  - 1);
		  
		  // Solution notes: what is triangle(20)? It's whatever
		  // triangle(19) returns, plus 20.
		}
	
    public int sstriangle(int rows) {
        if (rows < 1) return 0;
        return rows + triangle(rows - 1);
    }
}
