package Test01;

import java.util.Arrays;
import java.util.Scanner;

public class Test_lotto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] Lotto = new int[6];
		int[] MyLotto = new int[6];
		int count = 0;
		
		for(int i=0; i<Lotto.length; i++) {
			Lotto[i] = (int)(Math.random()*45)+1;
			if(i!=0) {
				for(int j=0; j<i; j++) {
					if(Lotto[i]==Lotto[j]) {
						i--;
						break;						
					}
				}//if i가 0이 아니라면 실행 = 0번은 놔두고 뒤에번호 부터 중복번호제거하기
			}//if 중복번호 제거
		}//Lotto 1~45 랜덤 6개 추출
		
		for(int i=0; i<MyLotto.length; i++){
			System.out.printf("%d 번째 로또번호를 입력해주세요.(1~45)",i+1);
			MyLotto[i] = scan.nextInt();
			if(MyLotto[i]<0 || MyLotto[i]>45) {
				System.out.println("1~45 사이의 숫자를 입력해주세요");
				i--;
			}//1~45 사이의 번호를 입력하지 않았을 경우 실행 if
			if(i!=0) {
				for(int j=0; j<i; j++) {
					if(MyLotto[i]==MyLotto[j]) {
						System.out.println("중복번호를 입력하셨습니다. 다시 입력해주세요.");
						i--;
						break;
					}//중복번호일 경우 실행 if
				}//중복번호 제거 for
			}//중복번호 다시입력받기 if
		}//MyLotto 입력받기
		
		for(int i=0; i<Lotto.length; i++) {
			if(Lotto[i]==MyLotto[i]) {
				count++;
			}//같을 경우 카운트 증가
		}//랜덤 로또와 내 로또번호 몇개 맞췄는지 확인
		System.out.printf("이번주 로또번호 : [%d] [%d] [%d] [%d] [%d] [%d] \n",Lotto[0],Lotto[1],Lotto[2],Lotto[3],Lotto[4],Lotto[5]);
		System.out.printf("내가 입력한 로또번호 : [%d] [%d] [%d] [%d] [%d] [%d] \n ",MyLotto[0],MyLotto[1],MyLotto[2],MyLotto[3],MyLotto[4],MyLotto[5]);
		
		switch(count) {
		case 3 :
			System.out.println("3개 맞추셨습니다!! 당첨금 : 5,000원 ");
			break;
		case 4 :
			System.out.println("4개 맞추셨습니다!! 당첨금 : 50,000원 ");
			break;
		case 5 :
			System.out.println("5개 맞추셨습니다!! 당첨금 : 200,000원 ");
			break;
		case 6 :
			System.out.println("6개 모두 맞추셨습니다!! 당첨금 : 2,000,000,000원");
			break;
		default :
			System.out.println("꽝");
			break;
		}// 맞춘갯수 switch문

	}//main

}//class
