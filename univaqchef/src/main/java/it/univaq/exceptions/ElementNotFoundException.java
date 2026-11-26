package it.univaq.exceptions;

public class ElementNotFoundException extends Exception {
    public ElementNotFoundException() {
        super("L'elemento cercato non è disponibile");
    }

    public ElementNotFoundException(String message) {
        super(message);
    }
}
