package P0701;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReader_C {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("c:/save/abc.txt");
			BufferedReader br = new BufferedReader(fr); //한줄씩 가져오기
			while(true) {
				String line = br.readLine(); //1줄가져오기
				if(line==null)break;
				System.out.println(line);
			}
//			String rline = "";
//			While((rline = br.readLine() !=null){
//				System.out.println(rline);
//			}
			fr.close();
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}//main

}//class
