package p0617;

import java.util.Scanner;

public class C0617_16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 구구단 2단에서 9단까지 출력 1,3,5,7,9 홀수단만 출력
		for(int i = 2; i<10; i++) {
			for(int j = 1; j<10; j++) {
				if(j%2 == 1) {
					System.out.printf("%d * %d = %d \n",i,j,i*j);
				}
			}
		}
		
		
		
		
//		int sum = 0;
//		int i = 0;
		// 1-10까지의 합을 출력하시오.
//		for(i = 1; i<=10; i++) {
//			sum = sum+i ;
//		}
//		System.out.println((i-1)+"까지의 합 : "+ sum);
		

		
		// 1-100 까지 합을 구하는데, sum 값이 150을 넘었을 때 i, sum 값을 출력하시오.
//		int sum = 0;
//		for (int i = 1; i<=100; i++) {
//			sum = sum+i;
//			if (sum >= 150) {
//				System.out.printf("i : %d, sum : %d ",i,sum);
//				break;
//			}
//		}
//		for(int i =1; i<=100; i++) {
//			sum = sum+i;
//			if(sum>=150) {
//				System.out.println("i : "+i);
//				break;
//			}
//		}
//		System.out.println("합계 : "+sum);
		
		
		// 구구단 출력
//		for(int i = 2; i<10; i++) {
//			System.out.printf("[%d 단]\n",i);
//			for(int j=1; j<10; j++){
////				System.out.println(i+"*"+j+"=" + i*j);
//				System.out.printf("%d * %d = %d \t",i,j,i*j);
//			}
//			System.out.println();
//		}
		
		// 입력받은 구구단 출력
//		int sum = 0 ;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자입력>>");
//		int num = scan.nextInt();
//		for (int i = 1; i<10; i++) {
//			sum = num*i;
//			System.out.println(sum);
//		}
		
		
		
		
		// 10번 입력을 받을 때 마다 합계를 출력
//		int sum = 0;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자 입력 >> ");
//		for(int i = 1; i<=10; i++) {
//			int num = scan.nextInt();
//			sum = sum +=num;
//			System.out.println(sum);
//		}
					
			
		
		
		
		// 1-100까지 홀수만 더해서 최종값을 출력하시오.
//		int sum = 0;
//		for(int i = 1; i <= 100; i++) {
//			if (i%2 == 1) {
//				sum = sum+i;
//			}
//		}
//		System.out.println(sum);
		
		// for문
//		int sum = 0;
//		for(int i = 0; i <= 10; i++) {
//			sum = sum + i ;
//			System.out.println("i : "+i);
//			System.out.println("sum : "+sum);
//		}
//		System.out.println("최종 sum : "+sum);

	} // main

}// class
