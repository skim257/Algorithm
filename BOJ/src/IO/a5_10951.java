package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
입력은 여러 개의 테스트 케이스로 이루어져 있다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 */
public class a5_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<N; i++){
            st=new StringTokenizer(br.readLine(), " ");
            sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
