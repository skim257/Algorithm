package IO;

import java.util.Scanner;

/*
N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
 */
public class b3_11720 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        String a=scan.next();
        scan.close();
        int sum=0;
        for(int i=0; i<num; i++){
            sum+=a.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}
