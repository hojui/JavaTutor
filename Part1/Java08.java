package part1;

import java.util.Scanner;

public class Java08 {
	public static void main(String[] args) {
		final String[] title = { "The Red Hat", "ABC Basic", "The Lost Village", "School day!" };
		final double[] price = { 20.25, 11, 21.25, 32.15 };

		Scanner kb = new Scanner(System.in);
		String book = kb.next();

		boolean found = false;

		for (int i = 0; i < title.length; i++) {
			if (book.equals(title[i])) {
				System.out.println(price[i]);
				found = true;
				break;
			}
		}
		if (!found) System.out.println("Sorry.");
	}
}
