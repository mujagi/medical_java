package P0626;

import java.util.ArrayList;

public class Buyer {
	String userId ;
	String userPw ;
	int money;
	int bonusPoint;
//	Product[] cart = new Product[10];
	ArrayList list = new ArrayList(); //객체배열선언
//	int count;
	
	
	Buyer(){}
	Buyer(String userId,String userPw,int money, int bonusPoint){
		this.userId = userId;
		this.userPw = userPw;
		this.money = money;
		this.bonusPoint = bonusPoint;
	}
	
	public String getUserId() {
		return userId;
	}
	
	
	
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	void summary(){
		System.out.println("[ 구매내역 ]");
		int sum = 0;
		for(int i=0;i<list.size(); i++) {
			Product p = (Product)list.get(i);
			System.out.println(p.pName);
			sum+=p.price;
		}
		System.out.printf("총 구매개수 : %d개 \n",list.size());
		System.out.printf("%d 만원",sum);
	}
	
	//구매메소드 - 부모의 참조변수로 받겠다.
	void buy(Product p){
		if(money<p.price) {
			System.out.printf("잔액이부족합니다.(보유금액 : %d 만원)",money);
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		list.add(p); // 객체배열 추가 - add()
		System.out.printf("%s 제품을 구매했습니다.(보유금액 :%d 만원) \n",p.pName,money);
	}
	
	
	
}
