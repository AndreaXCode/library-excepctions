package org.ies.library.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Book {

    //Por cada libro se guardará: ISBN, título, autor, géneros (listado)
    private String isbn;
    private String title;
    private String author;
    private List<String> genres;
}
