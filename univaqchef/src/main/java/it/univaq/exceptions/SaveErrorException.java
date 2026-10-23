package it.univaq.exceptions;

public class SaveErrorException extends Exception{
    public SaveErrorException(String message){
super("Ops,sembra che il salvataggio non sia andato a buon fine.");
    }

}
