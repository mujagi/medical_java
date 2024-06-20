package p0620;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class C0620_학생성적 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int STU = 10;
		String[] stuNo = new String[STU]; // 학번
		String[] name = new String[STU];  // 이름
		int[][] score = new int[STU][4]; // 국영수, 합계
		double[] avg = new double[STU]; // 평균
		int[] rank = new int[STU]; // 등수
		String[] title =  {"학번","이름","국어","영어","수학","합계","평균","등수"};
		int s_count = 0; // 입력시 1씩 증가
		
		// 화면부분
		Loop1 : while(true) {
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
			
			switch(choice) {
			case 1:
				while(true) {
					System.out.println("[ 학생성적입력 ]");
					Date date = new Date();
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
					stuNo[s_count] = "S"+sdf.format(date)+String.format("%04d", s_count+1);
					System.out.println("이름을 입력해주세요. >> (0.이전화면) ");
					name[s_count] = scan.nextLine();
					if(name[s_count].equals("0")) {
						System.out.println("이전화면으로 돌아갑니다.");
						break;
					}
					for(int i=0;i<3;i++) {
						System.out.printf("%s점수를 입력해주세요. >> ",title[i+2]);
						score[s_count][i] = scan.nextInt();
						scan.nextLine();
						if(score[s_count][i]<0 || score[s_count][i]>100) {
							System.out.println("1~100 사이의 점수를 입력해주세요.");
							i--;
							continue;
						}// case1 if
						
						// 합계, 평균 
					}// case1 for
					score[s_count][3] = score[s_count][0]+score[s_count][1]+score[s_count][2];
					avg[s_count] = score[s_count][3]/3.0 ; //double 타입이므로 소숫점 찍어야함 
					
					//입력한 학생확인
					System.out.printf("학번 : %s 이름 : %s ",stuNo[s_count],name[s_count]);
					System.out.println();
					s_count++; //학생수 증감
				}// case 1 while 
				
				break;
				
				
			case 2:
				System.out.println("[ 학생 성적출력 ]");
				for(int i=0;i<title.length;i++) {
					System.out.printf("%s\t",title[i]);
				}
				System.out.println();
				System.out.println("---------------------------------------------");
				for(int i=0;i<s_count;i++) {
					System.out.printf("%s\t",stuNo[i]); //학번
					System.out.printf("%s\t",name[i]);  //이름
					for(int j=0;j<4;j++) {
						System.out.printf("%d\t",score[i][j]); //국어,영어,수학,합계
					}
					System.out.printf("%.2f\t",avg[i]); //평균
					System.out.printf("%d\t", rank[i]);  //등수
					System.out.println();
				}
				System.out.println();
				break;
				
			case 3:
				System.out.println("[ 학생성적수정 ]");
				
					System.out.println("수정하실 학생의 이름을 입력해주세요. >> (0. 이전단계 )");
					String n_search = scan.nextLine();
					int r_cnt = -1;
					for(int i=0;i<s_count;i++) {
						if(name[i].equals(n_search)) {
							r_cnt = i;
							System.out.printf("%s 학생을 찾았습니다. \n",name[r_cnt]);
							System.out.println("수정하실 과목을 선택해주세요. >> ");
							System.out.println("1. 국어");
							System.out.println("2. 영어");
							System.out.println("3. 수학");
							int r_search = scan.nextInt();
							scan.nextLine();
							switch(r_search) {
							case 1 :
								System.out.println("[ 영어성적수정 ]");
								System.out.printf("현재 %s점수 : %d \n",title[r_search+1],score[r_cnt][0]);
								
								System.out.printf(" 변경하실 %s점수를 입력해주세요. >>  \n",title[r_search+1]);
								int result = scan.nextInt();
								score[r_cnt][0] = result;
								score[r_cnt][3] = score[r_cnt][0]+score[r_cnt][1]+score[r_cnt][2];
								avg[r_cnt] = score[r_cnt][3]/3.0;
								System.out.printf("변경된 %s점수 : %d \n",title[r_search+1],score[r_cnt][0]);
								break;
							case 2 :
								System.out.println("[ 영어성적수정 ]");
								System.out.printf("현재 %s점수 : %d \n",title[r_search+1],score[r_cnt][1]);
								
								System.out.printf(" 변경하실 %s점수를 입력해주세요. >>  \n",title[r_search+1]);
								int result1 = scan.nextInt();
								score[r_cnt][1] = result1;
								score[r_cnt][3] = score[r_cnt][0]+score[r_cnt][1]+score[r_cnt][2];
								avg[r_cnt] = score[r_cnt][3]/3.0;
								System.out.printf("변경된 %s점수 : %d \n",title[r_search+1],score[r_cnt][1]);
								break;
								
							case 3 :
								System.out.println("[ 수학성적수정 ]");
								System.out.printf("현재 %s점수 : %d \n",title[r_search+1],score[r_cnt][2]);
								
								System.out.printf(" 변경하실 %s점수를 입력해주세요. >>  \n",title[r_search+1]);
								int result2 = scan.nextInt();
								score[r_cnt][2] = result2;
								score[r_cnt][3] = score[r_cnt][0]+score[r_cnt][1]+score[r_cnt][2];
								avg[r_cnt] = score[r_cnt][3]/3.0;
								System.out.printf("변경된 %s점수 : %d \n",title[r_search+1],score[r_cnt][2]);
								break;
							}// if switch
							break;
						}//if
						else {
							System.out.println("검색하신 학생이 존재하지 않습니다.");
							continue;
						}
					}//for
				
				
				
				break ;
				
			case 4:
				System.out.println("[ 학생검색 ]");
				System.out.println("1. 이름으로 검색 ");
				System.out.println("2. 합계로 검색 ");
				System.out.println("3. 평균점수로 검색 ");
				System.out.println("원하시는 번호를 입력해주세요. >> ");
				int s_choice = scan.nextInt();
				
				switch(s_choice) {
				case 1 :
					System.out.println("학생이름을 입력하세요");
					String t_name = scan.nextLine();
					
					for(int i=0;i<title.length;i++) {
						System.out.printf("%s\t",title[i]);
					}
					System.out.println();
					System.out.println("---------------------------------------------");
					int cnt = 0; //학생을 찾았는지 확인하는 변수
					for(int i=0;i<s_count;i++) {
						if(name[i].contains(t_name)) { // 조금이라도 글자가 포함되어있으면 true
//						if(name[i].equals(t_name)) {
								System.out.printf("%s\t",stuNo[i]); //학번
								System.out.printf("%s\t",name[i]);  //이름
								for(int j=0;j<4;j++) {
									System.out.printf("%d\t",score[i][j]); //국어,영어,수학,합계
								}
								System.out.printf("%.2f\t",avg[i]); //평균
								System.out.printf("%d\t", rank[i]);  //등수
								System.out.println();
								cnt=1;
							}
						}
						if(cnt==0) {
							System.out.println("찾는학생이 없습니다 다시 입력하세요.!!");
							System.out.println();
						}
					break;
				case 2:
					System.out.println("합계점수를 입력하세요");
					int t_score = scan.nextInt();
					scan.nextLine();
					
					for(int i=0;i<title.length;i++) {
						System.out.printf("%s\t",title[i]);
					}
					System.out.println();
					System.out.println("---------------------------------------------");
					int t_cnt = 0; //학생을 찾았는지 확인하는 변수
					for(int i=0;i<s_count;i++) {
						if(score[i][3] >= t_score) {
								System.out.printf("%s\t",stuNo[i]); //학번
								System.out.printf("%s\t",name[i]);  //이름
								for(int j=0;j<4;j++) {
									System.out.printf("%d\t",score[i][j]); //국어,영어,수학,합계
								}
								System.out.printf("%.2f\t",avg[i]); //평균
								System.out.printf("%d\t", rank[i]);  //등수
								System.out.println();
								t_cnt=1;
							}
						}
						if(t_cnt==0) {
							System.out.println("찾는학생이 없습니다 다시 입력하세요.!!");
							System.out.println();
						}
					break;
					
				case 3:
					System.out.println("평균점수를 입력하세요");
					double t_avg = scan.nextDouble();
					scan.nextLine();
					
					for(int i=0;i<title.length;i++) {
						System.out.printf("%s\t",title[i]);
					}
					System.out.println();
					System.out.println("---------------------------------------------");
					int a_cnt = 0; //학생을 찾았는지 확인하는 변수
					for(int i=0;i<s_count;i++) {
						if(avg[i] >= t_avg) {
								System.out.printf("%s\t",stuNo[i]); //학번
								System.out.printf("%s\t",name[i]);  //이름
								for(int j=0;j<4;j++) {
									System.out.printf("%d\t",score[i][j]); //국어,영어,수학,합계
								}
								System.out.printf("%.2f\t",avg[i]); //평균
								System.out.printf("%d\t", rank[i]);  //등수
								System.out.println();
								a_cnt=1;
							}
						}
						if(t_avg==0) {
							System.out.println("찾는학생이 없습니다 다시 입력하세요.!!");
							System.out.println();
						}
					break;
				}// case4 switch
				
				
				
				
				
				break;
				
			case 5:
				System.out.println("[ 등수처리 ]");
				for(int i=0;i<s_count;i++) {
					int count = 1;
					for(int j=0;j<s_count;j++) {
						if(score[i][3]<score[j][3]) { // 각각 비교  해야므로 i,j 따로 부
							count++;
						}// if
						rank[i] = count;
					}// j for
				}// i for
				System.out.println("등수처리가 완료되었습니다.");
				System.out.println();
				break;
				
			case 0 :
				System.out.println("[ 프로그램 종료 ]");
				System.out.println("프로그램을 종료합니다.");
				
				break Loop1;
				
			}// 메인메뉴 switch
			
		}// while

	}// main

}// class
