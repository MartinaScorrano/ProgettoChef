package it.univaq.exceptions;

public class InvalidInputException extends Exception {
    public InvalidInputException(){
        super("Ops,sembra che per sbaglio tu abbia digitato un simbolo errato");
    }
}
