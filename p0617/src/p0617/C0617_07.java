package p0617;

import java.util.Scanner;

public class C0617_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("첫번째 문자를 입력하세요.");
        String str1 = scan.nextLine();
        char ch1 = str1.charAt(0);

        System.out.println("두번째 문자를 입력하세요.");
        String str2 = scan.nextLine();
        char ch2 = str2.charAt(0);

        if ((ch1>='0' && ch1<='9') && (ch2>='0' && ch2<='9')) {
            // 정수로 변환
            int num1 = ch1 -'0'; // 문자숫자를 정수형으로 변경하는 방법 : '0' 빼줌
//            int num1 = Integer.parseInt(str1);
            int num2 = ch2 -'0'; // 문자숫자를 정수형으로 변경하는 방법 : '0' 빼줌
            System.out.println(num1+num2);
        }else{
            System.out.printf("%c, %c \n",ch1,ch2);
        }

    }
}
