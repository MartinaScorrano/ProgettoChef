package it.univaq.business;
import it.univaq.exceptions.SaveErrorException;

/**
 * Interfaccia Salvabile con tipo generico T utilizzata per salvare dati
 * relativi a ricette,ingredienti e in generale dati impostati dall'utente
 * 
 * @param <T> il parametro generico che specifica i tipi di dato che possono
 *            essere salvati
 */
public interface Salvabile<T> {
    /**
     * Metodo per salvare dati
     * 
     * @param entity l'oggetto da salvare
     * @return true se il salvataggio è andato a buon fine,false altrimenti;
     */

    /*
     * Far lanciare un eccezione a questo metodo, il booleano nìe basta non serve,
     * non è abbastanza, implementare SaveErrorException
     */
    public boolean salva(T entity) throws SaveErrorException;
}
