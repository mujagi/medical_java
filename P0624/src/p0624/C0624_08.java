package p0624;

public class C0624_08 {

	public static void main(String[] args) {
		
		
		Stu_score stu;
//		stu.kor = 100; // new 를 안해줘서 에러
		Stu_score s = new Stu_score("s0001","홍길동",100,100,100); // 생성자
		System.out.println("합계 : "+s.total);
		System.out.println("평균 : "+s.avg);
		Stu_score s2 = new Stu_score(); // 생성자
		s.kor = 100; // 가능
		
		System.out.println("s.kor : "+ s.kor);
		
		
		
//		println_boolean();
//		println_char();
		
		int a = 10;
//		int a = 100;
		
		
		// 5 펙토리얼 = 5*4*3*2*1
		int result = 1;
		for(int i=5;i>0;i--) { // 5부터 시작 5,4,3,2,1 i-- 니까 순차적으로 내려감
			result*=i;
		}// for
		
		//change()
		C0624_08 c = new C0624_08();
		c.change();
		
		
		System.out.println(result);
		add(); //객체선언없이 클래스명.메소드명, 같은 클래스내에서는 클래스명 생략가능
	}// main
	
	void change() { // 인스턴스 메소드 - 객체선언 후 , 참조변수명.메소드명
		System.out.println(0);
	}

	void change(int a) {
		System.out.println(a);
	}
	
	void change(int a,int b) {
		System.out.println(a+b);
	}
	
	static void add() {// 메서드 밖에서만 새로운 메서드 생성가능
		
	}
}// class
