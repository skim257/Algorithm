package CodingBat_Warmup1;

public class loneTeen {
	public boolean loneTeen1(int a, int b) {
		  if((a>=13&&a<=19)&&(b>=13&&b<=19))
		    return false;
		  else if((a>=13&&a<=19)||(b>=13&&b<=19))
		    return true;
		  else 
		    return false;
	}
	
	// Solution
	public boolean loneTeen2(int a, int b) {
		  // Store teen-ness in boolean local vars first. Boolean local
		  // vars like this are a little rare, but here they work great.
		  boolean aTeen = (a >= 13 && a <= 19);
		  boolean bTeen = (b >= 13 && b <= 19);
		  
		  return (aTeen && !bTeen) || (!aTeen && bTeen);
		  // Translation: one or the other, but not both.
		  // Alternately could use the Java xor operator, but it's obscure.
	}

}
