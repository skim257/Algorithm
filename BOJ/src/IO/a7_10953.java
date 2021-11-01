package IO;

import java.util.Scanner;
import java.util.StringTokenizer;

/*
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
첫째 줄에 테스트 케이스의 개수 T가 주어진다.
각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. A와 B는 콤마(,)로 구분되어 있다. (0 < A, B < 10)
각 테스트 케이스마다 A+B를 출력한다.
 */
public class a7_10953 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String in=scan.next();
        int a=Integer.parseInt(in.substring(0,in.indexOf(',')));
        int b=Integer.parseInt(in.substring(in.indexOf(',')));
        System.out.println("a+b");
    }

/*    public static void main2(String[] args){
        Scanner scan=new Scanner(System.in);
        String Tokenizer st;
        String str;
        int t=scan.nextInt();
        for(int i=0; i<t; i++){
            str=scan.next();
            st=new StringTokenizer(str,",");
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            sSystem.out.println(a+b);
        }
        scan.close();
    }*/
}
