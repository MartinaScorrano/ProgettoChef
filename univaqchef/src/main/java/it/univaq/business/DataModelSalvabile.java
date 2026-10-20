package it.univaq.business;
/**
 * Classe astratta DataModelSalvabile per utilizzata per rappresentare la logica di salvataggio generica per un tipo T
 * @param <T> il tipo generico da salvare
 */
public  abstract class DataModelSalvabile<T> implements Salvabile<T> {
   /**
    * Metodo utilizzato per avvisi durante il salvataggio dei dati
    * @param message il messaggio stampato sulla console per il salvataggio
    */
    protected void log(String message){
    System.out.println("[LOG]"+ message);
   }
    @Override 
    public abstract boolean salva(T entity);
    
}
