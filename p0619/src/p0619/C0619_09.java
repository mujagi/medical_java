package p0619;

import java.util.Scanner;

public class C0619_09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] stuNo = new String[3]; // 학번
		String[] name = new String[3]; // 학생이름
		int[][] score = new int[3][4]; // 학생 2명 국어, 영어, 수학, 합계 점수
		double[] avg = new double[3]; // 평균
		int[] rank = new int[3]; // 등수
		String[] title = {"학번", "이름", "국어", "영어", "수학", "합계", "평균"};
		// 프로그램 실행
		Loop1: while(true) {
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println("1. 성적입력 ");
			System.out.println("2. 성적출력 ");
			System.out.println("0. 프로그램 종료 ");
			System.out.println("---------------------------");
			System.out.println("원하는 번호를 입력하세요. >> ");
			int choice = scan.nextInt(); // 번호선택
			scan.nextLine();
			int s_count = 0;
			
			
			// 번호 입력 후
			switch(choice) {
			case 1: // 학번, 이름, 성적 입력받기
				System.out.println("[ 성적입력 ]");
				System.out.println("학번을 입력해주세요. >> ");
				stuNo[s_count] = scan.nextLine();
				System.out.println("이름을 입력해주세요. >> ");
				name[s_count] = scan.nextLine();
				for (int i = 0; i<3; i++) {
					System.out.printf("%s 점수를 입력해주세요. >> ",title[i+2]);
					score[s_count][i] = scan.nextInt();
				} // 점수입력 for문
				
				score[s_count][3] = score[s_count][0]+score[s_count][1]+score[s_count][2]; //합계
				avg[s_count] = score[s_count][3]/3.0; // 평균
				
				for(int i = 0; i<title.length; i++) {
					System.out.print(title[i]+"\t");
				} // 타이틀 펼치기 for 문 
				
				System.out.println();
				System.out.print(stuNo[s_count]+"\t");
				System.out.print(name[s_count]+"\t");
				System.out.printf("%d\t %d\t %d\t %d\t %.2f\t",score[s_count][0],score[s_count][1],score[s_count][2],score[s_count][3],avg[s_count]);
				System.out.println();
				System.out.println("------------------------------------------------------------------");
				s_count ++;
				break;
			case 2:
				System.out.println("[ 성적출력 ]");
				break;
			case 0 :
				System.out.println("[ 프로그램 종료 ]");
				break Loop1;
			}
			
			
			
			
			
			
		}
		
		
		

	} // main

} // class
