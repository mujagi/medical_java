package p0614;

import java.util.Scanner;

public class C0614_09 {

	public static void main(String[] args) {
//		int sca = 0
		// 두 숫자를 입력받아, 덧셈, 뺄샘, 곱셈, 나눗셈을 출력하세요		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num1 = scan.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		int num2 = scan.nextInt();
		System.out.println("덧셈 : "+(num1+num2));
		
		System.out.println("숫자를 입력하세요");
		int num3 = scan.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		int num4 = scan.nextInt();
		System.out.println("뺄셈 : "+(num3-num4));
		
		System.out.println("숫자를 입력하세요");
		int num5 = scan.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		int num6 = scan.nextInt();
		System.out.println("곱셈 : "+(num5*num6));
		
		System.out.println("숫자를 입력하세요");
		int num7 = scan.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		int num8 = scan.nextInt();
		System.out.println("나눗셈 : "+(num7/num8));
		

	}// main

}// class
