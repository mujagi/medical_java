package p0617;

public class C0617_17 {

	public static void main(String[] args) {
		//1 - 100까지랜덤숫자 10개를 생성해서... 10개의 숫자의 합을 출력하시오.
		int sum = 0;
		for (int i = 1; i<=10; i++) {
			int num = (int)(Math.random()*100)+1;
			sum = sum+num;
			System.out.println(num);
		}
		System.out.println("최종합 : "+sum);

	}// main

}// class
