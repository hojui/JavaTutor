package part2;

public class RepeatBook {
	public static void main(String[] args) {
		final String[] book = {"calculus1","discrete math","serway physics","calculus2","calculus1","discrete math"};
		String[] found = new String[book.length];
		String[] repeat = new String[book.length];
		int idx_found = 0;
		int idx_repeat = 0;
		for(int i = 0 ; i < book.length ; i++) {
			boolean find = false;
			for (int j = 0 ; j < found.length ; j++) {
				if (book[i].equals(found[j])) {
					repeat[idx_repeat] = book[i];
					idx_repeat++;
					find = true;
					break;
				}
			}
			if (!find) {
				found[idx_found] = book[i];
				idx_found++;
			}
		}
		
		for (int i = 0 ; i < idx_repeat ; i++) {
			System.out.println(repeat[i]);
		}
	}
}
