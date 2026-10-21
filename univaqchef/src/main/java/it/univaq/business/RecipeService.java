package it.univaq.business;
import it.univaq.model.Recipe;
import java.util.function.Predicate;
import it.univaq.model.BaseRecipe;
import java.util.List;
import it.univaq.model.WeeklyPlan;

/**
 * Classe RecipeService utilizzata al fine di modellare tutti i servizi associati alle ricette
 */
public class RecipeService implements Predicate<BaseRecipe>{
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
 * Metodo utilizzato per il filtraggio delle ricette in base a degli specifici criteri
 * @param criterio il criterio per la ricetta di una specifica ricetta
 * @return l'elenco filtrato delle ricette che soddisfano il criterio specificato
 */
public List<BaseRecipe> filtraRicette(Predicate<BaseRecipe> criterio){
    return repository.filter(criterio);

}



}


 
    

