package com.adri.librarymanagent.library_managent.interfaces;

import com.adri.librarymanagent.library_managent.models.Book;
import com.adri.librarymanagent.library_managent.models.BookStatus;

public interface BookActions {

	//methods
	public void addBook(Book book);
	public void removeBook(String isbn);
	public void updateBookStatus(String isbn, BookStatus status);
	public void listBooks();
	
}
