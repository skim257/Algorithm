package IO;

import java.util.Scanner;

/*
입력 받은 대로 출력하는 프로그램을 작성하시오.
입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다. 각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다. 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.
 */
public class b1_11718 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String o;
        while(scan.hasNext()){
            o=scan.nextLine();
            System.out.println(o);
        }
        scan.close();
    }
}
/*
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String input = sc.nextLine();
			System.out.println(input);
		}
		sc.close();
	}
}
 */