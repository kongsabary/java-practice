package day2;

import java.util.Scanner;

public class star {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// 스캐너 클래스를 이용하여 숫자 받아오기
		System.out.println("숫자를 입력해주세요.");
		int num = scanner.nextInt();
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
