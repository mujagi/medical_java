package P0701;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {

	public static void main(String[] args) throws Exception{
		
		
		FileOutputStream fos = new FileOutputStream("c:/save/abc.txt");
		String str = "S0001,홍길동,100,100,100,300,100.0,0,\r\n";
		str += "S0002,유관순,50,50,50,150,50.0,0,\r\n";
		byte[] bytes = str.getBytes();
		for(byte b : bytes) { //단순for문
				fos.write(b);
			}
		
		
		
		//try - catch
//		try {
//			// 1byte 씩 저장
//			FileOutputStream fos = new FileOutputStream("c:/save/abc.txt");
//			String str = "S0001,홍길동,100,100,100,300,100.0,0,\r\n";
//			str += "S0002,유관순,50,50,50,150,50.0,0,\r\n";
//			byte[] bytes = str.getBytes();
//			for(byte b : bytes) { //단순for문
//					fos.write(b);
//				}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("파일에 글이 입력되었습니다.");
//		
		
		

		// 폴더,파일 생성
//		String str = "c:/save1";
//		File folder = new File(str);
//		File file = new File(str+"/11.txt");
//		try {
//			if(!(folder.exists())) { //폴더,파일 존재확인
//				System.out.println("폴더를 생성했습니다.");
//				folder.mkdirs();//폴더생성				
//			}
//			file.createNewFile(); //파일생성
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
//		System.out.println("파일이 생성되었습니다.");
	}

}
	