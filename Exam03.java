import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {

		// 실습 : for문을 사용하여 구구단 2단을 출력하세요

		Scanner sc = new Scanner(System.in);
		System.out.println("구구단!");
		System.out.print("숫자 입력 : ");
		int j = sc.nextInt();
		
		for (int i = 1; i <= 9; i++) {
//			int j = 2;
			System.out.println(j + " * " + i + " = " + j * i);
		}

	}

}
