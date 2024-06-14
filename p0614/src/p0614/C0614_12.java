package p0614;

import java.util.Scanner;

public class C0614_12 {

	public static void main(String[] args) {
		// 대문자를 입력하면 소문자로 출력하시오
		Scanner scan = new Scanner(System.in);
		
		System.out.println("알파벳 대문자를 입력해주세요");
		String str = scan.next();
//		char input = str.charAt(0); // 문자열에서 0번째 문자를 가져옴 ex) "ABC"를 입력했다면 0번째인 A를 가져옴
//		System.out.println((char)(input+32));
		System.out.println(str.toLowerCase()); // 문자열 메소드 사용 toLowerCase 는 대문자를 소문자로 toUpperCase는 소문자를 대문자로
	}// main

}// class
