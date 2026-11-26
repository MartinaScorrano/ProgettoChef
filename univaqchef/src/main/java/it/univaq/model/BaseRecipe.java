package it.univaq.model;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import it.univaq.exceptions.InvalidInputException;

/**
 * la classe BaseRecipe è una classe astratta utilizzata per indicare una
 * ricetta base.
 */
public abstract class BaseRecipe {
    private String title, description;
    private List<IngredientRecipe> list;
    private int timePreparation, timeToBeCooked, numberPortions, valutation;
    private Difficulty difficulty;
    private PlateCategory category;
    private List<PreparationStep> steps;

    /**
     * Metodo costruttore della classe BaseRecipe
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
     * @return una nuova istanza di BaseRecipe
     */
    public BaseRecipe(String title, String description, int timePreparation,
            int timeToBeCooked, int numberPortions, int valutation, Difficulty difficulty, PlateCategory category) {
        this.title = title;
        this.description = description;
        this.list = new ArrayList<>();
        this.timePreparation = timePreparation;
        this.timeToBeCooked = timeToBeCooked;
        this.numberPortions = numberPortions;
        this.valutation = valutation;
        this.difficulty = difficulty;
        this.category = category;
        this.steps = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "La ricetta: " + title + " ha la seguente descrizione: " + description
                + ".Gli ingredienti necessari alla preparazione sono: " + list +
                ". Per la preparazione di questa ricetta saranno necessari " + timePreparation + " minuti e "
                + timeToBeCooked + " minuti per la cottura. Questa ricetta è ottima per " + numberPortions
                + " persone.Ha una valutazione di " + valutation + " stelle su 5. Ha una difficoltà "
                + difficulty + ".Il piatto appartiene alla categoria " + category;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof BaseRecipe))
            return false;
        BaseRecipe ricetta = (BaseRecipe) obj;
        return this.title.equals(ricetta.getTitle()) && this.description.equals(ricetta.getDescription());
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(title, description);
    }

    /**
     * Metodo getter per il titolo
     * 
     * @return il titolo della ricetta
     */
    public String getTitle() {
        return title;
    }

    /**
     * Metodo getter per gli step della preparazione
     * 
     * @return la lista degli step di preparazione
     */
    public List<PreparationStep> getPreparationSteps() {
        return steps;
    }

    /**
     * Metodo getter per la descrizione
     * 
     * @return la descrizione della ricetta
     */
    public String getDescription() {
        return description;
    }

    /**
     * Metodo getter per la lista degli ingredienti
     * 
     * @return la lista degli ingredienti
     */
    public List<IngredientRecipe> getListIngredients() {
        return list;
    }

    /**
     * Metodo getter per il tempo necessario per la preparazione
     * 
     * @return il tempo necessario per la preparazione
     */
    public int getTimePreparation() {
        return timePreparation;
    }

    /**
     * Metodo getter per il tempo necessario alla cottura
     * 
     * @return il tempo necessario alla cottura
     */
    public int getTimeToBeCooked() {
        return timeToBeCooked;
    }

    /**
     * Metodo getter per il numero di porzioni
     * 
     * @return il numero di porzioni della ricetta
     */
    public int getNumberPortions() {
        return numberPortions;
    }

    /**
     * Metodo getter per la valutazione della ricetta
     * 
     * @return la valutazione della ricetta
     */
    public int getValutation() {
        return valutation;
    }

    /**
     * Metodo getter per la difficoltà della ricetta
     * 
     * @return la difficoltà della ricetta
     */
    public Difficulty getDifficulty() {
        return difficulty;
    }

    /**
     * Metodo getter per la categoria della ricetta
     * 
     * @return la categoria della ricetta
     */
    public PlateCategory getCategory() {
        return category;
    }

    /**
     * Metodo setter per il titolo della ricetta
     * 
     * @param titolo per il titolo della ricetta
     */
    public void setTitle(String titolo) {
        this.title = titolo;
    }

    /**
     * Metodo setter per la descrizione della ricetta
     * 
     * @param descrizione la descrizione della ricetta
     */
    public void setDescription(String descrizione) {
        this.description = descrizione;
    }

    /**
     * Metodo setter per il tempo necessario alla preparazione della ricetta.
     * 
     * @param tempoPreparazione il tempo necessario alla preparazione
     */
    public void setTimePreparation(int tempoPreparazione) throws InvalidInputException {
        if (tempoPreparazione <= 0) {
            throw new InvalidInputException("Il tempo di preparazione non puo essere uguale a zero o minore di 0");
        }
        this.timePreparation = tempoPreparazione;
    }

    /**
     * Metodo setter per il tempo necessario alla cottura del cibo.
     * 
     * @param tempoCottura il tempo necessario alla cottura
     */
    public void setTimeToBeCooked(int tempoCottura) throws InvalidInputException {
        if (tempoCottura <= 0) {
            throw new InvalidInputException("Il tempo di cottura non puo eseere uguale a zero o minore di 0");
        }
        this.timeToBeCooked = tempoCottura;
    }

    /**
     * Metodo che restituisce il conteggio totale della calorie per la ricetta
     * scelta.
     */
    public void getTotalCalories() {
        double count = 0;
        for (IngredientRecipe ingredient : list) {
            count += ingredient.getCalories();
        }
        System.out.println("Questa ricetta contiene un totale di " + count + " kcal");
    }

    public double getCalories() {
        double count = 0;
        for (IngredientRecipe ingredient : list) {
            count += ingredient.getCalories();
        }
        return count;

    }

    /**
     * @return l'insieme degli allergeni di tutti gli ingredienti
     */
    public Set<Allergy> getAllergens() {
        return list.stream()
                .flatMap(item -> item.getAllergies().stream())
                .collect(Collectors.toCollection(
                        () -> EnumSet.noneOf(Allergy.class)));
    }

    /**
     * Aggiunge un ingrediente; se è già presente somma le quantità
     *
     * @param item l'ingrediente con la quantità
     */

    public void addIngredient(IngredientRecipe item) {
        if (item == null) {
            throw new IllegalArgumentException("Ingrediente non valido");
        }

        for (IngredientRecipe existing : list) {
            if (existing.equals(item)
                    && existing.getMeasure() == item.getMeasure()) {

                for (var entry : item.getQuantity().entrySet()) {
                    double nuovaQuantita = entry.getKey();
                    Measurement unita = entry.getValue();

                    double totale = nuovaQuantita;

                    for (var precedente : existing.getQuantity().entrySet()) {
                        if (precedente.getValue() == unita) {
                            totale += precedente.getKey();
                        }
                    }

                    existing.getQuantity().entrySet()
                            .removeIf(e -> e.getValue() == unita);

                    existing.getQuantity().put(totale, unita);
                }

                return;
            }
        }

        list.add(item);
    }

    /**
     * @param ingredient l'ingrediente da rimuovere
     * @return true se era presente
     */
    public boolean removeIngredient(Ingredient ingredient) {
        if (ingredient == null) {
            return false;
        }
        return list.removeIf(item -> item.equals(ingredient));
    }

    public boolean containsIngredient(Ingredient ingredient) {
        if (ingredient == null) {
            return false;
        }

        for (IngredientRecipe item : list) {
            if (item.getName().equalsIgnoreCase(ingredient.getName())) {
                return true;
            }
        }
        return false;
    }

}
