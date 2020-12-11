package com.samples.base;

import java.util.ArrayList;
import java.util.List;

class Book {
	public String title;
	public String author;

	public Book(String title, String author) {

		this.title = title;
		this.author = author;
	}
}

class Library {
	private final List<Book> books;

	Library(List<Book> books) {
		this.books = books;
	}

	public List<Book> getTotalBooks() {
		return books;
	}
}

public class CompositeClass {
	public static void main(String[] args) {
		Book b1 = new Book("java","basnet");
		Book b2 = new Book("json","sworaj");
		Book b3 = new Book("html","salu");
		
		List<Book> books = new ArrayList<Book>();
		books.add(b1);
		books.add(b2);
		books.add(b3);
		books.remove(b1);
		Library library =  new Library(books);
		List<Book>  bks = library.getTotalBooks();
		for(Book bk:bks) {
			System.out.println("Book title : "+bk.title +" And Book's author : "+bk.author);
		}
	}

}
