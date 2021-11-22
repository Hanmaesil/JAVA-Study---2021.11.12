
public class Exam07 {

	public static void main(String[] args) {

		// 실습 : 공포의 별찍기 3

//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		System.out.println("*");

//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print(" ");
//		System.out.print("*");
//		System.out.print("*");

		for (int a = 5; a >= 1; a--) {
			for (int i = 1; i <= a; i++)
				System.out.print("a");
			{
				for (int j = 1; j <= 1; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}

	}
}