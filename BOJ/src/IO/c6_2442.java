package IO;

import java.util.Scanner;

/*
첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ..., N번째 줄에는 별 2×N-1개를 찍는 문제

별은 가운데를 기준으로 대칭이어야 한다.
입력
첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
출력
첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

예제 입력 1
5
예제 출력 1
    *
   ***
  *****
 *******
*********
 */
public class c6_2442 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        for(int i=t; i<0; i--){
            for(int j=t-1; j<0; j--){
                System.out.println(" ");
            }
            for(int k=1; k<i+k; k+=2){
                System.out.println("*");
            }
            for(int j=t-1; j<0; j--){
                System.out.println(" ");
            }
        }
        scan.close();
    }

/*
    참고용 해설설
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        for(int i=0;i<n;i++) {
            for(int j=1;j<2*n;j++) {
                if(j>=n-i && j<=n+i) { // 중앙을 기준으로 +-i 범위에서는 별을 찍는다.
                    System.out.print("*");
                }else { // 아닌 경우는 앞 자리에 공백을 채워준다.
                    System.out.print(" ");
                }
                if(j> n+i) break; // j가 별의 범위를 넘어서는 순간 반복문을 벗어난다.
            }
            System.out.println();
        }
    }*/
}
