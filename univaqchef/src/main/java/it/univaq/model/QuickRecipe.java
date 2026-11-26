package it.univaq.model;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import it.univaq.exceptions.InvalidRecipeException;

/**
 * Classe QuickRecipe utilizzata per ricette veloci da poter preparare in un
 * certo range temporale apportando eventualmente dei cambiamenti sui passi di
 * preparazione oppure sugli ingredienti necessari
 * 
 */
public class QuickRecipe extends BaseRecipe {
    public static final int MAX_PREPARATION_TIME = 30;

    public int rangePreparationTime;

    /**
     * Metodo costruttore della classe QuickRecipe
     * 
     * @param title           il titolo della ricetta
     * @param description     una descrizione della ricetta
     * @param timePreparation il tempo da impiegare per la preparazione della
     *                        ricetta
     * @param timeToBeCooked  il tempo necessario per la cottura del cibo
     * @param numberPortions  il numero di porzioni da specificare per la
     *                        ricetta al fine di poter modificare la quantità
     *                        di ingredienti necessaria
     * @param valutation      la valutazione della ricetta da 1 a 5 stelle
     * @param difficulty      la difficoltà della ricetta
     * @param category        la categoria di appartenenza del piatto da
     *                        realizzare
     * @param time            il tempo che l'utente ha a disposizione per la
     *                        preparazione del piatto
     * @throws InvalidRecipeException se timePreparation supera 30 minuti
     */
    public QuickRecipe(String title, String description, int timePreparation,
            int timeToBeCooked, int numberPortions, int valutation, Difficulty difficulty, PlateCategory category,
            int time) {
        super(title, description, timePreparation, timeToBeCooked, numberPortions, valutation, difficulty,
                category);
        this.rangePreparationTime = time;
        maxDuration(timePreparation);
        setTime(time);
    }

    /**
     * Metodo getter per il tempo a disposizione dell'utente
     * 
     * @return il tempo a disposizione
     */
    public int getTime() {
        return rangePreparationTime;
    }

    /**
     * Metodo setter del tempo a disposizione dell'utente
     * 
     * @param tempo il tempo a disposizione
     */
    public void setTime(int tempo) {
        if (tempo <= 0) {
            throw new IllegalArgumentException("Il tempo dev'essere positivo");
        }
        this.rangePreparationTime = tempo;
    }

    /**
     * Suggerisce un ingrediente con cui sostituire uno della ricetta: della
     * stessa categoria e unità di misura, non già presente nella ricetta, che
     * non introduce allergeni nuovi e con le calorie più vicine all'originale.
     *
     * @param ingredient l'ingrediente della ricetta da sostituire
     * @param candidates gli ingredienti disponibili tra cui scegliere
     * @return il sostituto, oppure vuoto se l'ingrediente non è nella ricetta o
     *         non c'è un'alternativa adatta
     */
    public Optional<Ingredient> suggestSubstitution(Ingredient ingredient, List<Ingredient> candidates) {
        if (ingredient == null || candidates == null || !containsIngredient(ingredient)) {
            return Optional.empty();
        }
        return candidates.stream()
                .filter(c -> !c.equals(ingredient))
                .filter(c -> !containsIngredient(c))
                .filter(c -> c.getCategory() == ingredient.getCategory())
                .filter(c -> c.getMeasure() == ingredient.getMeasure())
                .filter(c -> ingredient.getAllergies().containsAll(c.getAllergies()))
                .min(Comparator.comparingDouble(c -> Math.abs(c.getCalories() - ingredient.getCalories())));
    }

    private void maxDuration(int time) throws InvalidRecipeException {
        if (time <= 0 || time > MAX_PREPARATION_TIME) {
            throw new InvalidRecipeException("Il tempo di preparazione deve essere compreso tra 1 e 30 minuti");
        }
    }

}
