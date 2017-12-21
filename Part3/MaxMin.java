package part3;

import java.util.Scanner;

public class MaxMin {
	static int i;
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = input.nextInt();
		int num[] = new int[n];
		int i = 0;
		while (i < n){
			System.out.print("Enter number ["+(i+1)+"] : ");
			int tmp = input.nextInt();
			if (tmp > 0 ) {
				num[i] = tmp;
				i++;
			}
		}
		findMax(num);
		findMin(num);
		
	}
	
	public static void findMax(int number[]) {
		int max = number[0];
		for (int i = 1 ; i < number.length ; i++) {
			if (number[i] > max) max = number[i];
		}
		System.out.println(max);
	}
	
	public static void findMin(int number[]) {
		int min = number[0];
		for (int i = 1 ; i < number.length ; i++) {
			if (number[i] < min) min = number[i];
		}
		System.out.println(min);
	}

}
