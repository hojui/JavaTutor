package part2;

import java.util.Scanner;

public class FindMax {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Input number of student : ");
		int n = kb.nextInt();
		int max = -1;
		for (int i = 0 ; i < n ; i++) {
			System.out.print("Input score of student "+(i+1)+" : ");
			int tmp = kb.nextInt();
			max = Math.max(max, tmp);
		}
		System.out.println("Max is : "+max);
	}
}
