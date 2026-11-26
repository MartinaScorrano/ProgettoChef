package it.univaq.exceptions;

public class InvalidInputException extends Exception {
    public InvalidInputException() {
        super("Input non valido");
    }

    public InvalidInputException(String message) {
        super(message);
    }
}
