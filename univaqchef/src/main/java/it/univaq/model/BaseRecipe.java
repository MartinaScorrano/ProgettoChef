package it.univaq.model;
import java.util.List;
/**
 * la classe BaseRecipe è una classe astratta utilizzata per indicare una ricetta base.
 */
public abstract class  BaseRecipe {
    public String title,description;
    public List<IngredientRecipe> list;
    public int timePreparation,timeToBeCooked,numberPortions,valutation;
    public Difficulty difficulty;
    public PlateCategory category;
    public PreparationStep steps;
/**
 * Metodo costruttore della classe BaseRecipe
 * @param title il titolo della ricetta
 * @param description una descrizione della ricetta
 * @param list la lista degli ingredienti necessari alla preparazione
 * @param timePreparation il tempo da impiegare per la preparazione della ricetta
 * @param timeToBeCooked il tempo necessario per la cottura del cibo
 * @param numberPortions il numero di porzioni da specificare per la ricetta al fine di poter modificare la quantità di ingredienti necessaria
 * @param valutation la valutazione della ricetta da 1 a 5 stelle
 * @param difficulty la difficoltà della ricetta
 * @param category la categoria di appartenenza del piatto da realizzare
 *@param steps gli step da seguire per la preparazione della ricetta
 @return una nuova istanza di BaseRecipe 
 */
public BaseRecipe(String title,String description,List<IngredientRecipe> list,int timePreparation,int timeToBeCooked,int numberPortions,int valutation,Difficulty difficulty,PlateCategory category,PreparationStep steps){
    this.title=title;
    this.description=description;
    this.list=list;
    this.timePreparation=timePreparation;
    this.timeToBeCooked=timeToBeCooked;
    this.numberPortions=numberPortions;
    this.valutation=valutation;
    this.difficulty=difficulty;
    this.category=category;
    this.steps=steps;
}



}
