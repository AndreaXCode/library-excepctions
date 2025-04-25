package org.ies.library.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.ies.library.excepcions.BookNotFoundException;
import org.ies.library.excepcions.MemberNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

@Data
@AllArgsConstructor
public class Library {

    private String libraryName;
    private Map<String, Book> bookByIsbn;
    private Map<String, Partner> partnerByNif;

    private static final Logger log = LoggerFactory.getLogger(Library.class);

    //Implementar los métodos en Biblioteca:
    //
    //Un metodo que muestra todos los libros
    public void showAllBooks(){

        for (var book: bookByIsbn.values()){
            //Se esta usando log  --> toString()
            log.info(book.toString());
        }
    }

    //Un metodo que muestra todos los socios
    public void showAllPartners(){

        for (var partner: partnerByNif.values()){
            //Se esta usando log  --> toString()
            log.info(partner.toString());
        }
    }


    //Un metodo que dado un ISBN, devuelve el libro. Si no existe el libro se lanza la excepción BookNotFoundException(isbn)

    public Book bookOfIsbn(String isbn) throws BookNotFoundException {

        if (bookByIsbn.containsKey(isbn)){
            return bookByIsbn.get(isbn);

        } else {
            throw new BookNotFoundException(isbn);
        }
    }
    // Test  --> 2 escenarios
                            // 1. El libro existe
                            // 2. El libro no existe


    //Dado un nif, devuelve el socio. Si no existe MemberNotFoundException(nif)
    public Partner partnerOfnif(String nif) throws MemberNotFoundException {

        if (partnerByNif.containsKey(nif)){
            return partnerByNif.get(nif);

        } else {
            throw new MemberNotFoundException(nif);
        }
    }
    // Test  --> 2 escenarios
                            // 1. El socio existe
                            // 2. El socio no existe


    //Un metodo que devuelva un booleano que comprube si, dado un nif y un isbn, el socio ha tomado prestado un libro.
    // Si no existe el socio MemberNotFoundException(nif) y si no existe el libro BookNotFoundException(isbn)
    public boolean partnerMakesLoan(String nif, String isbn) throws MemberNotFoundException, BookNotFoundException{

        if (partnerByNif != null){

            if (bookByIsbn != null){

                return true;
            } else {
                throw new BookNotFoundException(isbn);
            }
        } else {
            throw new MemberNotFoundException(nif);
        }
    }
}
//Nombre de la biblioteca
//
//Libros indexados por isbn. Por cada libro se guardará: ISBN, título, autor, géneros (listado) H
//
//Socios indexados por nif. Por cada socio se guardará: nif, nombre, apellidos, número de socio, código postal.
//
//Se almacenará un historial de préstamos: ISBN, fecha préstamos, nif (del socio que lo ha tomado prestado), fecha de devolución
