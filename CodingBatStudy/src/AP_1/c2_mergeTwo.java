package AP_1;
/*AP-1 > mergeTwo
Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates.
Return a new array containing the first N elements from the two arrays. The result array should be in alphabetical order and without duplicates.
A and B will both have a length which is N or more.
The best "linear" solution makes a single pass over A and B, taking advantage of the fact that they are in alphabetical order,
copying elements directly to the new array.
mergeTwo(["a", "c", "z"], ["b", "f", "z"], 3) ¡æ ["a", "b", "c"]
mergeTwo(["a", "c", "z"], ["c", "f", "z"], 3) ¡æ ["a", "c", "f"]
mergeTwo(["f", "g", "z"], ["c", "f", "g"], 3) ¡æ ["c", "f", "g"]*/
public class c2_mergeTwo {
	public String[] mergeTwo(String[] a, String[] b, int n) {
		  String[] out=new String[n];
		  int p=0;
		  for(int i=0; i<n; i++){
		    if(i<a.length&&
		        Integer.parseInt(a[i])<Integer.parseInt(a[i+1])){
		          if(i<b.length&&
		          Integer.parseInt(b[i])<Integer.parseInt(b[i+1])&&
		          Integer.parseInt(b[i])<Integer.parseInt(a[i]))
		          {out[p++]=b[i];}
		          out[p++]=a[i];
		        }
		        
		  }
		  return out;
		}
	
	// Solution
    public String[] smergeTwo(String[] a, String[] b, int n) {
        String[] result = new String[n];
        int indexResult = 0;
        int indexA = 0;
        int indexB = 0;
        while (indexResult < n) {
            if (a[indexA].compareTo(b[indexB]) < 0) result[indexResult++] = a[indexA++];
            else if (a[indexA].compareTo(b[indexB]) > 0) result[indexResult++] = b[indexB++];
            else {
                result[indexResult++] = a[indexA++];
                indexB++;
            }
        }
        return result;
    }
}
