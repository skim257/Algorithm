package IO;

import java.util.Scanner;

/*
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 */
public class a4_10950
{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int T=scan.nextInt();
        for(int i=0; i<T; i++){
            int A=scan.nextInt();
            int B=scan.nextInt();
            System.out.println(A+B);
        }
        scan.close();
    }
}
