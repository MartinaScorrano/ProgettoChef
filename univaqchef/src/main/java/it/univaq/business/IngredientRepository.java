package it.univaq.business;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import it.univaq.model.Ingredient;

public class IngredientRepository extends DataModelSalvabile<List<Ingredient>>{
    private final ObjectMapper objectMapper=new ObjectMapper();
    private final List<Ingredient> ingredienti=new ArrayList<>();
@Override 
public boolean salva(List<Ingredient> ingredienti){
    if(ingredienti.size()==0){
        log("Errore:impossibile salvare una lista vuota di ingredienti");
        return false;
    }
    log("Salvataggio in corso di " + ingredienti.size() + " ingredienti");
        File fileOutput = new File("ingredienti.json");

        try {
            // Jackson converte l'intera List<Recipe> in un file JSON
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(fileOutput, ingredienti);
            log("Lista degli ingredienti salvata con successo nel file: " + fileOutput.getName());
            return true;

        } catch (IOException e) {
            log("Errore durante il salvataggio su file: " + e.getMessage());
            return false;
        }


}
    
}
