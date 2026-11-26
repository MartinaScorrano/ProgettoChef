package it.univaq.exceptions;

public class InvalidInputException extends Exception {
    public InvalidInputException() {
        super("Ops, sembra che per sbaglio tu abbia digitato un simbolo errato.\n Potresti:\n  -Aver inserito un numero uguale a zero o negativo\n -Aver inserito un numero al posto di una stringa o viceversa\n ");
    }
}
