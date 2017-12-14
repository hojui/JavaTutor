package part1;

import java.util.Scanner;

public class Java06 {
	public static void main(String[] args) {
		String[] month = {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
		double[] sale = new double[12];
		double avg = 0;
		
		Scanner kb = new Scanner(System.in);
		
		for (int i = 0 ; i < month.length ; i++) {
			System.out.print("Input sale of month"+month[i]+" : ");
			sale[i] = kb.nextDouble();
			avg += sale[i];
		}
		
		avg/=sale.length;
		System.out.println("average : "+avg);
		for (int i = 0 ; i < sale.length ; i++) {
			if (sale[i] > avg) {
				System.out.println(month[i]+" : "+sale[i]);
			}
		}
	}
}
