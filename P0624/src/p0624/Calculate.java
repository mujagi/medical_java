package p0624;

import java.util.Scanner;

public class Calculate {
	static Scanner scan = new Scanner(System.in);
	void change(int[] score) {
	System.out.println("변경 국어점수를 입력하세요. >> ");
	score[0] =  scan.nextInt();
	
	System.out.println("변경 영어점수를 입력하세요. >> ");
	score[1] =  scan.nextInt();
	
	System.out.println("변경 수학점수를 입력하세요. >> ");
	score[2] =  scan.nextInt();
	
}
	
	
	
	// 메소드 1개로 사용해서 초라허눈 방법
//	void change(int kor,int eng, int math) {
//		System.out.println("변경 국어점수를 입력하세요. >> ");
//		kor =  scan.nextInt();
//		
//		System.out.println("변경 영어점수를 입력하세요. >> ");
//		eng =  scan.nextInt();
//		
//		System.out.println("변경 수학점수를 입력하세요. >> ");
//		math =  scan.nextInt();
//		
//		System.out.println("변경 국어점수 : "+kor);
//		System.out.println("변경 영어점수 : "+eng);
//		System.out.println("변경 수학점수 : "+math);
//	}
	
	//
	int kor_change(int kor) {
		
		System.out.println("변경 국어점수를 입력하세요. >> ");
		kor =  scan.nextInt();
		return kor ;
	}
	int eng_change(int eng) {
		
		System.out.println("변경 영어점수를 입력하세요. >> ");
		eng =  scan.nextInt();
		return eng ;
	}
	int math_change(int math) {
		
		System.out.println("변경 수학점수를 입력하세요. >> ");
		math =  scan.nextInt();
		return math ;
	}
	
	
	
	
	

//	int  result = 0;
//	// 메서드명 cal
//	int cal(int[] num, String str) {
//		for(int i=0; i<num.length;i++) {
//			
//			if(str.equals("+")) {
//				result += num[i];
//				System.out.println(result);
//			}
//			else if(str.equals("-")) {
//				
//				System.out.println(x-y);
//			}
//			else if(str.equals("*")) {
//				System.out.println(x*y);
//			}
//			else if(str.equals("/")) {
//				System.out.println(x/y);
//			}
//		}
//		return result;	
//		
//	}
	
}
