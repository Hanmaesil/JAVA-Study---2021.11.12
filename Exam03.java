import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {

		// �ǽ� : for���� ����Ͽ� ������ 2���� ����ϼ���

		Scanner sc = new Scanner(System.in);
		System.out.println("������!");
		System.out.print("���� �Է� : ");
		int j = sc.nextInt();
		
		for (int i = 1; i <= 9; i++) {
//			int j = 2;
			System.out.println(j + " * " + i + " = " + j * i);
		}

	}

}
