package IO;

import java.util.Scanner;

/*
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
첫째 줄에 A, 둘째 줄에 B가 주어진다. (0 < A, B < 10)
 */
public class a3_2558 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("A:");
        int A=scan.nextInt();
        System.out.print("B:");
        int B=scan.nextInt();
        scan.close();
        System.out.println("A+B="+(A+B));
    }
}