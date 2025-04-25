package org.example.model;

import org.ies.library.excepcions.BookNotFoundException;
import org.ies.library.model.Book;
import org.ies.library.model.Library;
import org.ies.library.model.Partner;

import java.util.List;
import java.util.Map;


public class LibraryTests {

    // Test  --> 2 escenarios
            // 1. El libro existe  --> findBookTest ¿Porque se pone "throws"? la ex se produce dentro y se captura.
            // 2. El libro no existe  --> bookNotExist


    public void findBookTest() throws BookNotFoundException {

    }

    public void findBookNotFoundTest() {

    }

    private Library createLibrary(){

        return new Library("Casa del Libro",
                Map.of(
                       "1", new Book("1", "Harry Potter", "JK.Rowling", List.of("Fantasia")),
                       "2", new Book("2", "Carrie", "Stephen King", List.of("Terror"))
                ),
                Map.of(
                        "1x", new Partner("1x", "Andrea", "Dominguez", 12, 29900),
                        "2x", new Partner("2x", "Sara", "Sanchez", 13, 29901)
                ),




                );





    }



}
