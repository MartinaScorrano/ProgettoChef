package it.univaq.business;
import java.util.List;
import java.util.function.Predicate;

import it.univaq.model.Allergy;
import it.univaq.model.BaseRecipe;
import it.univaq.model.Difficulty;
import it.univaq.model.Ingredient;
import it.univaq.model.IngredientRecipe;
import it.univaq.model.PlateCategory;
/**
 * Classe Filter che contiene tutti i filtri applicabili all'interno del programma.
 */
public class Filter {
    /**
     * Metodo per filtrare in base alla categoria del piatto
     * @param categoria la categoria del piatto
     * @return il criterio per il filtraggio sulla categoria del piatto
     */
    public static Predicate<BaseRecipe> filterForCategory(PlateCategory categoria){
        return r->r.getCategory()==(categoria);

    }
    /**
     * Metodo per filtrare in base alla difficoltà della ricetta
     * @param d la difficoltà della ricetta
     * @return il criterio per il filtraggio sulla difficoltà della ricetta
     */
    public static Predicate<BaseRecipe> filterForDifficulty(Difficulty d){
        return r->r.getDifficulty()==(d);
    }
    /**
     * Metodo per il filtraggio in base ad un tempo di preparazione massimo
     * @param time il tempo di preparazione massimo
     * @return il criterio per il filtraggio sul tempo di preparazione massimo
     */
    public static Predicate<BaseRecipe> filterForTimeMax(int time){
        return r->r.getTimePreparation()<=time;
    }
    /**
     * Metodo per il filtraggio in base ad ingredienti contenuti
     * @param i la lista di ingredienti da verificare
     * @return il criterio per il filtraggio su ingredienti contenuti
     */
    public static Predicate<BaseRecipe> filterForIngredient(List<Ingredient> i){
        IngredientRecipe z=(IngredientRecipe) i;
        return r->r.getListIngredients().contains(z);
    }
    /**
     * Metodo per il filtraggio in base alle allergie assenti
     * @param a la lista di allergie assenti
     * @return il criterio per il filtraggio sulle allergie assenti
     */
    public static Predicate<BaseRecipe> filterForNoAllergies(List<Allergy> a){
        return r->r.getAllergens().contains(a);

    }
    /**
     * Metodo per il filtraggio in base ad un range calorico
     * @param min il minimo numero di calorie
     * @param max il massimo numero di calorie
     * @return il criterio per il filtraggio sul range calorico
     */
    public static Predicate<BaseRecipe> filterForRangeCalories(double min,double max){
        return r->r.getCalories()>=min&&r.getCalories()<=max;
    }
    
}
