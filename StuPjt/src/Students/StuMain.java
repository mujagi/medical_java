package Students;


import java.util.ArrayList;

public class StuMain {

	public static void main(String[] args) {
		
		StuProcess sp = new StuProcess(); 
		
		Loop1 : while(true) {
			int choice = sp.screen();
			
			switch(choice) {
			
			case 1 : //학생성적 입력부분
				sp.stu_input();
				break;
				
			case 2 : //학생성적 출력부분
				sp.stu_print();
				break;
			
			case 3 : //학생성적 수정
				sp.stu_update();
				break;
				
			case 4 : //학생성적 검색
				sp.stu_search();
				break;
			}
				
		}//while
	}//main

}//class
