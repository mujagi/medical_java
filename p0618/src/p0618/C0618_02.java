package p0618;

import java.util.Scanner;

public class C0618_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요>>");
		String input = scan.nextLine();
		String flag = input.substring(7,8);
		String birthY = input.substring(0,2);
		int age = 0;
		System.out.println(birthY);
		if(flag.equals("1") || flag.equals("2") ) {
			age = 2024 - Integer.parseInt("19"+birthY);
			System.out.println(age);
		}
	}

}
