package p0625;

public class Deck {
	// 1,2,3....11-J,12-Q,13-K 13*4 = 52장
	Card[] c = new Card[52]; //배열선언
	Card[] cc = new Card[5];
	String[] shape = {"CLOVER","HEART","DIAMOND","SPADE"};
	int count = 0;
	
	Deck(){ //기본생성자
		for(int i=0;i<52;i++) {
			c[i] = new Card(i%13+1,shape[i/13]);//객체선언
		}//for
	}//Deck
	
	// 카드섞기 메소드
	void shuffle() {
		//52개
		for(int i=0;i<300;i++) {
			int random = (int)(Math.random()*52);//0-51
			Card temp = c[0];
			c[0] = c[random];
			c[random] = temp;
		}//for
	}//void
	Card pick(){
		Card card = c[count];
		count++;
		return card;
	}//pick
	
	Card pick(int n) {
		return c[n];
	}//pick2
	
	
	Card[] pick5() {
		for(int i=0;i<5;i++) {
			cc[i] = c[count++];
		}
		return cc;
	}
}//class
