package Recursion_1;
/*Recursion-1 > countHi2
Given a string, compute recursively the number of times lowercase "hi" appears in the string,
however do not count "hi" that have an 'x' immedately before them.
countHi2("ahixhi") ¡æ 1
countHi2("ahibhi") ¡æ 2
countHi2("xhixhi") ¡æ 0*/
public class c7_countHi2 {
	public int countHi2(String str) {
		  if(str.length()<2) return 0;
		  if(str.substring(0,1).equals("x")){
		    if(str.substring(1,3).equals("hi")){
		      return countHi2(str.substring(1));
		    }
		    else{
		      return 0;
		    }
		  }
		  else{
		    if(str.substring(0,2).equals("hi")){
		      return 1+countHi2(str.substring(1));
		    }
		    else{
		      return 0;
		    }
		  }
		}
	
	// Solution
    public int scountHi2(String str) {
        if (str.length() < 2) return 0;
        if (str.substring(0, 2).equals("hi")) return 1 + countHi2(str.substring(1));
        if (str.length() > 2 && str.substring(0, 3).equals("xhi")) return countHi2(str.substring(3));
        return countHi2(str.substring(1));
    }
}
