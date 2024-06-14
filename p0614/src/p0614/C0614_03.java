package p0614;

public class C0614_03 {

	public static void main(String[] args) {
		
		boolean power = true;
		char ch = 'A';
		
		System.out.println(ch);
		
		char ch2 = '\u0041'; // 16진수
		System.out.println(ch2); 
		
		char ch3 = 'A';
		System.out.println((int)ch3); // 형변환 아스키코드
		
		int a = 65; // a=97, A=65, 0=48
		System.out.println(a);
		System.out.println((char)a); // 형변환 
		
		int hex = 0x100; //16진수
		System.out.println(hex);
	}// main

}// class
