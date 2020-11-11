package day1;

import java.util.LinkedList;

import java.util.Scanner;

public class BookMain {
	public static void main(String[] args) {
		boolean work = true;
		BookManager bookManager = new BookManager();
		while (work) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("도서관리 시스템입니다. 원하시는 기능을 선택해주세요.");
			System.out.println("1.도서등록 2.도서목록 3.수정  4.삭제 5.종료");
			String choice = scanner.next();
			
			switch (choice) {
			case "1":bookManager.insertBook();
				break;
			case "2":bookManager.selectBook();
				break;
			case "3":bookManager.updateBook();
				break;
			case "4":bookManager.deleteBook();
				break;
			case "5":work=false;
				break;
			default:
				break;
			} 
		}
	}
}
