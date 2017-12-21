package part3;

import java.util.Scanner;

public class MinMaxNewVer {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int i = 0;
		int min = 0 ,max = 0;
		while (i < n){
			System.out.print("Enter number ["+(i+1)+"] : ");
			int tmp = input.nextInt();
			if (tmp > 0 ) {
				if (i == 0) {
					min = tmp;
					max = tmp;
					i++;
					continue;
				}
				if (tmp < min) min = tmp;
				if (tmp > max) max = tmp;
				i++;
			}
		}
		System.out.println(max+" "+min);
	}
}
