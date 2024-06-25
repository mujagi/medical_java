package p0625;

public class C0625_07 {

	public static void main(String[] args) {
		Car c = new Car();
		Car c2 = null;
		Ambulance a = new Ambulance();
		Ambulance a2 = null;
		FireEngine f = new FireEngine();
		FireEngine f2 = null;
		
		//다형성 : 부모의 참조변수 자손의 객체를 다루는것
		//자손의 참조변수로 조상의 객체를 다루는것(X)
//		a2 = (Ambulance)c;
		
		c = a; //다형성 : 부모의 참조변수에 자손의 객체를 넣어줌
		if(c instanceof Ambulance) {
			System.out.println("가능합니다.");
			c=a;
		}
		a2 = (Ambulance)c; // 
		
		
		
//		c2 = a; //업캐스팅 //첫시작 엠뷸런스
//		f2 = (FireEngine)c2; //다운캐스팅 //첫시작이 엠뷸런스라서 에러 
		
//		//형변환 - 자손타입에서 조상타입 : 형변환타입생략가능
//		c2 = a; //Ambulance -> Car
//		c2.drive();
////		c2.siren() //부모의 참조변수로는 자손변수 사용불가능
//		
//		a2 = (Ambulance)c2;
//		a2.siren(); //자손의 참조변수로는 부모변수 사용가능
////		c2 = (Car)a;
//		a2 = (Ambulance)c2; //Car에서는 타입을 정해야 한다
		
		
		

	}//main

}//class
