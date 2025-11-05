package com.adri.librarymanagent.library_managent.actions;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.adri.librarymanagent.library_managent.models.Book;
import com.adri.librarymanagent.library_managent.models.BookStatus;



public class LibraryManager {

	private static final Logger logger = LogManager.getLogger(LibraryManager.class.getName());
	

	ArrayList<Book> books = new ArrayList<>();

	// method add book
	public void addBook(Book book) {

		if (!books.equals(book)) {
			books.add(book);
			logger.info("Book added " + book);
		} else {
			logger.warn("The book " + book + " is exists");
		}

	}
	// method remove book

	public void removeBook(String isbn) {
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getIsbn().equals(isbn)) {
				books.remove(i);
				logger.info("The book " + books.get(i).getIsbn() + " is removed");
				break;
			} else {

				logger.warn("The book " + books.get(i).getIsbn() + " is not removed");
			}
		}

	}

	// method update book

	public void updateBookStatus(String title, BookStatus status) {

		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getTitle().equals(title)) {
				books.get(i).setStatus(status);
				logger.info("Book " + title + " is update");
				break;
			} else {

				logger.warn("The book " + title + " is not update");

			}

		}

	}

	// method list

	public void listBooks() {

		for (Book book : books) {
			System.out.println(book.toString());
		}
	}

}
