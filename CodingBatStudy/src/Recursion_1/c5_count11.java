package Recursion_1;
/*Recursion-1 > count11
Given a string, compute recursively (no loops) the number of "11" substrings in the string. The "11" substrings should not overlap.
count11("11abc11") ¡æ 2
count11("abc11x11x11") ¡æ 3
count11("111") ¡æ 1*/
public class c5_count11 {
	public int count11(String str) {
		  if(str.length()<2)return 0;
		  if(str.substring(0,2).equals("11"))
		  return 1+count11(str.substring(1));
		  return count11(str.substring(1));
		  /*
		    if(str.length()<2)return 0;
		    else{
		      String first=str.substring(0,2);
		      if(first.equals("11")){
		        return 1+count11(str.substring(2));
		      }
		      else{
		        return count11(str.substring(1));
		      }
		    }
		  */
		}
	
	// Solution
    public int scount11(String str) {
        if (str.length() < 2) return 0;
        if (str.substring(0, 2).equals("11")) return 1 + count11(str.substring(2));
        return count11(str.substring(1));
    }
}
