package it.univaq.model;

import java.util.ArrayList;
import java.util.List;

import it.univaq.exceptions.ElementNotFoundException;

/**
 * Classe QuickRecipe utilizzata per ricette veloci da poter preparare in un
 * certo range temporale apportando eventualmente dei cambiamenti sui passi di
 * preparazione oppure sugli ingredienti necessari
 * 
 */
public class QuickRecipe extends BaseRecipe {
    public static final int MAX_PREPARATION_TIME = 30;
    private static final Map<String, List<String>> FAST_SUBSTITIONS = new HashMap<>();

    static {
        FAST_SUBSTITUTIONS.put("legumi secchi", List.of("legumi precotti in scatola"));
        FAST_SUBSTITUTIONS.put("pomodori freschi", List.of("passata di pomodoro", "polpa pronta"));
        FAST_SUBSTITUTIONS.put("pasta fresca", List.of("pasta secca a cottura rapida"));
        FAST_SUBSTITUTIONS.put("cipolla intera", List.of("cipolla surgelata tritata", "cipolla in polvere"));
        FAST_SUBSTITUTIONS.put("brodo fatto in casa", List.of("brodo vegetale pronto", "dado"));
        FAST_SUBSTITUTIONS.put("patate intere", List.of("purea in fiocchi", "patate novelle precotte"));
    }

    public int rangePreparationTime;

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
     * @param rangePreparationTime il range di tempo definito dall'utente per la
     *                             preparazione del pasto
     * @return una nuova istanza di QuickRecipe
     */
    public QuickRecipe(String title, String description, List<IngredientRecipe> list, int timePreparation,
            int timeToBeCooked, int numberPortions, int valutation, Difficulty difficulty, PlateCategory category,
            PreparationStep steps, int rangePreparationTime) {
        super(title, description, list, timePreparation, timeToBeCooked, numberPortions, valutation, difficulty,
                category, steps);
        this.rangePreparationTime = rangePreparationTime;

        if (timePreparation > MAX_PREPARATION_TIME) {
            throw new InvalidRecipeException(
                "Una ricetta veloce non può richiedere più di " + MAX_PREPARATION_TIME + " minuti!" 
            );
        }
    }

    if (timePreparation < 0) {
        throw new InvalidRecipeException("Tempo di preparazione non valido.");
    }

    /**
     * Metodo getter per il range temporale
     * 
     * @return il range temporale impostato dall'utente
     */
    private int getRangePreparationTime() {
        return this.rangePreparationTime;
    }

    /**
     * Metodo setter per il range temporale
     * 
     * @param range il range temporale impostato dall'utente
     */
    public void setRangePreparationTime(int range) {
        this.rangePreparationTime = range;
    }

    /**
     * Metodo che restituisce l'elenco dei titolo delle ricette che hanno un tempo
     * di preparazione <= a quello specificato in input
     * 
     * @param range il tempo di preparazione impostato dall'utente
     * @return la lista delle ricette
     */
    public ArrayList<String> searchRecipeInRange(int range) throws ElementNotFoundException {
        ArrayList<String> lista = new ArrayList<>();
        List<BaseRecipe> ricettario = new ArrayList<>();
        for (BaseRecipe recipe : ricettario) {
            if (recipe.getTimePreparation() <= range) {
                lista.add(recipe.getTitle());
            }
        }
        if (lista.isEmpty()) {
            throw new ElementNotFoundException();

        }
        return lista;
    }
}
