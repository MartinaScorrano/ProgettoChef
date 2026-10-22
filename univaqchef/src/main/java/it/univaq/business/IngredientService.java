package it.univaq.business;
import java.util.List;

import it.univaq.model.Ingredient;

/**
 * Classe IngredientService utilizzata per implementare i servizi legati agli ingredienti
 */
public class IngredientService{
    private final IngredientRepository repository;
/**
 * Metodo cotruttore della classe IngredientService
 * @param repository la repository che contiene la lista degli ingredienti creati
 * @return una nuova istanza di IngredientService
 */
public IngredientService(IngredientRepository repository){
    this.repository=repository;
}
/**
 * Metodo getter per restituire la lista degli ingredienti nella repository
 * @return la lista degli ingredienti
 */
public List<Ingredient> getAll(){
    return repository.getAllIngredient();
}


    
    
}
