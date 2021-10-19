package Recursion_1;
/*Recursion-1 > strDist
Given a string and a non-empty substring sub, compute recursively the largest substring which starts and ends with sub and return its length.
strDist("catcowcat", "cat") ¡æ 9
strDist("catcowcat", "cow") ¡æ 3
strDist("cccatcowcatxx", "cat") ¡æ 9*/
public class d3_strDist {
	public int strDist(String str, String sub) {
		  if(str.length()<sub.length())return 0;
		  if(str.substring(0,sub.length()).equals(sub)){
		    return str.length()+strDist(str.substring(1), sub);
		  }
		  return strDist(str.substring(1), sub);
		  
		  /*
		    if(str.length()<sub.length())return 0;
		    else if(str.length()==sub.length()){
		      if(str.equals(sub)){
		        return str.length();
		      }
		      else{
		        return 0;
		      }
		    }
		    else{
		      int len=sub.length();
		      String first=str.substring(0,len);
		      String last-str.substring(str.length()-len);
		      if(first.equals(sub)&&last.equals(sub)){
		        return str.length();
		      }
		      else if(first.equals(sub)&&!last.equals(sub)){
		        return strDist(str.substring(0,str.length()-1, sub);
		      }
		      else if(!first.equals(sub)&&last.equals(sub)){
		        return strDist(str.substring(1), sub);
		      }
		      else{
		        return strDist(str.substring(1,str.length()-1),sub);
		      }
		    }
		  */
		}
	
	// Solution
    public int sstrDist(String str, String sub) {
        if (str.length() < sub.length()) return 0;
        if (str.substring(0, sub.length()).equals(sub) && str.substring(str.length() - sub.length()).equals(sub)) return str.length();
        if (str.substring(0, sub.length()).equals(sub)) return strDist(str.substring(0, str.length() - 1), sub);
        return strDist(str.substring(1), sub);
    }
}
