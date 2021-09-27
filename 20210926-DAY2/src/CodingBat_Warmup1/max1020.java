package CodingBat_Warmup1;

public class max1020 {
	public int max10201(int a, int b) {
		int tmp=0;
		  if((a>=10&&a<=20)&&(b>=10&&b<=20))
		  {  
		    if(a<b)
		    tmp=b;
		  }
		  else if((a>=10&&a<=20)&&(b>=10&&b<=20))
		  {
		    if(a>b)
		    tmp=a;
		  }
		  else
		  {
		    return b;
		  }
		 return tmp;
	}
	
	// Solution
	public int max10202(int a, int b) {
		  // First make it so the bigger value is in a
		  if (b > a) {
		    int temp = a;
		    a = b;
		    b = temp;
		  }
		  
		  // Knowing a is bigger, just check a first
		  if (a >= 10 && a <= 20) return a;
		  if (b >= 10 && b <= 20) return b;
		  return 0;
	}
}
