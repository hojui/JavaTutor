package part2;

import java.util.Scanner;

public class Max3 {
	public static void main(String[] args) {
		System.out.print("input student score : ");
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int max1 = 0; int id1 = 0;
		int max2 = 0; int id2 = 0;
		int max3 = 0; int id3 = 0;
 		for (int i = 0 ; i < n ; i++) {
 			System.out.print("student "+(i+1)+" ");
 			int score = kb.nextInt();
 			if (i == 0) {
 				max1 = score;
 				id1 = i;
 				continue;
 			}
 			if (score > max1) {
 				max3 = max2;
 				max2 = max1;
 				max1 = score;
 				id3 = id2;
 				id2 = id1;
 				id1 = i;
 			} else if (score<max1 && score>max2) {
 				max3 = max2;
 				max2 = score;
 				id3 = id2;
 				id2 = i;
 			} else if (score<max2 && score>max3) {
 				max3 = score;
 				id3 = i;
 			}
 		}
 		
 		System.out.println("student score max of 3 is ");
 		System.out.println("student "+(id1+1)+" : "+max1);
 		System.out.println("student "+(id2+1)+" : "+max2);
 		System.out.println("student "+(id3+1)+" : "+max3);
	}
}
