package IO;
import java.util.Scanner;
/*
첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.

예제 입력 1
5

예제 출력 1
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
 */
public class c7_2445 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0; i<2*n; i++){
            for(int j=0; j<n; j++){
                System.out.println("*");
            }
            for(int k=0; k<i*2-1; k++){
                System.out.println(" ");
            }
        }
    }

    /*
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();

        for(int p =0; p<n; p++) {
            for(int q = 0; q<p+1; q++) {
                System.out.print("*");
            }
            for(int q = 0; q<n-p-1; q++) {
                System.out.print(" ");
            }
            for(int q = 0; q<n-p-1; q++) {
                System.out.print(" ");
            }
            for(int q = 0; q<p+1; q++) {
                System.out.print("*");
            }
            System.out.println();

        }

        for(int p =1; p<n; p++) {

            for(int q = 0; q<n-p; q++) {
                System.out.print("*");
            }
            for(int q = 0; q<p; q++) {
                System.out.print(" ");
            }
            for(int q = 0; q<p; q++) {
                System.out.print(" ");
            }
            for(int q = 0; q<n-p; q++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
     */
}
