package Array_1;
/*Array-1 > middleWay
Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
middleWay([1, 2, 3], [4, 5, 6]) ¡æ [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) ¡æ [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) ¡æ [2, 4]*/
public class b1_middleWay {
	public int[] middleWay(int[] a, int[] b) {
		  return new int[] {a[1], b[1]};
		}
	
	// Solution
    public int[] smiddleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }
}
