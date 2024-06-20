package p0620;

import java.text.SimpleDateFormat;
import java.util.Date;

public class C0620_03 {

	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy");
		System.out.println(sdf.format(date));
		System.out.println(sdf2.format(date));
		
		System.out.println(date.getTime());
		long today = System.currentTimeMillis();
		System.out.println(today);
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		
		System.out.println(sdf3.format(today));
	}

}
