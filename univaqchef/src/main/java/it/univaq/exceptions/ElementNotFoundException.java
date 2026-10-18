package it.univaq.exceptions;

public class ElementNotFoundException extends Exception{
    public ElementNotFoundException(){
        super("Ops,sembra che quello che stavi cercando non sia disponibile. Riprova");
    }
}
