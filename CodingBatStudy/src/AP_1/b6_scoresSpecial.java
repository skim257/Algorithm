package AP_1;
/*AP-1 > scoresSpecial
Given two arrays, A and B, of non-negative int scores. A "special" score is one which is a multiple of 10, such as 40 or 90.
Return the sum of largest special score in A and the largest special score in B.
To practice decomposition, write a separate helper method which finds the largest special score in an array.
Write your helper method after your scoresSpecial() method in the JavaBat text area.
scoresSpecial([12, 10, 4], [2, 20, 30]) ¡æ 40
scoresSpecial([20, 10, 4], [2, 20, 10]) ¡æ 40
scoresSpecial([12, 11, 4], [2, 20, 31]) ¡æ 20*/
public class b6_scoresSpecial {
	public int scoresSpecial(int[] a, int[] b) {
		  int amax=0;
		  int bmax=0;
		  for(int i=0; i<a.length; i++){
		    if(ok(a[i])&&amax<a[i])amax=a[i];
		  }
		  for(int i=0; i<b.length; i++){
		    if(ok(b[i])&&bmax<b[i])bmax=b[i];
		  }
		  return amax+bmax;
		}

		public boolean ok(int e){
		  if(e%10==0)return true;
		  return false;
		}
		
	// Solution
	    public int sscoresSpecial(int[] a, int[] b) {
	        return ls(a) + ls(b);
	    }

	    public int ls(int[] nums) {
	        int out = 0;
	        for (int i:nums) {
	            if (i % 10 == 0 && i > out) out = i;
	        }
	        return out;
	    }
}
