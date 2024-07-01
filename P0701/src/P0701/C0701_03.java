package P0701;

import java.util.ArrayList;
import java.util.HashMap;

public class C0701_03 {

	public static void main(String[] args) {
		Process p = new Process();
		
		ArrayList<Card> clist = p.clistAdd();
//		// Card list 가져오기
//		for(int i=0;i<p.clist.size();i++) {
//			System.out.println(p.clist.get(i));
//		}
//		
//		
//		
//		//Students list 가져와서 출력
		ArrayList<Students> slist = p.slistAdd();
//		for(int i=0;i<p.slist.size();i++) {
//			System.out.println(p.slist.get(i));
//		}
		
		//2개 모두 가져와서 출력
		
		HashMap<String,Object> map = p.listAdd();
		clist = (ArrayList<Card>)map.get("clist");
		for(int i=0;i<clist.size();i++) {
			System.out.println(clist.get(i));
		}
		slist = (ArrayList<Students>)map.get("slist");
		for(int i=0;i<slist.size();i++) {
			System.out.println(slist.get(i));
		}
		
		
	}//main

}//class
