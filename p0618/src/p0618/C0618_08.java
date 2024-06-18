package p0618;

import java.util.Scanner;

public class C0618_08 {

	public static void main(String[] args) {
		// 로또번호 생성
		// 1-45 -> 6개
		Scanner scan = new Scanner(System.in);
		int[] lotto = new int[6];
		int[] mylotto = new int[6];
		int count = 0;
		for(int i = 0; i<lotto.length; i++ ) {
			lotto[i] = (int)(Math.random()*45)+1;
			for(int j = 0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				} // if문
			} // 두번째 for문
		} // 첫번째 for문
		for(int i=0; i<mylotto.length; i++) {
			System.out.printf("%d 번째 숫자를 입력하세요>>",i+1);
			mylotto[i] = scan.nextInt();
			if (mylotto[i]<1 || mylotto[i]>45) {
				System.out.println("숫자는 1~45까지만 가능합니다.");
				i--;
				continue;
			}
			for(int j = 0; j<i; j++) {
				if(mylotto[i]==mylotto[j]) {
					System.out.println("로또 번호는 중복될 수 없습니다!");
					i--;
					break;
				}
			}
		}// mylotto for 문
		
		for(int i = 0; i<lotto.length; i++) {
			
				if(lotto[i] == mylotto[i]) {
					count++;
				}
			
		}
		
		// 당첨금액 : 6개 - 100억, 5개 -1억 4개 - 1백만원, 3개- 1만원
		switch(count) {
		
		case 3: System.out.println("1만원 당첨!");
				break;
		case 4: System.out.println("1백만원 당첨!");
				break;
		case 5: System.out.println("1억 당첨!");
				break;
		case 6: System.out.println("100억 당첨");
				break;
		default :
			System.out.println("당첨금액없음");
		}
		
		System.out.printf("이번주 로또번호 추첨 : [%d] [%d] [%d] [%d] [%d] [%d] 입니다.\n",
				lotto[0], lotto[1], lotto[2], lotto[3], lotto[4], lotto[5]);
		System.out.printf("입력하신 번호 : [%d] [%d] [%d] [%d] [%d] [%d] 입니다. \n",
				mylotto[0],mylotto[1],mylotto[2],mylotto[3],mylotto[4],mylotto[5]);
		System.out.println( "로또번호" + count + "개를 맞추셨습니다.");

	} // main

} // class
