package it.univaq.business;
import java.util.List;

import it.univaq.exceptions.ElementNotFoundException;
import it.univaq.model.BaseRecipe;

/**
 * Classe RecipeService utilizzata al fine di modellare tutti i servizi associati alle ricette
 */
public class RecipeService {
    private final RecipeRepository recipeRepo; 
/**
 * Metodo costruttore della classe RecipeService
 * @param recipeRepo la repository che contiene una lista di tutte le ricette create e presenti
 * @return una nuova istanza di RecipeService
 */
public RecipeService(RecipeRepository recipeRepo){
    this.recipeRepo=recipeRepo;
    
}
/**
 * Metodo getter per restituire l'intera lista delle ricette
 * @return l'intera lista delle ricette
 */
public List<BaseRecipe> getAll(){
    return recipeRepo.getAllRecipe();
}
/**
 * Metodo per l'eliminazione di una ricetta dal ricettario
 */
public void delete(BaseRecipe ricetta){
   try{ recipeRepo.deleteRecipe(ricetta);
}
catch(ElementNotFoundException e){
    System.out.println(e.getMessage());
}




}
}


 
    

