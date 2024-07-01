package P0701;

public class Card {
	private String Password;
	private int number;
	private String kind;
	
	Card(){}//기본생성자
	Card(int number,String kind){ //전체생성자
		this.number = number;
		this.kind = kind;
	}
	
	public int getNumber() {
		return number;
	}//캡슐화
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public void setNumber(int number) {
		if(number>13 || number<0) {
			return;
		}
		this.number = number;
	}//캡슐화
	
	
	public String getPassword(String id) {
		if(!(id.equals("admin"))) {
			return "";
		}
		return Password;
	}//캡슐화
	
	public void setPassword(String Password) {
		this.Password = Password;
	}//캡슐화
	
	public String toString() {
		return kind+","+number;
	}
}//class
