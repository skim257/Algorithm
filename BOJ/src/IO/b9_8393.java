package IO;

import java.util.Scanner;
/*
n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
1부터 n까지 합을 출력한다.

예제
입력
3

출력
6
 */
public class b9_8393 {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int sum=0;
        scan.close();
        for(int i=1; i<=num; i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
