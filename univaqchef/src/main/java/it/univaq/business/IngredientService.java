package it.univaq.business;
import java.util.List;

import it.univaq.exceptions.ElementNotFoundException;
import it.univaq.model.Ingredient;

/**
 * Classe IngredientService utilizzata per implementare i servizi legati agli ingredienti
 */
public class IngredientService{
    private final IngredientRepository ingredientRepo;
/**
 * Metodo cotruttore della classe IngredientService
 * @param ingredientRepo la repository che contiene la lista degli ingredienti creati
 * @return una nuova istanza di IngredientService
 */
public IngredientService(IngredientRepository ingredientRepo){
    this.ingredientRepo=ingredientRepo;
}
/**
 * Metodo getter per restituire la lista degli ingredienti nella repository
 * @return la lista degli ingredienti
 */
public List<Ingredient> getAll(){
    return ingredientRepo.getAllIngredient();
}

/**
 * Metodo per l'eliminazione di un ingrediente dall lista degli ingredienti
 * @param ingrediente l'ingrediente da eliminare
 */
  public void delete(Ingredient ingrediente){
    try{ingredientRepo.deleteIngredient(ingrediente);

  } 
  catch(ElementNotFoundException e){
    System.out.println(e.getMessage());

  } 
    
}
/**
 * Metodo per l'aggiunta di un ingrediente all'archivio
 * @param ingrediente l'ingrediente da aggiungere
 */
public void add(Ingredient ingrediente){
    ingredientRepo.addIngredient(ingrediente);
}

}
