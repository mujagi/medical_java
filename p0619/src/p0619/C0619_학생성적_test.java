package p0619;

import java.util.Scanner;

public class C0619_학생성적_test {

	public static void main(String[] args) {
		// 학생성적 10명 성적입력, 성적출력, 성적수정, 프로그램 종료
		Scanner scan = new Scanner(System.in); // 입력받기 위한 프로그램 구현
		
		final int STU = 10; // 총학생 수
		String[] stuNo = new String[STU]; // 학번
		String[] name = new String[STU]; // 이름
		int[][]score = new int[STU][4]; // 총학생수, 국어, 영어, 수학, 총합 
		double[] avg = new double[STU]; // 평균 소수점이 발생 하므로 double
		int s_count = 0 ; // 학생입력받을 때 1씩 증가하기 위한 count
		int[] rank = new int[STU]; 
		String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
		
		//프로그램 시작
		Loop1 :while(true) {
			System.out.println("[ 학생성적 프로그램 ]");
			System.out.println(" 1. 성적입력 ");
			System.out.println(" 2. 성적출력 ");
			System.out.println(" 3. 성적수정 ");
			System.out.println(" 4. 학생검색 ");
			System.out.println(" 5. 등수처리 ");
			System.out.println(" 6. 프로그램종료 ");
			System.out.println("---------------");
			
			System.out.println("원하시는 번호를 입력해주세요. >> ");
			int choice = scan.nextInt(); //번호입력받기
			scan.nextLine(); // nextInt 뒤에 안붙이면 다음 선택에서 자동으로 엔터해서 넘어가버림
			
			switch(choice) {
			case 1 :
				while(true) {
					System.out.println("[ 성적입력 ]");
					stuNo[s_count] = "S" + String.format("%04d",s_count+1); // 학번자동만들기 
					System.out.println("이름을 입력해주세요. >> (0.취소)");
					String input = scan.nextLine();
					
					name[s_count] = input;
					if(input.equals("0")) {
						break;
					}
					
					
					for(int i=0; i<3; i++) {
						System.out.printf("%s 점수를 입력해주세요. >> ",title[i+2]);
						int s_input = scan.nextInt();
						if(s_input<0 || s_input>100) {
							System.out.println("0~100 사이의 점수를 입력해주세요");
							i--;
							continue;
						}
						score[s_count][i] = s_input;
						score[s_count][3] = score[s_count][0]+score[s_count][1]+score[s_count][2];
						avg[s_count] = score[s_count][3]/3.0; // 소수점 안붙이면 int취급 
					}// 성적 for문
						
						
						System.out.printf("학번 : %s  이름 : %s \n",stuNo[s_count],name[s_count]);
						System.out.println("성적입력이 완료되었습니다.");
						scan.nextLine();
						s_count ++ ;
				}// while
				break;
				
			case 2 :
				System.out.println("[ 성적출력 ]");
				for(int i = 0; i<title.length; i++) {
					System.out.print(title[i]+"\t");
				} // 타이틀 출력 for
				System.out.println();
				for(int i = 0; i<s_count; i++) {
					System.out.print(stuNo[i]+"\t");
					System.out.print(name[i]+"\t");
					System.out.printf("%d\t %d\t %d\t %d\t %.2f \n",score[i][0],score[i][1],score[i][2],score[i][3],avg[i]);
				} // 입력값 출력 for
				break;
				
			case 3 :
				System.out.println("[ 성적수정 ] ");
				System.out.println("수정할 학생의 이름을 입력해주세요. >> (0.취소)");
				String search = scan.nextLine();
				if(search.equals("0")) {
					break;
				} // 이전 단계로 돌아가기 if
				int temp_no = -1;
				for(int i = 0; i<s_count; i++) {
					if(name[i].equals(search)) {
						temp_no = i;
						System.out.printf("%s 를 학생을 찾았습니다. ",name[temp_no]);
						System.out.println();
						System.out.println("수정할 과목을 선택해주세요 >> ");
						System.out.printf("1. %s \n",title[temp_no+2]);
						System.out.printf("2. %s \n",title[temp_no+3]);
						System.out.printf("3. %s \n",title[temp_no+4]);
						int score_ch = scan.nextInt();
						
						switch(score_ch) {
						case 1:
							System.out.printf("[ %s 성적수정]",title[temp_no+2]);
							System.out.println();
							System.out.printf("현재 %s점수 : %d",title[temp_no+2],score[temp_no][0]);
							System.out.println();
							System.out.printf("변경할 %s 점수를 입력해주세요",title[temp_no+2]);
							
							score[temp_no][score_ch-1] = scan.nextInt();
							
							//합계 평균수정
							score[temp_no][3] = score[temp_no][0]+score[temp_no][1]+score[temp_no][2];
							avg[temp_no] = score[temp_no][3]/3.0;
							System.out.printf("%s점수 변경이 완료되었습니다. ",title[temp_no+2]);
							System.out.println();
							break;
						case 2:
							System.out.printf("[ %s 성적수정]",title[temp_no+3]);
							System.out.println();
							System.out.printf("현재 %s점수 : %d",title[temp_no+3],score[temp_no][0]);
							System.out.println();
							System.out.printf("변경할 %s 점수를 입력해주세요",title[temp_no+3]);
							
							score[temp_no][score_ch-1] = scan.nextInt();
							
							//합계 평균수정
							score[temp_no][3] = score[temp_no][0]+score[temp_no][1]+score[temp_no][2];
							avg[temp_no] = score[temp_no][3]/3.0;
							System.out.printf("%s점수 변경이 완료되었습니다. ",title[temp_no+3]);
							System.out.println();
							break;
							
						case 3:
							System.out.printf("[ %s 성적수정]",title[temp_no+4]);
							System.out.println();
							System.out.printf("현재 %s점수 : %d",title[temp_no+2],score[temp_no][0]);
							System.out.println();
							System.out.printf("변경할 %s 점수를 입력해주세요",title[temp_no+4]);
							
							score[temp_no][score_ch-1] = scan.nextInt();
							
							//합계 평균수정
							score[temp_no][3] = score[temp_no][0]+score[temp_no][1]+score[temp_no][2];
							avg[temp_no] = score[temp_no][3]/3.0;
							System.out.printf("%s점수 변경이 완료되었습니다. ",title[temp_no+4]);
							System.out.println();
							break;
							
						} // 과목선택후 switch
					}// 학생찾았을경우 돌아가는 if
					else {
						System.out.println("입력하신 학생이 존재하지 않습니다. ");
						break;
					}
				}// for
			
				break;
			case 4:
				System.out.println("[ 학생검색 ]");
				System.out.println("검색하실 학생의 이름을 입력해주세요. >> ");
				String temp = scan.nextLine();
				for(int i=0; i<s_count;i++) {
					if(name[i].contains(temp)) {
						System.out.printf("%s 학생이 검색되었습니다. \t",name[i]);
						System.out.println("[ 성적출력 ]");
						for(int j = 0; j<title.length; j++) {
							System.out.print(title[j]+"\t");
						} // 타이틀 출력 for
						System.out.println();
						for(int k = 0; k<s_count; k++) {
							System.out.print(stuNo[k]+"\t");
							System.out.print(name[k]+"\t");
							System.out.printf("%d\t %d\t %d\t %d\t %.2f %d \n",score[k][0],score[k][1],score[k][2],score[k][3],avg[k],rank[k]);
						} // 입력값 출력 for
					}
				}
				break;
			
			case 5:
				System.out.println("[ 등수처리 ]");
				System.out.println("등수처리를 진행합니다.");
				break;
				
				
			case 6 :
				System.out.println("[ 프로그램 종료 ]");
				System.out.println("프로그램을 종료합니다.");
				break Loop1; //while문 종료
			}// switch
			
			
		}// while
		
		
		
	}// main

}// class
