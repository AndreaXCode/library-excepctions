package org.ies.library.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class BooklendHistory {

    //Se almacenará un historial de préstamos: ISBN, fecha préstamos, nif (del socio que lo ha tomado prestado), fecha de devolución
    private String isbn;
    private Date dateLoans;
    private String nif;
    private Date returnDate;
}