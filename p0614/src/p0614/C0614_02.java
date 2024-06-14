package p0614;

public class C0614_02 {

	public static void main(String[] args) {
		int score = 0;
//		int score; // 변수는 초기화 없이 사용할 수 없다.
		System.out.println(score);
		
		// 문자형
		char ch = 'a';
//		char ch2 = 'abc'; //불가능
		char ch3 = 'a';
		char ch4 = 'b';
		char ch5 = 'c';
		
		// 기본형타입 이외 모든 클래스(참조형)은 변수 선언 후 무조건 new 사용해야함
		String str = new String("abc");
		System.out.println(str);
		
		//String 클래스만 기본형처럼 사용가능
		String str2 = "abcde";
		System.out.println(str2);
		
		int max = 10;
		max = 30;
		System.out.println(max);
		
		final int MIN = 20; // 상수는 대문자
//		MIN = 10; // final 상수는 값을 변경할 수 없다.
		System.out.println(MIN);
	}// main

}// class
