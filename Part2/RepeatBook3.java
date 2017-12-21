package part2;

import java.util.Scanner;

public class RepeatBook3 {
	public static void printValue(String[] book,int[] num) {
		System.out.println("this store have");
		for (int i = 0 ; i < book.length ; i++) {
			System.out.println(book[i]+" No. "+num[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("input number of book : ");
		int n = kb.nextInt();
		String[] bookName = new String[n];
		int[] bookNum = new int[n];
		int bookIterator = 0;
		for (int i = 0 ; i < n ; i++) {
			System.out.print("input name of book "+(i+1)+" : ");
			String name = kb.next();
			boolean found = false;
			for (int j = 0 ; j < bookName.length ; j++) {
				if (name.equals(bookName[j])) {
					found = true;
					bookNum[j]++;
				}
			}
			if (!found) {
				bookName[bookIterator] = name;
				bookNum[bookIterator] = 1;
				bookIterator++;
			}
		}
		
		//printValue(bookName,bookNum);
		System.out.println("this store have");
		for (int i = 0 ; i < bookIterator ; i++) {
			System.out.println(bookName[i]+" No. "+bookNum[i]);
		}
	}
}
