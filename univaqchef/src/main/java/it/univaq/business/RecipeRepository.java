package it.univaq.business;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;

import it.univaq.exceptions.ElementNotFoundException;
import it.univaq.model.BaseRecipe;
/**
 * Classe RecipeRepository utilizzata per salvare tutte le ricette create
 */
public class RecipeRepository extends DataModelSalvabile<List<BaseRecipe>>{
    private final ObjectMapper objectMapper=new ObjectMapper();
    private final List<BaseRecipe> ricettario=new ArrayList<>();
@Override 
public boolean salva(List<BaseRecipe> ricettario){
    if(ricettario.size()==0){
        log("Errore:impossibile salvare una lista vuota di ricette");
        return false;
    }
    log("Salvataggio in corso di " + ricettario.size() + " ricette...");
        File fileOutput = new File("ricettario.json");

        try {
            // Jackson converte l'intera List<Recipe> in un file JSON
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(fileOutput, ricettario);
            log("Ricettario salvato con successo nel file: " + fileOutput.getName());
            return true;

        } catch (IOException e) {
            log("Errore durante il salvataggio su file: " + e.getMessage());
            return false;
        }

}
/**
 * Metodo per il filtraggio delle ricette in base a specifici criteri
 * @param criterio il criterio da rispettare per il filtraggio
 * @return la lista delle ricette filtrata
 */
public List<BaseRecipe> filterRecipe(Predicate<BaseRecipe> criterio){
    return ricettario.stream().filter(criterio).collect(Collectors.toList());
}
/**
 * Metodo getter per l'intera lista delle ricette
 * @return l'intera lista delle ricette
 */
public List<BaseRecipe> getAllRecipe(){
    return ricettario;
}
/**
 * Metodo per eliminare una ricetta dalla repository
 * @param ricettaDaEliminare la ricetta da eliminare dall'archivio
 * @return true se la ricetta è stata trovata ed eliminata con successo,false altrimenti
 * @throws ElementNotFoundException se la ricetta da eliminare non era presente nell'archivio
 */
public boolean deleteRecipe(BaseRecipe ricettaDaEliminare) throws ElementNotFoundException{
    if(ricettario.contains(ricettaDaEliminare)){
        ricettario.remove(ricettaDaEliminare);
        return true;
    }
    return false;
}
/**
 * Metodo per l'aggiunta di ricette nell'archivio
 * @param ricettaDaAggiungere la ricetta da aggiungere all'archivio
 * @return true se l'aggiunta è andata a buon fine e la ricetta non era effettivamente già presente,false altrimenti
 */
public boolean addRecipe(BaseRecipe ricettaDaAggiungere){
    if(!(ricettario.contains(ricettaDaAggiungere))){
        ricettario.add(ricettaDaAggiungere);
        return true;
}
return false;
}

    
}
