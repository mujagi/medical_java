package p0619;
import java.util.Scanner;
public class C0619_04 {
	public static void main(String[] args) {
		// 퀴즈
		// 5,5 배열 생성 후 1-5개, 나머지는 0으로 채워서 랜덤으로 섞어 출력
		int no = 0;
		int no2 = 0;
		int t_value = 0;
		
		// 1. 배열 생성
		int[][] arr = new int [5][5];
		arr[0][0] = 1;
		arr[0][1] = 1;
		arr[0][2] = 1;
		arr[0][3] = 1;
		arr[0][4] = 1;
		
		// 2. 번호 섞기
		for (int i=0;i<300;i++) {
			no = (int) (Math.random()*5);
			no2 = (int) (Math.random()*5);
			t_value = arr[0][0];
			arr[0][0] = arr[no][no2];
			arr[no][no2] = t_value;
		}
		
		//-----------------------------------------------------------------
		
		// 번호 맞추기 화면
		String[][] lotto = new String [5][5];
		for (int i=0;i<5;i++) {
			for (int j=0;j<5;j++) {
				lotto[i][j] = ":하트1:";
				
			}
		}
		int count = 0;
		while(true) {
		// 3. 번호 출력
		System.out.println("                  [좌표]");
		System.out.println("   |\t0\t1\t2\t3\t4\t");
		System.out.println("------------------------------------------");
		for(int i=0;i<5;i++) {
			System.out.print(i+"  |\t");
			for(int j=0;j<5;j++) {
				System.out.printf("%s\t",lotto[i][j]);
			}
			System.out.println();
		}
		
		// 4. 좌표 입력
		Scanner scan = new Scanner(System.in);
		System.out.println("------------------------------------------");
		System.out.println("가로 좌표를 입력하세요.");
		int x = scan.nextInt();
		System.out.println("세로 좌표를 입력하세요.");
		int y = scan.nextInt();
		
		
		// 입력받은 좌표값이 확인이 된 좌표이면 확인이 된 좌표입니다. 라고 출력이되고 
		// 다시 입력받자
		if(x>5 || y>5) {
			System.out.println("0~5 사이를 입력해주세요");
			continue;
		}
		if(lotto[x][y]=="당첨" || lotto[x][y]== "꽝") {
			System.out.println("이미 입력된 좌표입니다");
			continue;
		}
		
		
		// 5. arr배열에서 x,y의 좌표 값 비교
		// 1이면 당첨, 0이면 꽝 출력
		if (arr[x][y]==1) { 
			lotto[x][y] = "당첨";
		}
		else lotto[x][y] = "꽝";
		
		if(lotto[x][y].equals("당첨")) {
			count ++ ;
		}
		if (count == 5) {
			break;
		}
		
		
		}//while
		
	
		
		
		
		
	}//main
}//class