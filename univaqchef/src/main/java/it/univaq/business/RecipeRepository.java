package it.univaq.business;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import it.univaq.model.BaseRecipe;

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


    
}
