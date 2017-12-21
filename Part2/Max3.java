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
//		int[] studentScore = new int[n];
//		int[] studentIndex = new int[n];
 		for (int i = 0 ; i < n ; i++) {
 			System.out.print("student "+(i+1)+" ");
 			int score = kb.nextInt();
// 			studentScore[i] = score;
// 			studentIndex[i] = i;
 			if (i == 0) {
 				max1 = score;
 				id1 = i;
 				continue;
 			}
// 			if (i == 1) {
// 				max2 = score;
// 				id2 = i;
// 				continue;
// 			}
// 			if (i == 2) {
// 				max3 = score;
// 				id3 = i;
// 				continue;
// 			}
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
 		
// 		for (int i = 0 ; i < n-1 ; i++) {
// 			for (int j = 0 ; j < n-1 ; j++) {
// 				if (studentScore[j] < studentScore[j+1]) {
// 					int tmp1 = studentScore[j];
// 					studentScore[j] = studentScore[j+1];
// 					studentScore[j+1] = tmp1;
// 					int tmp2 = studentIndex[j];
// 					studentIndex[j] = studentIndex[j+1];
// 					studentIndex[j+1] = tmp2;
// 				}
// 			}
// 		}
 		
 		//print value
// 		System.out.println("student score max of 3 is ");
// 		for (int i = 0 ; i < 3 ; i++) {
// 			System.out.println("student " + (studentIndex[i]+1) + " : " + studentScore[i]);
// 		}
 		
 		System.out.println("student score max of 3 is ");
 		System.out.println("student "+(id1+1)+" : "+max1);
 		System.out.println("student "+(id2+1)+" : "+max2);
 		System.out.println("student "+(id3+1)+" : "+max3);
	}
}
