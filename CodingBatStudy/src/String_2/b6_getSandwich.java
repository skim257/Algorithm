package String_2;
/*String-2 > getSandwich
A sandwich is two pieces of bread with something in between.
Return the string that is between the first and last appearance of "bread" in the given string,
or return the empty string "" if there are not two pieces of bread.
getSandwich("breadjambread") ¡æ "jam"
getSandwich("xxbreadjambreadyy") ¡æ "jam"
getSandwich("xxbreadyy") ¡æ ""*/
public class b6_getSandwich {
	public String getSandwich(String str) {
		  int count=0;
		  String s="";
		  int a=str.indexOf("b");
		  int b=str.lastIndexOf("b");
		  for(int i=0; i<str.length()-4; i++)
		  {
		    if(str.substring(i,i+5).equals("bread"))
		    {
		      count++;
		      s=str.substring(i+5,b);
		    }
		    if(count<2)
		    return "";
		  }
		  return s;
		}
	
	// Solution
    public String sgetSandwich(String str) {
        String out = "";
        if (str.length() > 10 && str.indexOf("bread") != str.lastIndexOf("bread")) {
            int start = str.indexOf("bread");
            int finish = str.lastIndexOf("bread");
            out = out + str.substring(start + 5, finish);
        }
        return out;
    }
}
