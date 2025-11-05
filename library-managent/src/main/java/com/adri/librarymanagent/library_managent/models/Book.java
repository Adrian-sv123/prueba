package com.adri.librarymanagent.library_managent.models;

public class Book {

	public String title;
	public String autor;
	public String isbn;
	BookStatus status;

	public Book(String title, String autor, String isbn, BookStatus status) {
		this.title = title;
		this.autor = autor;
		this.isbn = isbn;
		this.status = status;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public BookStatus getStatus() {
		return status;
	}

	public void setStatus(BookStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", autor=" + autor + ", isbn=" + isbn + ", status=" + status + "]";
	}

}
