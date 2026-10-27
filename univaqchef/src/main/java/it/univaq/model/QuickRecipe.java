package it.univaq.model;


/**
 * Classe QuickRecipe utilizzata per ricette veloci da poter preparare in un
 * certo range temporale apportando eventualmente dei cambiamenti sui passi di
 * preparazione oppure sugli ingredienti necessari
 * 
 */
public class QuickRecipe extends BaseRecipe {
    public int time;

/**
     * Metodo costruttore della classe QuickRecipe
     * 
     * @param title                il titolo della ricetta
     * @param description          una descrizione della ricetta
     * @param list                 la lista degli ingredienti necessari alla
     *                             preparazione
     * @param timePreparation      il tempo da impiegare per la preparazione della
     *                             ricetta
     * @param timeToBeCooked       il tempo necessario per la cottura del cibo
     * @param numberPortions       il numero di porzioni da specificare per la
     *                             ricetta al fine di poter modificare la quantità
     *                             di ingredienti necessaria
     * @param valutation           la valutazione della ricetta da 1 a 5 stelle
     * @param difficulty           la difficoltà della ricetta
     * @param category             la categoria di appartenenza del piatto da
     *                             realizzare
     * @param steps                gli step da seguire per la preparazione della
     *                             ricetta
     * @param time il tempo che l'utente ha a disposizione per la preparazione del piatto
     * @return una nuova istanza di QuickRecipe
     */
    public QuickRecipe(String title, String description, int timePreparation,
            int timeToBeCooked, int numberPortions, int valutation, Difficulty difficulty, PlateCategory category,int time) {
        super(title, description,timePreparation, timeToBeCooked, numberPortions, valutation, difficulty,
                category);
                this.time=time;
        }
    /**
     * Metodo getter per il tempo a disposizione dell'utente
     * @return il tempo a disposizione
     */
    public int getTime(){
        return time;
    }
    /**
     * Metodo setter del tempo a disposizione dell'utente
     * @param tempo il tempo a disposizione
     */
    public void setTime(int tempo){
        this.time=tempo;
    }
    }

