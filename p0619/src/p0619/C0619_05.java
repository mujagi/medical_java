package p0619;

import java.util.Arrays;

public class C0619_05 {

	public static void main(String[] args) {
		// [5,5] 배열 생성 1-25의 숫자를 입력하고, 랜덤으로 섞은 후 , 출력하시오.
		int[][] arr = new int[5][5];
		int no = 0;
		int no2 = 0;
		int t_value = 0;
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				arr[i][j] = i*5+j+1 ;
			}
		}
		
		for(int i = 0; i<300; i++) {
			no = (int)(Math.random()*5);
			no2 = (int)(Math.random()*5);
			t_value = arr[0][0];
			arr[0][0] = arr[no][no2];
			arr[no][no2] = t_value;
		}
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

	} // main

}  // class
