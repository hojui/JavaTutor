package part2;

import java.util.Scanner;

public class SalaryTest {
	
	public static String[] findSalary(String[] salary) {
		String[] result = new String[salary.length];
		int idx = 0;
 		for (int i = 0 ; i < salary.length ; i++) {
			if (Integer.parseInt(salary[i].substring(6))*30 <= 12000) {
				result[idx] = salary[i].substring(0, 6);
				idx++;
			}
		}
 		return result;
	}
	
	public static int findNum(int a,int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		String[] a = { "jui   410", "a     400", "b     280", "c     350", "d     380" };
		
		Scanner kb = new Scanner(System.in);
		int i = kb.nextInt();
		int j = kb.nextInt();
		//int sum = findNum(i,j);
		System.out.println(findNum(i,j));

		//String[] n = findSalary(a);
	}
	
	
}
