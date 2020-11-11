package day1;

import java.util.LinkedList;

public class Book {
	int number;
	String name;
	String author;

	public Book(int number, String name, String author) {
		super();
		this.number = number;
		this.name = name;
		this.author = author;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [number=" + number + ", name=" + name + ", author=" + author + "]";
	}

}
