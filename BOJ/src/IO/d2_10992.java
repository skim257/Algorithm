package IO;
import java.util.Scanner;
/*
첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

예제 입력 1
1
예제 출력 1
*
예제 입력 2
2
예제 출력 2
 *
***
예제 입력 3
3
예제 출력 3
  *
 * *
*****
예제 입력 4
4
예제 출력 4
   *
  * *
 *   *
*******
 */
public class d2_10992 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int p=0; p<n-1; p++) {
            System.out.print(" ");
        }
        System.out.print("*");
        System.out.println("");

        for(int p=0; p<n-2; p++) {
            for(int q=0; q<n-p-2; q++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for(int q=0; q<2*p+1; q++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("");
        }

        if(n!=1) {
            for(int p=0; p<2*n-1;p++) {
                System.out.print("*");
            }
        }

    }
}
