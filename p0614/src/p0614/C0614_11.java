package p0614;

public class C0614_11 {

	public static void main(String[] args) {
		byte a = 1;
		int n = 350;
		int c = a+n;
		System.out.println(c);

		char ch = 'A'; //A : 65, a : 97 32차이
		char ch2 = 'B'; //66
		System.out.println(ch+ch2);
		System.out.println((char)(ch+32));
		
		byte by = 10;
		byte by2 = 20;
		byte by3 = (byte)(by+by2);
		System.out.println(by3);
		
		int num = 1000000;
		int num2 = 2000000;
		long total = (long)num*num2;
		System.out.println(total);
		
		long num3 = 1000000L;
		long num4 = num*num3;
		System.out.println(num4);
		
		int num5 = 1000000;
		System.out.println(num/num5*1000000);
		System.out.println(num*num5/1000000); // 오버클럭
		
		char c1 = 'a';
		char c2 = (char)(c1+1); //강제 형변환
		System.out.println(c2);
		
		char c3 = c1++;
		System.out.println(c3); //
		char c4 = ++c1;
		System.out.println(c4); //
		
		int i = 'B' - 'A'; // A = 65, B = 66, C == 67, a=97, b=98, c=99
		System.out.println(i);
		
		// 문자 숫자는 - 문자숫자 '0'을 빼면 숫자 값이 나옴.
		int j = '2'-'0';
		System.out.println(j); // 0 = 48, 1 = 49, 2 = 50
		
		int k = '8' - '0';
		System.out.println(k);
	}// main

}// class
