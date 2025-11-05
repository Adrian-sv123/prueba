package com.adri.librarymanagent.library_managent;

import com.adri.librarymanagent.library_managent.actions.LibraryManager;
import com.adri.librarymanagent.library_managent.models.Book;
import com.adri.librarymanagent.library_managent.models.BookStatus;

public class App {
	public static void main(String[] args) {

		// crated objects
		LibraryManager library = new LibraryManager();

		// Crear dos libros
		Book book1 = new Book("1984", "George Orwell", "9780451524935", BookStatus.AVAILABLE);
		Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", "9780547928227", BookStatus.RESERVED);

		// Agregar los libros
		library.addBook(book1);
		library.addBook(book2);

		// Listar libros actuales
		library.listBooks();

		// Actualizar estado de un libro
		library.updateBookStatus("1984", BookStatus.BORROWED);

		// Eliminar un libro
		library.removeBook("9780451524935");

		// Listar libros al final
		library.listBooks();

	}
}
