package IO;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
첫째 줄에 테스트 케이스의 개수 T가 주어진다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
각 테스트 케이스마다 "Case #x: A + B = C" 형식으로 출력한다. x는 테스트 케이스 번호이고 1부터 시작하며, C는 A+B이다.

예제 입력
5
1 1
2 3
3 4
9 8
5 2

출력
Case #1: 1 + 1 = 2
Case #2: 2 + 3 = 5
Case #3: 3 + 4 = 7
Case #4: 9 + 8 = 17
Case #5: 5 + 2 = 7
 */
public class a9_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int x=Integer.parseInt(br.readLine());
        StringBuilder sb=new StringBuilder();
        StringTokenizer st;
        for(int i=1; i<=x; i++){
            st=new StringTokenizer(br.readLine(), " ");
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            sb.append("Case #"+ i + ": " + a + "+" + b + "=" + (a+b) + "\n" );
//            sb.append("Case #").append(i).append(": ").append(st.nextToken()).append(Integer.parseInt(st.nextToken())+
//                    Integer.parseInt(st.nextToken())).append('\n');
            // sb.append("Case #"+ i + ": " + (Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())) + "\n" );
        }
        br.close();
        System.out.println(sb);
    }
}
/*
public class Main {
	public static void main(String args[]) throws IOException {

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		int A;
		int B;

		StringTokenizer st;
		for (int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine()," ");
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A+B));
		}
		br.close();
	}

}
 */
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	public static void main(String args[]) throws IOException {

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		int A;
		int B;

		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		for (int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine()," ");
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());

			sb.append("Case #" + i + ": ").append(A + " + " + B + " = " + (A+B)).append('\n');
		}
		br.close();
		System.out.println(sb);
	}

}
 */
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		int A;
		int B;

		StringTokenizer st;
		for (int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine()," ");

			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());

			bw.write("Case #"+i+": ");
			bw.write(A + " + " + B + " = ");
			bw.write((A+B) + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
 */