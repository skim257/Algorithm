package IO;
import java.util.Scanner;
/*
첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.

예제 입력 1
3

예제 출력 1
  *
 **
***
 **
  *
 */
public class c8_2522 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        for(int i=1; i<n; i++){
            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            for(int j=1; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0; i<n-1; i++){
            for(int j=0; j<=i-1; j++){
                System.out.print(" ");
            }
            for(int k=0; k<n-i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
    import java.util.Scanner;

    public class N2522 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            for(int p=0; p<n; p++) {
                for(int q=0; q<n-p-1; q++) {
                    System.out.print(" ");
                }
                for(int q=0; q<=p; q++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            for(int p=1; p<n; p++) {
                for(int q=0; q<p; q++) {
                    System.out.print(" ");
                }
                for(int q=0; q<=n-p-1; q++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }

    }
     */
}
