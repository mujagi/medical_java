package p0624;

import java.util.Scanner;

public class Stu_pro {
	int s_count = 0;
	
	Scanner scan = new Scanner(System.in);
	String stuNo,name;
	int kor,eng,math,total,rank;
	double avg;
	String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
	
	int screen() {
		//화면부분
				System.out.println("[ 학생성적 프로그램 ]");
				System.out.println(" 1. 학생성적입력 " );
				System.out.println(" 2. 학생성적출력 " );
				System.out.println(" 3. 학생성적수정 " );
				System.out.println(" 4. 학생검색 " );
				System.out.println(" 5. 등수처리 " );
				System.out.println(" 0. 프로그램 종료 " );
				System.out.println("----------------------------");
				System.out.println("원하시는 번호를 입력해주세요. >> ");
				int choice = scan.nextInt();
				scan.nextLine(); // nextInt 다음에 질문지를 추가작성하면 무조건 삽입
				
				return choice;
		
	}
}
