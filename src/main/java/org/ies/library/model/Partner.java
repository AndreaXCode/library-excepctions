package org.ies.library.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Partner {

    //Socios indexados por nif. Por cada socio se guardará: nif, nombre, apellidos, número de socio, código postal.
    private String nif;
    private String name;
    private String surname;
    private int partnerNumber;
    private int zipcode;
}