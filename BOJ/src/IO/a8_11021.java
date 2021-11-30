package IO;

import java.util.Scanner;
import java.util.StringTokenizer;

/*
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
첫째 줄에 테스트 케이스의 개수 T가 주어진다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.

예제입력
5
1 1
2 3
3 4
9 8
5 2

출력
Case #1: 2
Case #2: 5
Case #3: 7
Case #4: 17
Case #5: 7
 */
public class a8_11021 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        StringTokenizer st;
        String str;
        int t=scan.nextInt();
        for(int i=1; i<=t; i++){
            str=scan.next();
            st=new StringTokenizer(str, " ");
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            System.out.println("Case #"+i+":"+(a+b));
        }
        scan.close();
    }
}
// https://st-lab.tistory.com/33
/*
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

		Scanner in = new Scanner(System.in);

		int a = in.nextInt();

		for (int i = 1; i <= a; i++) {
			int c = in.nextInt();
			int d = in.nextInt();

			System.out.println("Case #" + i + ": " + (c + d));
		}

		in.close();
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

		int a = Integer.parseInt(br.readLine());

		StringTokenizer st;
		for (int i = 1; i <= a; i++) {
			st = new StringTokenizer(br.readLine()," ");
			System.out.println("Case #" + i + ": "
			+(Integer.parseInt(st.nextToken())
			+Integer.parseInt(st.nextToken())));
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

		int a = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		for (int i = 1; i <= a; i++) {
			st = new StringTokenizer(br.readLine()," ");
			sb.append("Case #").append(i).append(": ")
			.append(Integer.parseInt(st.nextToken())
			+Integer.parseInt(st.nextToken())).append('\n');
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

		int a = Integer.parseInt(br.readLine());

		StringTokenizer st;
		for (int i = 1; i <= a; i++) {
			st = new StringTokenizer(br.readLine()," ");
			bw.write("Case #"+i+": ");
			bw.write(Integer.parseInt(st.nextToken())
				+Integer.parseInt(st.nextToken())+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
 */
/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String args[]) throws IOException {

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		int a = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= a; i++) {
			String str = br.readLine();
			sb.append("Case #").append(i).append(": ")
			.append(str.charAt(0)-'0'+str.charAt(2)-'0').append('\n');
		}
		System.out.println(sb);
	}
}

 */