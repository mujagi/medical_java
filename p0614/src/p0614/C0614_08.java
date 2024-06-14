package p0614;

import java.util.Scanner;

public class C0614_08 {

	public static void main(String[] args) {
		//input()
//		java.util.Scanner scan = new java.util.Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		
		// 숫자 - nextInt(),nextDouble()
		System.out.println("숫자를 입력하세요.");
//		int num = scan.nextInt(); //
		String num = scan.nextLine();
		System.out.println("숫자 2를 입력하세요");
		String num2 = scan.nextLine();
		
		// 기본형 타입 같은 경우, 형변환
		// String 참조형 타입
		int number1 = Integer.parseInt(num); // 참조형 문자열 타입을 정수형 타입으로 변경
		int number2 = Integer.parseInt(num2); // 참조형 문자열 타입을 정수형 타입으로 변경
		
		System.out.println("입력한 숫자 :"+(number1+number2));
		
		// 문자열 - next(), nextLine() // next : 사이띄우기 안됨 이어써야 쭉 출력 nextLine : 띄워쓰기를 해도 그대로 출력
//		System.out.println("문자를입력하세요.");
//		String str3 = scan.nextLine();
//		System.out.println("입력한 문자3 : "+str3);
//		
//		System.out.println("문자를입력하세요.");
//		String str =  scan.next();
//		System.out.println("입력한 문자 : "+str);
//		
//		System.out.println("문자를입력하세요.");
//		String str2 = scan.next();
//		System.out.println("입력한 문자2 : "+str2);
		
		
		
	}// main

}// class
