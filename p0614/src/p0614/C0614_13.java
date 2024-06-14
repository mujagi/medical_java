package p0614;

import java.util.Scanner;

public class C0614_13 {

	public static void main(String[] args) {
//		float pi = 3.141592f;
//		float shortPi = (int)(pi*1000)/1000f;
//		System.out.println(shortPi);
		
		// 입력한 숫자를 소수점 2자리까지 절사하시오
		Scanner scan = new Scanner(System.in);
		System.out.println("소수를 입력해주세요");
		double input = scan.nextDouble();
//		System.out.println((int)(input*100)/100d); // 절사 floor()
//		System.out.println(Math.round(input*1000)/1000d); // 반올림 round
//		System.out.println(Math.ceil(input*1000)/1000d); // 올림 ceil
		System.out.println(Math.floor(input*100)/100d); // 버림 floor

	}// main

}// class
