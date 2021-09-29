package CodingBat_Warmup2;
/*
 * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".


altPairs("kitten") ¡æ "kien"
altPairs("Chocolate") ¡æ "Chole"
altPairs("CodingHorror") ¡æ "Congrr"
 */
public class altParis {
	public String altPairs1(String str) {
		  String result="";
		  for(int i=0; i<str.length(); i+=4)
		  {
		    result=result+str.substring(i,i+2);
		  }
		  return result;
	}
	
	// Solution
	public String altPairs2(String str) {
		  String result = "";
		  
		  // Run i by 4 to hit 0, 4, 8, ...
		  for (int i=0; i<str.length(); i += 4) {
		    // Append the chars between i and i+2
		    int end = i + 2;
		    if (end > str.length()) {
		      end = str.length();
		    }
		    result = result + str.substring(i, end);
		  }
		  
		  return result;
	}

}
