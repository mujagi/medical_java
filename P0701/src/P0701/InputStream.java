package P0701;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStream {

	public static void main(String[] args)  {
		
		try {
			FileInputStream fis = new FileInputStream("c:/save/abc.txt");
			int read = 0;
			while((read = fis.read())!= -1) { //fis.read(파일의 데엍ㅓ를 읽어옴,
				System.out.println((char)read);	
			}
		}catch(Exception e) {e.printStackTrace();}
			
			
		
		
//		byte[] b = new byte[1024];
//		try {
//			FileInputStream fis = new FileInputStream("c:/save/abc.txt");
//			fis.read(b); //파일 읽어오기
//			System.out.println(new String(b));
//			
//		}catch(Exception e) {e.printStackTrace();}
		
		
	}//main
	
}//class
