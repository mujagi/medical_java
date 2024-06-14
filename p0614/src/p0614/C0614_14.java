package p0614;

import java.util.Scanner;

public class C0614_14 {

	public static void main(String[] args) {
		
		// 입력한 숫자가 양수인지 음수인지 출력하시오 0은 양수로 출력하세요
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		double input = scan.nextDouble();
		if (input>=0) {
			System.out.println("양수입니다");
		}else {
			System.out.println("음수입니다");
		}
		
		
//		int a = 10;
//		if (a == 10) {
//			System.out.println("10입니다.");
//		}else {
//			System.out.println("10이 아닙니다.");
//		}
//		if (a>0) {
//			System.out.println("양수입니다");
//		} else {
//			System.out.println("음수입니다");
//		}

	}//main

}// class
