package it.univaq.model;
import java.util.Set;
/**
 * Classe IngredientRecipe utilizzata per modellare l'oggetto ingrediente 
 * appartenente ad una ricetta
 */
public class IngredientRecipe extends Ingredient{
    public double quantity;
    /**
     * Metodo costruttore della classe IngredientRecipe
     * @param name il nome dell'ingrediente
     * @param measure l'unità di misura dell'ingrediente
     * @param calories le calorie dell'ingrediente
     * @param category la categoria dell'ingrediente
     * @param allergies le allergie legate all'ingrediente
     * @param quantity la quantità di ingrediente
     */
public IngredientRecipe(String name,Measurement measure,double calories,
    IngredientCategory category,Set<Allergy> allergies,double quantity){
    super(name,measure,calories,category,allergies);
    this.quantity=quantity;

}
/**
 * Metodo getter per la qauntità di un ingrediente
 * @return la quantià necessaria di un certo ingrediente
 */
public double getQuantity(){
    return quantity;
}
    
}
