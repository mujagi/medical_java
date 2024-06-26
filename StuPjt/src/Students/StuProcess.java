package Students;

import java.util.ArrayList;
import java.util.Scanner;

public class StuProcess {
	ArrayList list = new ArrayList();
	Scanner scan = new Scanner(System.in);
	String[] title = {"학번","이름","국어","영어","수학","합계","평균","등수"};
	String stuNo,name;
	int kor,eng,math,total,rank;
	double avg;
	int choice;
	
	
	//화면생성
	int screen(){
		System.out.println("[ 학생성적 프로그램 ]");
		System.out.println();
		System.out.printf("[ 현재입력된 학생 수 : %d명 ]\n",list.size());
		System.out.println("-----------------------------------");
		System.out.println("[ 1.학생성적 입력 ]");
		System.out.println("[ 2.학생성적 출력 ]");
		System.out.println("[ 3.학생성적 수정 ]");
		System.out.println("[ 4.학생성적 검색 ]");
		System.out.println("[ 5.학생성적 삭제 ]");
		System.out.println("[ 6.등수처리 ]");
		System.out.println("[ 7.학생성적 정렬 ]");
		System.out.println("[ 8.프로그램 종료 ]");
		System.out.println("-----------------------------------");
		System.out.println();
		
		System.out.println("원하시는 번호를 입력해주세요. >> ");
		choice = scan.nextInt();
		scan.nextLine();
		
		return choice;
	}//screen
	
	//학생성적 입력버튼
	void stu_input() {
		while(true) {
			
		System.out.println("[ 학생성적 입력 ]");
		System.out.println();
		System.out.printf("%d 번째 학생의 이름을 입력해주세요. >> (0.취소) ",list.size()+1);
		System.out.println();
		
		name = scan.nextLine();
		if(name.equals("0")) {
			System.out.println("이전화면으로 돌아갑니다.");
			System.out.println();
			break;
		}//이전화면 돌아가기
		
		//학생입력받기
		for(int i=0; i<3; i++) {
			System.out.printf("%s 점수를입력해주세요. >> ",title[i+2]);
			if(i==0) {
				kor = scan.nextInt();
				scan.nextLine();
			}//if
			else if(i==1) {
				eng = scan.nextInt();
				scan.nextLine();
			}//else if
			else if(i==2) {
				math = scan.nextInt();
				scan.nextLine();
			}//else if
		}//for
		
		//리스트에 저장
		list.add(new Students(name,kor,eng,math));
		
		//저장완료 안내문구
		System.out.println();
		System.out.printf("%s 학생성적입력이 완료되었습니다.",name);
		System.out.println();
		System.out.println("-----------------------------------");
		}//while
	}//stu_input 성적입력
	
	//학생성적 출력
	void stu_print() {
		System.out.println("[ 학생성적 출력 ]");
		System.out.println();
		for(int i=0; i<title.length; i++) {
			System.out.printf(" %s\t ",title[i]);
		}//타이틀 출력
		System.out.println();
		System.out.println("-------------------------------------------------------------");
		for(int i = 0; i<list.size(); i++) {
			Students s = (Students)list.get(i);
			System.out.printf("%s\t %s\t %d\t %d\t %d\t %d\t %.2f\t   %d \n",
					s.stuNo,s.name,s.kor,s.eng,s.math,s.total,s.avg,s.rank);
		}
		System.out.println("-------------------------------------------------------------");
		System.out.println();
	}//stu_print 성적출력
	
	//학생성적수정
	void stu_update() {
		System.out.println("[ 학생성적수정 ]");
		
		int temp = stu_subsearch();
		
		if(temp==-1) {
			System.out.println("찾고자 하는 학생이 없습니다.");
			System.out.println();
		}
		
		//검색된 학생의 위치
		Students s = (Students)list.get(temp);
		
		//학생검색이 되었을 경우 과목선택지
		
		System.out.println("변경하실 과목을 선택해주세요.>> ");
		System.out.println("1.국어");
		System.out.println("2.영어");
		System.out.println("3.수학");
		
		choice = scan.nextInt();
		scan.nextLine();
		
		switch(choice) {
		case 1 :
			subject_update(s,s.kor,choice);
			break;
		
		case 2 :
			subject_update(s,s.eng,choice);
			break;
			
		case 3 :
			subject_update(s,s.math,choice);
			break;
			
		}//switch 수정할 과목선택
		
	}//stu_update 성적수정
	
	void subject_update(Students s,int score,int choice) {
		System.out.printf("%s 성적수정을 선택하셨습니다. \n",title[choice+1]);
		System.out.printf("현재 %s점수 : %d \n",title[choice+1],score);
		System.out.printf("수정하실 %s점수를 입력해주세요. >> \n",title[choice+1]);
		score = scan.nextInt();
		scan.nextLine();
		
		if(choice==1) {
			s.kor = score;
		}
		else if(choice==2) {
			s.eng = score;
		}
		else if(choice==3) {
			s.math = score;
		}
		
		//합계,평균 변경
		s.total = s.kor+s.eng+s.math;
		s.avg = s.total/3.0;
		
		System.out.printf("변경된 %s점수 : %d \n",title[choice+1],score);
		System.out.println();
		
	}//subject_update 성적수정 중복계산 함수
	
	//학생성적 검색
	void stu_search() {
		System.out.println("[ 학생성적 검색 ]");
		System.out.println();
		System.out.println("원하시는 검색방법을 선택해주세요. >> ");
		System.out.println("1. 이름으로 검색");
		System.out.println("2. 합계로 검색");
		System.out.println("3. 평균으로 검색");
		choice = scan.nextInt();
		scan.nextLine();
		ArrayList s_list = new ArrayList();
		
		
		switch(choice) {
		case 1 :
			System.out.println("이름으로 검색하기를 선택하셨습니다.");
			System.out.println("찾으실 학생의 이름을 입력해주세요. >> ");
			String search = scan.nextLine();
			
			break;
		
		case 2:
			break;
			
		case 3:
			break;
		}
		
		
		
		
	}//stu_search 학생성적 검색
	
	
	
	
	
	//학생검색창
	int stu_subsearch() {
		System.out.println("검색하실 학생의 이름을 입력해주세요. >> ");
		String search = scan.nextLine();
		int temp = -1;
		for(int i=0; i<list.size(); i++) {
			Students s = (Students)list.get(i); //리스트에서 학생불러오기
			if(s.name.equals(search)){
				temp = i;
				System.out.printf("%s 학생을 찾았습니다. \n",search);
				System.out.println();
				break;
			}//학생찾음
		}//for
		return temp;
	}//stu_subsearch 검색창
	
	
	
	
}//class
