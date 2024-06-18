package p0618;

import java.util.Scanner;

public class C0618_01 {

	public static void main(String[] args) {
		// 주민번호 앞자리를 입력받아 봄, 여름, 가을, 겨울인지 출력하시오.
		// 990101-1011101
		// 나이를 출력하는 프로그램
		// 12-02 : 겨울, 03-05 : 봄, 06-08 : 여름, 09-11: 가을
		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호 앞자리를 입력하세요 >>");
		String input = scan.nextLine();
		System.out.println("입력 : " + input);
		String flag = input.substring(7,8);
		String birthY = input.substring(0,2);
		int age = 0;
		switch(flag) {
		case "1" : case "2" :
			age = 2024-Integer.parseInt("19"+birthY);
			System.out.println(age);
			break;
		case "3" : case "4" :
			age = 2024 - Integer.parseInt("20"+birthY);
			System.out.println(age);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//switch
//		input = input.substring(2,4);
//		switch(input) {
//		case "12" : case "01" : case "02" :
//			System.out.println("겨울");
//			break;
//		case "03" : case "04" : case "05" :
//			System.out.println("봄");
//			break;
//		case "06" : case "07" : case "08" :
//			System.out.println("여름");
//			break;
//		case "09" : case "10" : case "11" :
//			System.out.println("가을");
//			break;
//		
//		}
			
		
		
		
//		String str = "990101" ;
//		String birthM = str.substring(2,4);
//		System.out.println(birthM);
	}// main

}// class
