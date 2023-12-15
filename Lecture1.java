package FUNCTION;

import java.util.*;

public class Lecture1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		DELHI_PULIC(arr);
	}

	public static void DELHI_PULIC(int arr[]) {

		for (int j = 0; j < arr.length; j++) {
			int temp = arr[j];
			int sum1 = 0;
			int sum2 = 0;
			while(temp>0) {
			int rem = temp % 10;
			
			if (rem % 2 == 0) {
				sum1 = sum1 + rem;
			} else {
				sum2 = sum2 + rem;
			}
			temp=temp/10;
			}
			if (sum1 % 4 == 0 || sum2 % 3 == 0) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}

		}

	}
}