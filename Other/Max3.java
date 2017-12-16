package part2;

import java.util.Scanner;

public class Max3 {
	public static void main(String[] args) {
		System.out.print("input student score : ");
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int[] studentScore = new int[n];
		int[] studentIndex = new int[n];
 		for (int i = 0 ; i < n ; i++) {
 			System.out.print("student "+(i+1)+" ");
 			int score = kb.nextInt();
 			studentScore[i] = score;
 			studentIndex[i] = i;
 		}
 		
 		for (int i = 0 ; i < n-1 ; i++) {
 			for (int j = 0 ; j < n-1 ; j++) {
 				if (studentScore[j] < studentScore[j+1]) {
 					int tmp1 = studentScore[j];
 					studentScore[j] = studentScore[j+1];
 					studentScore[j+1] = tmp1;
 					int tmp2 = studentIndex[j];
 					studentIndex[j] = studentIndex[j+1];
 					studentIndex[j+1] = tmp2;
 				}
 			}
 		}
 		
 		//print value
 		System.out.println("student score max of 3 is ");
 		for (int i = 0 ; i < 3 ; i++) {
 			System.out.println("student " + (studentIndex[i]+1) + " : " + studentScore[i]);
 		}
	}
}
