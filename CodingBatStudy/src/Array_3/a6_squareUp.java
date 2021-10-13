package Array_3;
/*Array-3 > squareUp
Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).
squareUp(3) ¡æ [0, 0, 1, 0, 2, 1, 3, 2, 1]
squareUp(2) ¡æ [0, 1, 2, 1]
squareUp(4) ¡æ [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]*/
public class a6_squareUp {
	public int[] squareUp(int n) {
		  int[] out=new int[n*n];
		  int a=0;
		  while(a<n+1){
		    for(int i=n; i<0; i--){
		      for(int j=0; j<n; j++){
		        out[i]=j;
		      }
		    }
		    a++;
		  }
		  return out;
		  /*
		    int[] array=new int[n*n];
		    for(int i=0; i<n; i++){
		      for(int j=0; j<n; j++){
		        if(j<n-i-1)continue;
		        array[i*n+j]=n-j;
		      }
		    }
		    return array;
		  */
		}

	// Solution
    public int[] ssquareUp(int n) {
        int[] result = new int[n * n];
        int pos = 0;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) result[pos++] = 0;
            for (int j = i; j > 0; j--) result[pos++] = j;
        }
        return result;
    }
}
