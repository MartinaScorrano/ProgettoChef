package it.univaq.model;

import java.util.List;

/**
 * Classe TraditionaRecipe che individua una ricetta tipica di una determinata
 * tradizione per permettere all'utente non solo di cucinare ma di apprendere
 * anche
 * delle nozioni storiche e chicche culturali
 * 
 */
public class TraditionalRecipe extends BaseRecipe {
    public Region originRegion;
    public String historyNotes, suggestedWine;

    /**
     * Metodo costruttore della classe TraditionalRecipe
     * 
     * @param title           il titolo della ricetta
     * @param description     una descrizione della ricetta
     * @param list            la lista degli ingredienti necessari alla preparazione
     * @param timePreparation il tempo da impiegare per la preparazione della
     *                        ricetta
     * @param timeToBeCooked  il tempo necessario per la cottura del cibo
     * @param numberPortions  il numero di porzioni da specificare per la ricetta al
     *                        fine di poter modificare la quantità di ingredienti
     *                        necessaria
     * @param valutation      la valutazione della ricetta da 1 a 5 stelle
     * @param difficulty      la difficoltà della ricetta
     * @param category        la categoria di appartenenza del piatto da realizzare
     * @param steps           gli step da seguire per la preparazione della ricetta
     * @param originRegion    la regione d'origine della ricetta
     * @param historyNotes    alcune note storiche legate alla ricetta
     * @param suggestedWine   il vino suggerito come accompagnamento alla ricetta
     * @return una istanza di TraditionalRecipe
     */
    public TraditionalRecipe(String title, String description, List<IngredientRecipe> list, int timePreparation,
            int timeToBeCooked, int numberPortions, int valutation, Difficulty difficulty, PlateCategory category,
            PreparationStep steps, Region originRegion, String historyNotes, String suggestedWine) {
        super(title, description, list, timePreparation, timeToBeCooked, numberPortions, valutation, difficulty,
                category, steps);
        this.originRegion = originRegion;
        this.historyNotes = historyNotes;
        this.suggestedWine = suggestedWine;

    }

    /**
     * Metodo getter per la regione d'origine
     * 
     * @return la regione d'origine
     */
    public Region getOriginRegion() {
        return originRegion;
    }

    /**
     * Metodo getter per le nozioni storiche
     * 
     * @return le nozioni storiche
     */
    public String getHistoryNotes() {
        return historyNotes;
    }

    /**
     * Metodo getter per il vino di accompagnamento suggerito
     * 
     * @return il vino suggerito
     */
    public String getSuggestedWine() {
        return suggestedWine;
    }

    /**
     * Metodo setter per la regione d'origine
     * 
     * @param regioneOrigine la regione d'origine del piatto
     */
    public void setOriginRegion(Region regioneOrigine) {
        this.originRegion = regioneOrigine;
    }

    /**
     * Metodo setter per le nozioni storiche
     * 
     * @param nozioniStoriche le nozioni storiche sul piatto tradizionale
     */
    public void setHistoryNotes(String nozioniStoriche) {
        this.historyNotes = nozioniStoriche;
    }

    /**
     * Metodo setter per il vino suggerito
     * 
     * @param vino il vino di accompagnamento suggerito
     */
    public void setSuggestedWine(String vino) {
        this.suggestedWine = vino;
    }

}
