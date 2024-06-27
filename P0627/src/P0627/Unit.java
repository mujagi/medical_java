package P0627;

abstract public class Unit { //추상메서드 사용시 앞에 abstract

	int hitPoint; //현재 체력
	final int MAX_HP; //최대 체력
	

	
	Unit(int hp){
		MAX_HP = hp;
	}
	
	
	
	int x,y;
//	abstract void move(int x,int y); //추상메서드
	void stop() {
		
	}
}
