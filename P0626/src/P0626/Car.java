package P0626;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Car {
	static int count = 1;
	{
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		this.serialNo = "C"+sdf.format(d)+String.format("%03d", count++);
	}
	
	
	Car(){}
	
	Car(String color,int door){
		this.color = color;
		this.door = door;
	}
	
	String serialNo;
	String color;
	int door;
	
	String getSerialNo() {
		return serialNo;
	}
	
	void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}
}
