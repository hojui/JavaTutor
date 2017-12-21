package part2;

import java.util.Scanner;

public class RepeatBook2 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Input number of book : ");
		int numBook = kb.nextInt();
		String[] bookName = new String[numBook];
		double[] bookPrice = new double[numBook];
		int i = 0;
		do {
			System.out.print("input book "+(i+1)+" name and price : ");
			String tmpName = kb.next();
			double tmpPrice = kb.nextDouble();
			boolean found = false;
			for (int j = 0 ; j < bookName.length ; j++) {
				if (tmpName.equals(bookName[j])) {
					bookPrice[j] = tmpPrice;
					found = true;
					break;
				}
			}
			if (!found) {
				bookName[i] = tmpName;
				bookPrice[i] = tmpPrice;
				i++;
			}
		} while(i<numBook);
		
		
		//print value
		System.out.println("The list of book in store.");
		for (int j = 0 ; j < bookName.length ; j++) {
			System.out.println(bookName[j]+" "+bookPrice[j]);
		}
	}
}