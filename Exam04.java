import java.util.Random;
import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {

		// �ǽ� : ������ 2�� ~ 9�� ���� ���

		for (int i = 2; i <= 9; i++) {
			System.out.println("==" + i  + "��==");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}
		
		
		
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ����");
		int num1 = random.nextInt(9)+1;
		int num2 = random.nextInt(9)+1;
		
		int cnt = 3;
		
		while(cnt != 0) {
			System.out.print(num1 + " * " + num2 + " = ");
			int user = sc.nextInt();
			int answer = num1 * num2;
			
			if(user == answer) {
				System.out.println("�����Դϴ�.");
				System.out.println("LIFE : " + cnt);
				num1 = random.nextInt(9)+1;
				num2 = random.nextInt(9)+1;
				
			}else {
				cnt--;
				System.out.println("�����Դϴ�.");
				System.out.println("LIFE" + cnt);
				System.out.println("�ٽ� Ǯ�����.");
			}
				
			}System.out.println("Game Over");
		}
		
		
		
		
		

	}


