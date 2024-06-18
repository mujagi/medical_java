package p0618;

import java.util.Arrays;

public class C0618_06 {

	public static void main(String[] args) {
		
		//int 배열 10개를 선언해서 1,3,5,7,9.. 10개 입력해서 출력하시오
		
		int[] num = new int[10];
		for(int i=0; i<num.length; i++ ) { //배열의 길이
			num[i] = (2*i)+1;
		}
		System.out.println(Arrays.toString(num));
			
		
//		// 배열선언 - 주소는 0부터시작
//		int[] score = new int[5];
//		//초기화 - 값을 처음넣는 작업
//		score[0] = 1;
//		score[1] = 2;
//		score[2] = 3;
//		score[3] = 4;
//		score[4] = 5;
//		
//		// 배열선언, 초기화
//		int[] sc = {1,2,3,4,5};
//		// 배열선언 - 초기화
//		int[] sc2 = new int[] {1,2,3,4,5};
//		
//		// 배열선언
//		int[] s = new int[5];
//		for(int i=0;i<5;i++) {
//			s[i] = i+1;
//		}

	}// main

}// class
