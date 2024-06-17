package p0617;

import java.util.Scanner;

public class C0617_15 {

	public static void main(String[] args) {
//		Math.random(); // 0 <= x && x < 1
		
		// 1부터 10까지 랜덤숫자를 생성해서
		// 숫자 1개를 입력받아 정답인지 아닌지 출력하시오.
		// 같으면 당첨, 다르면 꽝
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하시오.");
		int num = scan.nextInt();
		int num2 = (int)(Math.random()*10)+1;
		if (num==num2) {
			System.out.println("당첨");
		}else {
			System.out.println("꽝");
		}
		System.out.println(num2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		// 1부터 100까지 숫자를 랜덤으로 생성해서 출력하시오
//		int num = (int)(Math.random()*100)+1;
//		System.out.println(num);
//		// 1부터 3까지 랜덤숫자
//		int num2 = (int)(Math.random()*3)+1;
//		System.out.println(num2);
//		// 1부터 45까지
//		int num3 = (int)(Math.random()*44)+1;
//		System.out.println(num3);
//		
		
		
		
		
		
//		System.out.println(Math.random());
		
//		// 0-9 까지 
//		int n = (int)(Math.random()*10);
//		// 0-10 까지
//		int n1 = (int)(Math.random()*11);
//		//2부터 10까지
//		int n2 = (int)(Math.random()*9)+2;
//		
//		// 1 - 10 까지 랜덤숫자를 출력
//		int num = (int)(Math.random()*10)+1;
//		System.out.println(num);
//		// 1-100 까지 랜덤숫자를 출력
//		int num2 = (int)(Math.random()*100)+1;
//		System.out.println(num2);
//		// 0-4 까지 출력
//		int num3 = (int)(Math.random()*5);
//		System.out.println(num3);
//		// 0-19
//		int num4 = (int)(Math.random()*20);

	}// main

}// class
