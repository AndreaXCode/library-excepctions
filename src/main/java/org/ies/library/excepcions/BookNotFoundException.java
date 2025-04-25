package org.ies.library.excepcions;

public class BookNotFoundException extends Exception {

    private String isbn;

    public BookNotFoundException(String isbn) {
        super("No se ha encontrado el libro con isbn: " + isbn);
        this.isbn = isbn;

    }

    public String getIsbn() {
        return isbn;
    }
}
