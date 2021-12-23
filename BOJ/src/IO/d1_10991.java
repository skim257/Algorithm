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
* *
예제 입력 3
2
예제 출력 3
  *
 * *
* * *
예제 입력 4
4
예제 출력 4
   *
  * *
 * * *
* * * *
 */
public class d1_10991 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<n*2-1; j++){

            }
        }
    }

    /*
    해설

        public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++)
        {
            for (int j = i; j <= n - 1; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i*2-1; j++)
            {
                if (j % 2 == 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
     */
}
