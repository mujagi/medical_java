package P0627;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class C0627_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("저장할 파일 이름을 입력하세요. >> ");
		String fileName = scan.nextLine();
		if(fileName.equals("")||fileName == null)
			fileName = "제목없음";
		
		File f = new File("c:/save/"+fileName+".txt");
		
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("파일 1개가 저장되었습니다.");

	}//main

}//class
