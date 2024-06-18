package p0618;

import java.util.Scanner;

public class C0618_05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] score = new int[5];
		
//		int score[] = new int[5];
		score[0] = 1;
		score[1] = 2;
		score[2] = 3;
		score[3] = 4;
		score[4] = 5;
		
		for(int i=0;i<5;i++) {
			score[i] = i+1;
			System.out.println(score[i]);
					
		}
		
		
		
		for (int i=0; i<5; i++) {
			System.out.println(score[i]);
		}
		
		// 5개의 숫자를 입력받은 후 출력을 모두하시오.
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요 >>");
//		int input = scan.nextInt();
//		loop1: for (int i=0; i<5; i++) {
//			 break loop1;
//		}
//		System.out.println(input);

	}// main

} // class
