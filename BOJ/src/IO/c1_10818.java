package IO;

import java.util.*;

/*
N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.

예제
입력
5
20 10 35 30 7

출력
7 35
 */
public class c1_10818 {
    public static void main(String[] args) {
/*        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        String s=scan.next();
        int[] out=new int[a];
        scan.close();
        int max=0, min=0;
        for(int i=0; i<s.length()-1; i++){
            out[i]=Integer.parseInt(s.substring(i,s.indexOf(" ")));
            if(max>out[i]){
                max=out[i];
            }
            if(min<out[i]){
                min=out[i];
            }
        }
        System.out.println(min+" "+max);*/

        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=in.nextInt();
        }
        in.close();
        Arrays.sort(arr);
        System.out.println(arr[0]+" "+arr[n-1]);
    }
}
