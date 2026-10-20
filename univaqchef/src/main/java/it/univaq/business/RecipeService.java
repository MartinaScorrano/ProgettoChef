package it.univaq.business;
import it.univaq.model.Recipe;
import java.util.function.Predicate;
import it.univaq.model.BaseRecipe;
import java.util.List;


public class RecipeService implements Predicate<BaseRecipe>{
    private final RecipeRepository repository;
public RecipeService(RecipeRepository repository){
    this.repository=repository;
    
}
public List<BaseRecipe> filtraRicette(Predicate<BaseRecipe> criterio){
    return repository.filter(criterio);


}
 
    
}
