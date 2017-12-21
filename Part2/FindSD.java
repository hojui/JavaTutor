package part2;

import java.util.Scanner;

public class FindSD {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Input number of student : ");
		int n = kb.nextInt();
		int[] score = new int[n];
		int avg = 0;
		for (int i = 0 ; i < n ; i++) {
			System.out.print("Input score of student "+(i+1)+" : ");
			int tmp = kb.nextInt();
			score[i] = tmp;
			avg+=tmp;
		}
		avg/=score.length;
		double sd = 0;
		for (int i = 0 ; i < n ; i++) {
			sd += Math.pow((score[i]-avg), 2);
		}
		sd/=(n-1);
		sd = Math.sqrt(sd);
		System.out.println("SD = "+sd);
	}
}
