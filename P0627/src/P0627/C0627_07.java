package P0627;

public class C0627_07 {

	public static void main(String[] args) {
		Person p1 = new Person(8801011011111L);
//		p1.id = 880101-1011111L;
		Person p2 = new Person(8801011011111L);
		
		System.out.println(p1);
		System.out.println(p2);
		
		if(p1.equals(p2)) {
			System.out.println("같습니다.");
		}else {
			System.out.println("다릅니다");
		}
		
		Students s = new Students("홍길동",100,100,99);
		System.out.println(s);
	}//main

}//class
