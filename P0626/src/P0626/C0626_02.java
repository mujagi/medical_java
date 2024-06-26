package P0626;

import java.util.Arrays;

public class C0626_02 {

	public static void main(String[] args) {
		Buyer b = new Buyer("aaa","1111",1000,0);
		
		
		
		
		//Tv구매
		Product t = new Tv();
		Product t2 = new Tv();
		
		b.buy(t); //Tv 1대를 구매
		b.buy(t2); //Tv 1대를 구매
		
		
		//컴퓨터구매
		Product c = new Computer();
		b.buy(c);

		
		//Audio구매
		Product a = new Audio();
		b.buy(a);

		
		//Refrigerator구매
		Product r = new Refrigerator();
		b.buy(r);
		b.buy(new Refrigerator());
		
		//cart 제품명, 가격을 모두 출력하세요
		b.summary();
		
		

		
		
		
	}//main

}//class
