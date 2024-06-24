package p0624;

import java.util.Scanner;

public class C0624_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[3];
		
		for(int i=0; i<3; i++) {
			System.out.println((i+1)+"번째 숫자를 입력해주세요");
			num[i] = scan.nextInt();
		}
		
		// 객체선언후, 참조변수명.메소드명
		Cal c = new Cal();
//		int result = c.add(num[0],num[1],num[2]);
		
		int sum = c.add2(num);
		System.out.println("합계 : "+ sum);
		
		
		//두 수를 입력받아, 두 수를 더한 값을 출력하시오
//		System.out.println("첫번째 숫자를 입력하세요. >> ");
//		int num1 = scan.nextInt();
//		System.out.println("두번째 숫자를 입력하세요. >> ");
//		int num2 = scan.nextInt();
//		System.out.println(num1+num2);
		// 두번쨰 방법
//		int[] sum = new int[3];
//		for(int i=0;i<sum.length;i++) {
//			System.out.println("숫자를 입력하세요");
//			sum[i] = scan.nextInt();
//		}
//		System.out.println(sum[0]+sum[1]+sum[2]);
		
		// 3번째 방법
//		int sum2 = 0;
//		for(int i=0;i<3;i++) {
//			int num = scan.nextInt();
//			sum2 += num;
//		}
//		System.out.println(sum2);
	}// main

}// class
