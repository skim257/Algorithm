package IO;

import java.util.Scanner;

/*
두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
입력은 여러 개의 테스트 케이스로 이루어져 있다.

각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

입력의 마지막에는 0 두 개가 들어온다.

예제 입력
1 1
2 3
3 4
9 8
5 2
0 0

출력
2
5
7
17
7
 */
public class a6_10952 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(true) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            if (a == 0 && b == 0) {
                scan.close();
                break;
            }
            System.out.println(a+b);
        }
    }
}
/*
// Solution 1
Scanner 를 쓰면 시간이 너무 많이 걸린다. 그렇기 때문에 다른 입력 방식인 BufferedReader 을 쓸 것이다.
BufferedReader.readLine() 을 통해 입력 받게 되는데, 이는 문자열 한 줄을 한 번에 입력받기 때문에 공백까지 입력되어버린다. 그렇기 때문에 공백을 기준으로 문자열을 분리해주어야 한다.
두 가지 방법이 있는데 String.split() 을 통해 분리해주는 방법, StringTokenizer 로 분리되어 저장하면서 꺼내오는 방법이 있다.
다만 필자는 StringTokenizer 을 쓰겠다.
그리고 StringTokenizer 을 통해 문자열 분리한 뒤 꺼내오는 메소드, st.nextToken() 은 문자열을 반환하니 Integer.parseInt()로 int 형으로 변환시켜주어야 한다.
또한 StringBuilder 을 사용 할 것이다.
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		while(true) {

			st = new StringTokenizer(br.readLine()," ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			if(A==0 && B==0) {
				break;
			}
			sb.append((A+B)).append('\n');
		}
		System.out.println(sb);
	}
}
 */
/*
// Solution2
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();

		while(true) {

			String str = br.readLine();

			int A = str.charAt(0) - 48;
			int B = str.charAt(2) - 48;

			if(A==0 && B==0) {
				break;
			}
			sb.append((A+B)).append('\n');
		}
		System.out.println(sb);
	}
}
 */