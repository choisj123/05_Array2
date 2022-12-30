package edu.kh.array2.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	
	public void practice7() {
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String[][] arr1 = new String[3][2];
		
		String[][] arr2 = new String[3][2];

		//arr1[0][0] = s[0] 강건강
		//arr1[0][1] = s[1] 남나나
		//arr1[1][0] = s[2] 도대담
		//arr1[1][1] = s[3] 류라라
		//arr1[2][0] = s[4] 문미미
		//arr1[2][1] = s[5] 박보배
		
		//arr2[0][0] = s[6] 송성실
		//arr2[0][1] = s[7] 윤예의
		//arr2[1][0] = s[8] 진재주
		//arr2[1][1] = s[9] 차천죽
		//arr2[2][0] = s[10] 피풍표
		//arr2[2][1] = s[11] 홍하하

				int i = 0;
				
				while(i < 6) {
					for (int row = 0; row < arr1.length; row++) { //행 반복
						for (int col = 0; col < arr1[row].length; col++) { //열 반복

							arr1[row][col] = students[i];
							i++;
						}
					}
				}
				System.out.println("== 1분단 ==");
				System.out.println(arr1[0][0] + " " + arr1[0][1]);
				System.out.println(arr1[1][0] + " " + arr1[1][1]);
				System.out.println(arr1[2][0] + " " + arr1[2][1]);
				
				while(i >= 6 && i <= 11) {
					for (int row = 0; row < arr2.length; row++) { //행 반복
						for (int col = 0; col < arr2[row].length; col++) { //열 반복

							arr2[row][col] = students[i];
							i++;
						}
					}	
				}
				System.out.println("== 2분단 ==");
				System.out.println(arr2[0][0] + " " + arr2[0][1]);
				System.out.println(arr2[1][0] + " " + arr2[1][1]);
				System.out.println(arr2[2][0] + " " + arr2[2][1]);
					
			
		}
		
	public void practice8() {
		
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String[][] arr1 = new String[3][2];
		
		String[][] arr2 = new String[3][2];

		//arr1[0][0] = s[0] 강건강
		//arr1[0][1] = s[1] 남나나
		//arr1[1][0] = s[2] 도대담
		//arr1[1][1] = s[3] 류라라
		//arr1[2][0] = s[4] 문미미
		//arr1[2][1] = s[5] 박보배
		
		//arr2[0][0] = s[6] 송성실
		//arr2[0][1] = s[7] 윤예의
		//arr2[1][0] = s[8] 진재주
		//arr2[1][1] = s[9] 차천죽
		//arr2[2][0] = s[10] 피풍표
		//arr2[2][1] = s[11] 홍하하

		int i = 0;
				
		while(i < 6) {
			for (int row = 0; row < arr1.length; row++) {//행 반복
				for (int col = 0; col < arr1[row].length; col++) { //열 반복
					arr1[row][col] = students[i];
					i++;
				}
			}
		}
		System.out.println("== 1분단 ==");
		System.out.println(arr1[0][0] + " " + arr1[0][1]);
		System.out.println(arr1[1][0] + " " + arr1[1][1]);
		System.out.println(arr1[2][0] + " " + arr1[2][1]);
				
		while(i >= 6 && i <= 11) {
			for (int row = 0; row < arr2.length; row++) { //행 반복
				for (int col = 0; col < arr2[row].length; col++) { //열 반복
					arr2[row][col] = students[i];
					i++;
				}
			}	
		}
		System.out.println("== 2분단 ==");
		System.out.println(arr2[0][0] + " " + arr2[0][1]);
		System.out.println(arr2[1][0] + " " + arr2[1][1]);
		System.out.println(arr2[2][0] + " " + arr2[2][1]);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=======================");
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String input = sc.next();
		
		for (int row = 0; row < arr1.length; row++) {
			for (int col = 0; col < arr1[row].length; col++) {
				if(arr1[row][col].equals(input)) {
					System.out.printf("검색하신 %s 학생은 %d분단 %d번째 줄에 있습니다.", input, row, col);
				}
			}
		}
		
		
		
	}
		
	
	
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		String[][] arr = new String[6][6];
		
		System.out.print("행 인덱스 입력 : ");
		int rowInput = sc.nextInt();
		System.out.print("열 인덱스 입력 : ");
		int colInput = sc.nextInt();
		
		arr[0][0] = "0";
		arr[0][1] = "1";
		arr[0][2] = "2";
		arr[0][3] = "3";
		arr[0][4] = "4";
		
		arr[0][0] = "0";
		arr[1][0] = "1";
		arr[2][0] = "2";
		arr[3][0] = "3";
		arr[4][0] = "4";
		
	/*	System.out.print("  " + arr[0][0] + " " + arr[0][1]+ " " + arr[0][2]+ " " + arr[0][3] + " " + arr[0][4]);
		System.out.println();
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.println(arr[0][3]);
		System.out.println(arr[0][4]); */
		
		
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if(row == rowInput && col == colInput) {
					arr[row][col] = "x";
					
					System.out.println(arr[row][col]);
				}
			}
		}
		
		System.out.println();
		
		//if --> " "빈칸
				//else "x"
		
	
		
		
	}
}
	
	


