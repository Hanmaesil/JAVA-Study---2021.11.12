import java.util.Random;
import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {

		// 실습 : 구구단 2단 ~ 9단 까지 출력

		for (int i = 2; i <= 9; i++) {
			System.out.println("==" + i  + "단==");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
		
		
		
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 게임");
		int num1 = random.nextInt(9)+1;
		int num2 = random.nextInt(9)+1;
		
		int cnt = 3;
		
		while(cnt != 0) {
			System.out.print(num1 + " * " + num2 + " = ");
			int user = sc.nextInt();
			int answer = num1 * num2;
			
			if(user == answer) {
				System.out.println("정답입니다.");
				System.out.println("LIFE : " + cnt);
				num1 = random.nextInt(9)+1;
				num2 = random.nextInt(9)+1;
				
			}else {
				cnt--;
				System.out.println("오답입니다.");
				System.out.println("LIFE" + cnt);
				System.out.println("다시 풀어보세요.");
			}
				
			}System.out.println("Game Over");
		}
		
		
		
		
		

	}


