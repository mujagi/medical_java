package p0614;

public class C0614_05 {

	public static void main(String[] args) {
		
		byte b = 127;
//		byte b2 = 128; //에러표시해줌
		b = (byte) (b+10);
		
		System.out.println(b); // 오버플로우 발생
		
		int num = 2147483647;
		num = num+1;
		System.out.println(num);
		
		
		//문자열 타입 변경
//		char ch = 'A';
////		char ch2 = "AA"; /에러 ' 사용해야하는데 "사용 그리고 문자가 2개이상임
//		char ch3 = ' ';
////		char ch3 = null; //null 안됨
//		
//		String str = "AA";
//		String str2 = "";
//		String str3 = null;
//		
//		String s1 = "A"+"B";
//		System.out.println(s1); // 결과 = AB
//		System.out.println(""+7+7+7); // 문자열 + 어떤타입 = 문자열로 바뀜
//		System.out.println(7+7+7+""+7); // 숫자값이 나오지만 타입은 문자 ""뒤에 +해준 숫자는 문자열로 취급해서 결과가 217
	}// main

}// class
