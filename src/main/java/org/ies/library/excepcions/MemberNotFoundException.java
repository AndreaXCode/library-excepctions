package org.ies.library.excepcions;

public class MemberNotFoundException extends Exception {

  private String nif;

    public MemberNotFoundException(String nif) {

      super("No se ha encontrado el libro con el nif: " + nif);
      //Se guarda
      this.nif = nif;
    }

  public String getNif() {
    return nif;
  }
}
