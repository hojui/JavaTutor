package part2;

import java.util.Scanner;

public class FindMin {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Input number of student : ");
		int n = kb.nextInt();
		int min = 0;
		for (int i = 0 ; i < n ; i++) {
			System.out.print("Input score of student "+(i+1)+" : ");
			int tmp = kb.nextInt();
			if (i == 0) {
				min = tmp;
				continue;
			}
			min = Math.min(min, tmp);
		}
		System.out.println("Min is : "+min);
	}
}
