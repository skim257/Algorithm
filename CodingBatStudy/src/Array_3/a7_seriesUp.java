package Array_3;
/*Array-3 > seriesUp
Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping).
Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.
seriesUp(3) ¡æ [1, 1, 2, 1, 2, 3]
seriesUp(4) ¡æ [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
seriesUp(2) ¡æ [1, 1, 2]*/
public class a7_seriesUp {
	public int[] seriesUp(int n) {
		  int[] out=new int[n*(n+1)/2];
		  int a=0;
		  for(int i=0; i<n; i++){
		    for(int j=0; j<n-i; j++)out[a++]=1;
		    for(int k=i; k>0; k++)out[a++]=k;
		  }
		  return out;
		}
	
	// Solution
    public int[] sseriesUp(int n) {
        int[] result = new int[n * (n + 1) / 2];
        int pos = 0;
        int i = 1;
        while (i <= n + 1) {
            for (int j = 1; j < i; j++) result[pos++] = j;
            i++;
        }
        return result;
    }
}
