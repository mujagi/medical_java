package P0701;

public class C0701_01 {

	public static void main(String[] args) {
		Card c = new Card();
//		c.number = 15;
		c.setNumber(12);
		System.out.println(c.getNumber());
		c.setPassword("1111");
		System.out.println(c.getPassword("admin"));
		
		
		
	}//main

}//class
