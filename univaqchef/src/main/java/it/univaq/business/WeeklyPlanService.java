package it.univaq.business;
import it.univaq.model.*;
import java.time.DayOfWeek;
/**
 * Classe WeeklyPlan utilizzata per la gestione di tutti i servizi legati 
 * al piano settimanale
 */
public class WeeklyPlanService {
    public boolean assignRecipeToPlan(WeeklyPlan piano,BaseRecipe recipe,Meal meal,DayOfWeek day){
        if(RecipeRepository.getAllRecipe().contains(recipe))

    }

}
