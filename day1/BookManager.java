package day1;

import java.util.LinkedList;
import java.util.Scanner;

public class BookManager {
	static LinkedList<Book> books = new LinkedList<>();
	Scanner scanner = new Scanner(System.in);
	int nBookNumber;
	
	public BookManager() {
		nBookNumber = 0;
	}
	
	// 등록하기
	public void insertBook() {
		//System.out.println("등록하실 책번호를 입력해주세요.");
		//int number = scanner.nextInt();
		System.out.println("등록하실 책이름를 입력해주세요.");
		String name = scanner.next();
		System.out.println("등록하실 책저자를 입력해주세요.");
		String author = scanner.next();
		Book book = new Book(nBookNumber++, name, author);
		books.add(book);
	}
	
	// 조회하기
	public void selectBook() {
		for (Book book : books) {
			System.out.println(book);
		}
	}
	
	// 수정하기
	public void updateBook() {
		System.out.println("수정하실 책번호를 입력해주세요.");
		int bookNumber = scanner.nextInt();
		for (Book book : books) {
			int bookNum1 = book.getNumber();
			if(bookNum1==bookNumber) {
				System.out.print("수정할 내역 선택 1. 저자 2. 제목 3. 종료 >> ");
				int nSel = scanner.nextInt();
				switch(nSel) {
				case 1:
					System.out.print("변경하실 책저자를 입력해주세요 >> ");
					String author = scanner.next();
					book.setAuthor(author);
					break;
				case 2:
					System.out.print("변경하실 책이름를 입력해주세요 >>");
					String name = scanner.next();
					book.setName(name);
					break;
				default : break;
				}
			}
		}
	}
	
	// 삭제하기
	public void deleteBook() {
		System.out.print("삭제하실 책번호를 입력해주세요 >> ");
		int bookNumber = scanner.nextInt();
		for (int i = 0; i < books.size(); i++) {
			if(bookNumber==books.get(i).getNumber()) {
				books.remove(i);
				return;
			}
		}
		System.out.println("책이 없습니다 ^_^a");
	}
}
