package p0625;

public class Card {
	
	Card(){}//기본생성자 다른생성자 만들려면 만들고봄
	Card(int number,String kind){
		this.number = number;
		this.kind = kind;
	}
	
	int number;
	String kind;
	
	@Override
	public String toString() {
		
		return "["+kind+","+number+"]";
	}
}//class
