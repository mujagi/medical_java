package p0624;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Stu_score2 {
	{
		count++;
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy");
		this.stuNo = "S"+sdf.format(d)+String.format("%04d", count);
	}
	
	Stu_score2(){}
	
	Stu_score2(String name,int kor,int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		total = kor+eng+math;
		avg = total/3.0;
	}
	
	static int count;
	String stuNo;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	int rank;
}
