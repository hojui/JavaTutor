package part1;

import java.util.Scanner;

public class Java04 {
	public static void main(String[] args) {
		System.out.print("Input number : ");
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		
		int[] even = new int[n];
		int[] odd = new int[n];
		int odd_iterator = 0;
		int even_iterator = 0;
		
		for (int i = 0 ; i < n ; i++) {
			System.out.print("Input number "+(i+1)+" : ");
			int tmp = kb.nextInt();
			if (tmp%2 == 0) {
				even[even_iterator] = tmp;
				even_iterator++;
			} else {
				odd[odd_iterator] = tmp;
				odd_iterator++;
			}
		}
		
		System.out.println("even number has "+even_iterator+" from "+n);
		for (int i = 0 ; i < even_iterator ; i++) {
			System.out.print(even[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("odd number has "+odd_iterator+" from "+n);
		for (int i = 0 ; i < odd_iterator ; i++) {
			System.out.print(odd[i]+" ");
		}
	}
}
