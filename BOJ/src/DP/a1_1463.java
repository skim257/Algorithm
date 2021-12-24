package DP;

import java.util.Scanner;

/*
정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.

1. X가 3으로 나누어 떨어지면, 3으로 나눈다.
2. X가 2로 나누어 떨어지면, 2로 나눈다.
3. 1을 뺀다.
정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.

예제 입력 1
2
예제 출력 1
1
예제 입력 2
10
예제 출력 2
3
힌트
10의 경우에 10 -> 9 -> 3 -> 1 로 3번 만에 만들 수 있다.
 */
public class a1_1463 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int count=0;
        while(n!=0){
            if(n%2==0) {
                count+=1;
                n=n/2;
            }
            if(n%3==0){
                count+=1;
                n=n/3;
            }
            if(n!=0) {
                n-=1;
                count+=1;
            }
        }
        System.out.println(count);
    }

    /*
    https://odysseyj.tistory.com/19
        풀이
        Bottom-UP
        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.StringTokenizer;
        import java.util.ArrayList;
        import java.lang.Math;

        public class Main{
            public static void main(String[] args) throws IOException {
               BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
               int number = Integer.parseInt(br.readLine());
               int dp[] = new int[number+1];
               dp[0] = 0;
               dp[1] = 0;
               for (int i = 2; i <= number; i++){
                   dp[i] = dp[i-1] + 1;
                   if (i % 2 == 0) dp[i] = Math.min(dp[i], dp[i/2] + 1);
                   if (i % 3 == 0) dp[i] = Math.min(dp[i], dp[i/3] + 1);
               }
               System.out.println(dp[number]);
               br.close();

            }
        }

        Top-Down
        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;
        import java.util.StringTokenizer;
        import java.util.ArrayList;
        import java.lang.Math;

        public class Main{

            public static int d[];
            public static void main(String[] args) throws IOException {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                int number = Integer.parseInt(br.readLine());
                d = new int[number+1];
                System.out.println(calculate(number));
            }

            public static int calculate(int number){
                if (number == 1){
                    return 0;
                }
                if (d[number] > 0){
                    return d[number];
                }
                d[number] = calculate(number-1) + 1;
                if (number%3 == 0) {
                    d[number] = Math.min(d[number],calculate(number/3) +1);
                }
                if (number%2 == 0) {
                    d[number] = Math.min(d[number],calculate(number/2) +1);
                }
                return d[number];
            }
        }
     */
}
