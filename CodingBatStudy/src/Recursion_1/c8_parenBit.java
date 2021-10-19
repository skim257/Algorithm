package Recursion_1;
/*Recursion-1 > parenBit
Given a string that contains a single pair of parenthesis,
compute recursively a new string made of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".
parenBit("xyz(abc)123") ¡æ "(abc)"
parenBit("x(hello)") ¡æ "(hello)"
parenBit("(xy)1") ¡æ "(xy)"*/
public class c8_parenBit {
	public String parenBit(String str) {
		  if(str.length()<3)return str;
		  if(str.substring(0,1).equals("(")){
		    return str.substring(0,1)+parenBit(str.substring(1));
		  }
		  return parenBit(str.substring(1));
		  /*
		    char first=str.charAt(0);
		    char last=str.charAt(str.length()-1);
		    if(first=='('&&last==')')return str;
		    else if(first=='('&&last!=')') return parenBit(str.substring(0,str.length()-1));
		    else if(first!='('&&last==')') return parenBit(str.substring(1));
		    else{
		      return parenBit(str.substring(1,str.length()-1));
		    }
		  */
		}
	
	// Solution
    public String sparenBit(String str) {
        if (str.substring(0, 1).equals("(") && str.substring(str.length() - 1).equals(")")) return str;
        if (str.substring(0, 1).equals("(")) return parenBit(str.substring(0, str.length() - 1));
        return parenBit(str.substring(1));
    }
}
