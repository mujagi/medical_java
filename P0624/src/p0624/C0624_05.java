package p0624;

import java.util.Scanner;

public class C0624_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//두수의 사칙연산 구하기
		System.out.println("숫자를 입력하세요.");
		int x = scan.nextInt() ;
		System.out.println("숫자를 입력하세요.");
		int y = scan.nextInt();
		System.out.println("사칙연산을 입력하세요");
		String str = scan.next();
		Calculate c = new Calculate();
//		int result = c.cal(x,y,str);
		int result = c.cal(num,str);
		
		
		
		
		
		
//		
//		if(str.equals("+")) {
//			System.out.println(x+y);
//		}
//		else if(str.equals("-")) {
//			System.out.println(x-y);
//		}
//		else if(str.equals("*")) {
//			System.out.println(x*y);
//		}
//		else if(str.equals("/")) {
//			System.out.println(x/y);
//		}
		
	}// main

}// class
