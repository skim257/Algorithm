package Recursion_1;
/*Recursion-1 > nestParen
Given a string, return true if it is a nesting of zero or more pairs of parenthesis, like "(())" or "((()))".
Suggestion: check the first and last chars, and then recur on what's inside them.
nestParen("(())") ¡æ true
nestParen("((()))") ¡æ true
nestParen("(((x))") ¡æ false*/
public class c9_nestParen {
	public boolean nestParen(String str) {
		  if(str.length()<4)return false;
		  char first=str.charAt(0);
		  char last=str.charAt(str.length()-1);
		  if(first=='('&&last==')')return nestParen(str.substring(1,str.length()-1));
		  return false;
		}
	
	// Solution
    public boolean snestParen(String str) {
        int len = str.length();
        if (len < 1) return true;
        if (!str.substring(0, 1).equals("(") || !str.substring(len - 1, len).equals(")")) return false;
        return nestParen(str.substring(1, len - 1));
    }
}
