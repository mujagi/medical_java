package p0624;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C0624_02 {

	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		System.out.println("arr : "+Arrays.toString(arr));
		
		int[] arr2 = null;
		arr2 = arr; // 주소값을 복사해서 같이 같은 주소를 공유함
		
		System.out.println("arr2 : "+Arrays.toString(arr2));
		arr2[0] = 1000;
		System.out.println("arr :"+Arrays.toString(arr));
	}// main

}// class
