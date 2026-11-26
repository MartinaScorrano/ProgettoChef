package it.univaq.exceptions;

public class SaveErrorException extends Exception {
    public SaveErrorException() {
        super("Il salvataggio non è andato a buon fine");
    }

    public SaveErrorException(String message) {
        super(message);
    }

}
