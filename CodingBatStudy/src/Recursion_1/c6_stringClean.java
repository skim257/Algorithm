package Recursion_1;
/*Recursion-1 > stringClean
Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced to a single char. So "yyzzza" yields "yza".
stringClean("yyzzza") ¡æ "yza"
stringClean("abbbcdd") ¡æ "abcd"
stringClean("Hello") ¡æ "Helo"*/
public class c6_stringClean {
	public String stringClean(String str) {
		  if(str.length()<2) return str;
		  if(str.substring(0,1).equals(str.substring(1,2)))
		  return str.substring(0,1)+stringClean(str.substring(2));
		  return stringClean(str.substring(1));
		  /*
		    if(str.length()<=1)return str;
		    else{
		      char first=str.charAt(0);
		      char second=str.charAt(1);
		      if(first==second){
		        return stringClean(str.substring(1));
		      }
		      else{
		        return first+stringClean(str.substring(1));
		      }
		    }
		  */
		}

	// Solution
    public String sstringClean(String str) {
        if (str.length() < 2) return str;
        if (str.charAt(0) != str.charAt(1)) return str.substring(0, 1) + stringClean(str.substring(1));
        return stringClean(str.substring(1));
    }
}
