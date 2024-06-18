package p0618;

import java.util.Arrays;
import java.util.Scanner;

public class C0618_10 {

    public static void main(String[] args) {
        // 1-100까지 랜덤숫자를 생성해서, 랜덤숫자를 맞추는 프로그램 구현하시오.
        //숫자를 입력해서 큰수를 입력하세요, 작은수를 입력하세요
        // 10번까지만 입력가능하도록
        // 랜덤숫자 : 45
        // 입력한 숫자 : 1...10
        Scanner scan = new Scanner(System.in);
        int[] num = new int[10]; // 사용자가 입력한 숫자들을 저장하는 배열
        int r_num = (int)(Math.random()*100)+1; // 1에서 100 사이의 랜덤 숫자 생성
        int[] no= new int[10]; // 랜덤 숫자와 사용자가 입력한 숫자 간의 차이를 저장하는 배열
        boolean isCorrect = false; // 정답을 맞췄는지 확인하는 플래그
        
        for(int i=0; i<num.length; i++) {
            System.out.println("숫자를 입력해주세요");
            num[i] = scan.nextInt(); // 사용자로부터 숫자를 입력받음
            no[i] = Math.abs(r_num - num[i]); // 차이를 저장, 절대값으로 계산하여 음수 방지
            
            if (num[i]<1 || num[i]>100) { // 입력된 숫자가 1에서 100 사이인지 확인
                System.out.println("1~100사이로 입력 좀");
                i--; // 입력 횟수를 증가시키지 않기 위해 인덱스를 감소시킴
                continue; // 다음 반복으로 넘어감
            }
            
            if(num[i]>r_num) { // 입력된 숫자가 랜덤 숫자보다 큰 경우
                System.out.println("작은수 입력부탁");
            } else if (num[i]<r_num) { // 입력된 숫자가 랜덤 숫자보다 작은 경우
                System.out.println("큰 수 입력좀");
            } else if (r_num == num[i]) { // 입력된 숫자가 랜덤 숫자와 같은 경우
                isCorrect = true; // 정답을 맞췄음을 표시
                break; // 반복을 종료
            }
        }

        if (!isCorrect) { // 정답을 맞추지 못한 경우에만 근사치 값을 계산하고 출력
            // 가장 작은 차이를 찾기 위한 로직 추가
            int minDifference = no[0]; // 초기 최소값을 배열의 첫 번째 요소로 설정
            int minIndex = 0; // 최소값의 인덱스를 추적

            for(int i=1; i<no.length; i++) {
                if(no[i] < minDifference) {
                    minDifference = no[i];
                    minIndex = i;
                }
            }

            // 랜덤 숫자와 사용자가 입력한 숫자들을 출력
            System.out.println("랜덤 숫자: " + r_num);
            System.out.printf("[%d] [%d] [%d] [%d] [%d] [%d] [%d] [%d] [%d] [%d] \n",
                    num[0], num[1], num[2], num[3], num[4], num[5], num[6], num[7], num[8], num[9]);
            System.out.println("가장 근접한 입력 값: " + num[minIndex]); // 가장 작은 차이에 해당하는 num 값을 출력
        } else {
            System.out.println("정답을 맞추셨습니다!");
        }
    }
}