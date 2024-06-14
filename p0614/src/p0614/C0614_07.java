package p0614;

public class C0614_07 {

	public static void main(String[] args) {
		
		
		// printf =  소수점 제한 출력가능, 8진수, 16진수 표현가능
		System.out.println(10.0/3);
		System.out.printf("%.2f \n",10.0/3); // 줄 단락을 입력해야함
		int x = 0x1a; // 16진수 표현 1a의 값은? 1X16+0X16 = 16
		System.out.println(x);
		System.out.printf("%X \n", x); // printf  = 16진수 출력가능
		
		long a = 10L;
		System.out.printf("%d \n", a);
		int b = 20;
		System.out.printf("%d \n", b);
		
		int age = 10;
		int year = 2014;
		System.out.printf("나이 : %d, 년도 :%d \n",age,year );
		System.out.println("나이 :"+age+"세, 년도 : "+year+"년");
		
		//자릿수
		System.out.printf("[%5d]\n",10); // 자릿수를 5로 지정 ___10
		System.out.printf("[%05d]\n",10); // 자릴수를 5러 지정 ___ 대신 0으로 채움 
		
	}// main

}// class
