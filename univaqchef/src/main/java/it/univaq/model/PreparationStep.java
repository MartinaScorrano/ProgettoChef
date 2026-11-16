package it.univaq.model;
/**
 * Classe PreparationStep utilizzata per la creazione degli step di 
 * preparazione legati alle ricette
 */
public class PreparationStep {
    public int orderNumber;
    public String description;
    public int time;
/**
 * Metodo costruttore della classe PreparationSteo
 * @param orderNumber il numero d'ordine associato allo step
 * @param description la descrizione dei passi da seguire in quello step
 * @param time il tempo necessario al completamento della task nello step
 */
public PreparationStep(int orderNumber,String description,int time){
    this.orderNumber=orderNumber;
    this.description=description;
    this.time=time;
}
@Override
public String toString(){
    return "Allo step numero "+orderNumber+ "svolgere la seguente azione: "+
    description+ ". Il tempo necessario al completamento di questo step è di "+time+" minuti.";

}
@Override 
public boolean equals(Object obj){
    if(this==obj) return true;
    if(!(obj instanceof PreparationStep)) return false;
    PreparationStep p=(PreparationStep) obj;
    return this.description.equals(p.getDescription()) && this.orderNumber==p.getOrderNumber();

}
/**
 * Metodo getter per la descrizione dello step
 * @return la descrizione dello step
 */
public String getDescription(){
    return description;
}
/**
 * Metodo getter per il numero di ordine
 * @return il numero dello step
 */
public int getOrderNumber(){
    return orderNumber;
}
/**
 * Metodo getter per il tempo impiegato
 * @return il tempo da impiegare per effettuare l'azione nello step
 */
public int getTime(){
    return time;
}
/**
 * Metodo setter per la descrizione nello step
 * @param descrizione la descrizione dello step
 */
public void setDescritpio(String descrizione){
    this.description=descrizione;
}
/**
 * Metodo setter per il numero d'ordine dello step
 * @param ordine il numero d'ordine dello step
 */
public void setOrderNumber(int ordine){
    this.orderNumber=ordine;
}
/**
 * Metodo setter per il tempo impiegato per lo step
 * @param tempo il tempo da impiegare
 */
public void setTime(int tempo){
    this.time=tempo;
}
}

    
    

