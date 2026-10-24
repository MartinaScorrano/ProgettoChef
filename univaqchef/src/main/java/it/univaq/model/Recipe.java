package it.univaq.model;

import java.util.List;
/**
 * Classe concreta Recipe utilizzata per la creazione di oggetti di tipo Ricetta
 */
public class Recipe extends BaseRecipe{
/**
 * Metodo costruttore della classe Recipe
 * @param title il titolo della ricetta
 * @param description la descrizione della ricetta
 * @param list la lista degli ingredienti necessari
 * @param timePreparation il tempo per la preparazione della ricetta
 * @param timeToBeCooked il tempo di cottura 
 * @param numberPortions il numero di porzioni
 * @param valutation la valutazione della ricetta
 * @param difficulty la difficoltà della ricetta
 * @param category la categoria di piatto associato alla ricetta
 * @param steps gli step di preparazione della ricetta
 */
    public Recipe(String title,String description,List<IngredientRecipe> list,int timePreparation,int timeToBeCooked,int numberPortions,int valutation,
        Difficulty difficulty,PlateCategory category,List<PreparationStep> steps){
        super(title,description,list,timePreparation,timeToBeCooked,numberPortions,valutation,difficulty,category,steps);
    }
    
}
