package p0619;

public class C0619_lotto_test {

	public static void main(String[] args) {
		// 1. 중복되지 않은 6개의 정수를 추출하여 배열에 저장한다.
				// 2. 오름차순으로 정렬하여 보여준다.
				int num = 6; // ball의 개수
				int[] ball = new int[num]; // 랜덤하게 추출한 정수를 저장할 변수
				int temp;
				for (int i = 0; i < num; i++) {
					ball[i] = (int) (Math.random() * 45 + 1);

					if (i > 0) {
						for (int j = 0; j < i; j++) {
							if (ball[i] == ball[j]) {
								i--;
								break;
							}
						}
					}
					System.out.print(ball[i] + "\t");
				}
				System.out.println();
				for (int i = 0; i < num; i++) {
					for (int j = 0; j < num - 1 - i; j++) {
						if (ball[j] > ball[j + 1]) {
							temp = ball[j];
							ball[j] = ball[j + 1];
							ball[j + 1] = temp;
						}
					}
				}
				for (int k = 0; k < num; k++) {
					System.out.print(ball[k] + "\t");
				}
		
	}

}
