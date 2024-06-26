package Students;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Students {
	static int count = 1;
	{//초기화 블럭
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy");
		this.stuNo = "S"+sdf.format(d)+String.format("%03d", count++);
	}//초기화 블럭
	
	Students(){}//기본생성자
	
	Students(String name,int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = total/3.0;
	}//객체 초기화
	
	String stuNo;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
	
}//class
