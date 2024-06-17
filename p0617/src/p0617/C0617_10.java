package p0617;

import java.util.Scanner;

public class C0617_10 {
    public static void main(String[] args) {
        // 숫자를 입력받아, 60점이상이면 합격, 60점 미만이면 불합격을 출력하시오.
        // 90점 이상이면 A, 80점이상 B, 70점이상 C, 60점이상 D, 그외 F라고 출력
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        int score = scan.nextInt();
//        if(score>=60){
//            System.out.println("합격");
//        }else{
//            System.out.println("불합격");
//        }
        if(score >= 90)
            System.out.println("A");
        else if(score >= 80)
            System.out.println("B");
        else if(score >= 70)
            System.out.println("C");
        else if(score >= 60)
            System.out.println("D");
        else
            System.out.println("F");
    }
}
