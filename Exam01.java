
public class Exam01 {

	public static void main(String[] args) {

		// 실습 : 1부터 100까지의 3의 배수의 총합 출력

//		int result = 0;
//		
//		for(int i = 1; i <= 100; i++) {
//			if(i%3 == 0) {
//				result += i;
//			}
//		}System.out.println(result);

//		for (int j = 1; j <= 100; j++) {
//			if(j%3 == 0) {
//				System.out.println(j);
//			}
//		}

		int a = 0;
		int b = 0;

		while (true) {
			a += 3;
			if (a > 101)
				break;
			b += a;
		}
		System.out.println(b);

	}

}
