
public class Exam06 {

	public static void main(String[] args) {

		// 실습 : 공포의 별찍기 2

//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.print("*");
//		System.out.println();

		for (int j = 5; j >= 1; j--) {
			for (int i = 1; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
