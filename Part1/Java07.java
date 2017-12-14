package part1;

import java.util.Scanner;

public class Java07 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("How many student in classroom : ");
		int n = kb.nextInt();
		int[] a = new int[n];
		int i = 0;
		// while (i <= n) {
		do {
			System.out.print("Input Score student " + (i + 1) + " : ");
			int tmp = kb.nextInt();
			if (tmp >= 0 && tmp <= 50) {
				a[i] = tmp;
				i++;
			}
		} while (i < n);

		System.out.println("No.\t|\tScore");
		System.out.println("------------------------------------");
		for (int k = 0; k < n; k++) {
			System.out.print(k + 1 + "\t|\t");
			for (int j = 0; j < a[k]; j++) {
				System.out.print("*");
			}
			System.out.println("\t(" + a[k] + ")");
		}
	}
}
