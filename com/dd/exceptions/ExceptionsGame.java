package com.dd.exceptions;

public class ExceptionsGame extends Exception {

    public ExceptionsGame() {
      super();
    }
  
    public ExceptionsGame(String s) {
      super(s);
    }

    public static void testFight() throws ExceptionsGame {
      //String err = "Saisie erronee : ";
    }
  }