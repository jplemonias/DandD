package com.dd.exceptions;

import java.util.regex.*;

public class ExceptionsMenu extends Exception {

    public ExceptionsMenu() {
      super();
    }
  
    public ExceptionsMenu(String s) {
      super(s);
    }

    public static void controle(String chaine) throws ExceptionsMenu {
      String err = "Saisie erronee : ";
      if (chaine.equals("")){
          throw new ExceptionsMenu(err+"pas de pseudo saisi.");
      }
      if (chaine.length() > 15){
          throw new ExceptionsMenu(err+"nom trop long (15 car max).");
      }
      if (!Pattern.compile("\\w+").matcher(chaine).matches()){
          throw new ExceptionsMenu(err+"Saisie non autorisée (car spé)\ncaractères autorisés : a-z A-Z 0-9.");
      }
  }
  }