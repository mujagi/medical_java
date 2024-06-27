package P0627;

public class C0627_03 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			//예외가 발생 될 것 같을 경우
			System.out.println(3);
			System.out.println(0/0); // 나누기는 0으로 못나눔 에러
			System.out.println(4);
		}//try
		catch(Exception e) { //예외가 발생된 경우 실행
			System.out.println(5);
			e.printStackTrace(); // 이거 적으면 에러가 난 부분 설명해줌
			
		}//catch
		System.out.println(6);

	}//main

}//class
