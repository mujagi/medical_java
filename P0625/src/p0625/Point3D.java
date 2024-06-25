package p0625;

public class Point3D extends Point { //상속선언 Point 의 자손
	int z;
	
	Point3D(){} //기본생성자
	
	Point3D(int x,int y,int z){
		//조상의 기본생성자를 만들지 않으면
		//super() 조상생성자 에러발생
		//super(x,y); 매개변수 조상생성자를 직접 입력해야함.
//		super(x,y);
		this.x = x;
		this.y = y;
		this.z = z;
	}
}// class
