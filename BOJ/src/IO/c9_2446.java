package IO;
import java.util.Scanner;
/*
첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.

예제 입력 1
5

예제 출력 1
*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********
 */
public class c9_2446 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < 2 * n; j++) {
                if (j >= n - i && j <= n + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                if (j > n + i) break;
            }
            System.out.println();

        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < 2 * n; j++) {
                if (j >= n - i && j <= n + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                if (j > n + i) break;
            }
            System.out.println();

        }
    }

    /*
    https://st-lab.tistory.com/57
    해설
    		Scanner in = new Scanner(System.in);

		int N = in.nextInt();

		// 역삼각형 코드
		for (int i = 0; i < N; i++) {	// 1 ~ N

			// 공백
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}

			// 별
			for (int k = 0; k < (2 * N - 1) - (2 * i); k++) {
				System.out.print("*");
			}

			System.out.println();
		}

		// 삼각형 코드
		for (int i = 0; i < N - 1; i++) {	// N+1 ~ 2N-1

			// 공백
			for (int j = 1; j < (N - 1) - i; j++) {
				System.out.print(" ");
			}

			// 별
			for (int k = 0; k < 3 + 2 * i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
     */
}
