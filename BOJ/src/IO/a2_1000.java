package IO;
/*
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

예제
1 2
출력
3
 */

import java.util.Scanner;

public class a2_1000 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("A:");
        int A=scan.nextInt();
        System.out.print("B:");
        int B=scan.nextInt();
        System.out.println(A+B);
    }
}

/*
    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            sc.close();

            System.out.println(a + b);
        }
    }
 */
