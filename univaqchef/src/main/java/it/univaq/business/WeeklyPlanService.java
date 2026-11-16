package it.univaq.business;
import it.univaq.model.*;
import java.time.DayOfWeek;
/**
 * Classe WeeklyPlan utilizzata per la gestione di tutti i servizi legati 
 * al piano settimanale
 */
public class WeeklyPlanService {
    private final RecipeRepository recipeRepo;
    /**
     * Costruttore del servizio.
     * Riceve la repository delle ricette.
     */
    public WeeklyPlanService(RecipeRepository recipeRepo) {
        if (recipeRepo == null) {
            throw new IllegalArgumentException("Repository non valida");
        }
           this.recipeRepo = recipeRepo;
    }

    /**
     * Assegna una ricetta a un pasto
     * di un determinato giorno.
     *
     * @return true se l'assegnazione riesce,
     *         false se la ricetta non esiste
     *         nella repository.
     */
    public boolean assignRecipeToPlan(WeeklyPlan piano, BaseRecipe recipe, Meal meal, DayOfWeek day) {

        if (piano == null || recipe == null || meal == null || day == null) {

            throw new IllegalArgumentException("Parametri non validi");
        }

        if (!recipeRepo.getAllRecipe().contains(recipe)) {
            return false;
        }
        piano.addRecipe(day, meal, recipe);
        return true;
    }

    /**
     * Rimuove una ricetta dal piano settimanale.
     */
    public boolean removeRecipeFromWeeklyPlan(WeeklyPlan piano, BaseRecipe recipe, Meal meal, DayOfWeek day) {
        if (piano == null || recipe == null || meal == null || day == null) {
            throw new IllegalArgumentException("Parametri non validi");
        }
        return piano.removeRecipe(day, meal, recipe);
    }

     /**
     * Restituisce il numero di ricette
     * assegnate a un determinato pasto.
     */
    public int countRecipesPerMeal(WeeklyPlan piano, Meal meal, DayOfWeek day) {

        if (piano == null || meal == null || day == null) {
            throw new IllegalArgumentException("Parametri non validi");
        }

        return piano.getRecipes(day, meal).size();
    }

}
