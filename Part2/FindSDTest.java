package part2;

import java.util.Scanner;

public class FindSDTest {
	
	public static double findAverage(int[] score) {
		double avg = 0;
		for (int i = 0 ; i < score.length ; i++) {
			avg+=score[i];
		}
		avg/=score.length;
		return avg;
	}
	
	public static double findSD(double avg,int[] s) {
		double sd = 0;
		for (int i = 0 ; i < s.length ; i++) {
			sd += Math.pow((s[i]-avg), 2);
		}
		sd/=(s.length-1);
		sd = Math.sqrt(sd);
		return sd;
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("input student number : ");
		int n = kb.nextInt();
		int[] score = new int[n];
		for (int i = 0 ; i < n ; i++) {
			System.out.print("input student "+(i+1)+" score : ");
			int tmp = kb.nextInt();
			score[i] = tmp;
		}
		double avg = findAverage(score);
		double sd = findSD(avg,score);
		System.out.println(sd);
	}
	
}
