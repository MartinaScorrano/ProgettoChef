package it.univaq.business;
import java.util.List;

import it.univaq.model.BaseRecipe;

/**
 * Classe RecipeService utilizzata al fine di modellare tutti i servizi associati alle ricette
 */
public class RecipeService {
    private final RecipeRepository repository; 
/**
 * Metodo costruttore della classe RecipeService
 * @param repository la repository che contiene una lista di tutte le ricette create e presenti
 * @return una nuova istanza di RecipeService
 */
public RecipeService(RecipeRepository repository){
    this.repository=repository;
    
}
/**
 * Metodo getter la l'intera lista delle ricette
 */
public List<BaseRecipe> getAll(){
    return repository.getAllRecipe();
}




}


 
    

