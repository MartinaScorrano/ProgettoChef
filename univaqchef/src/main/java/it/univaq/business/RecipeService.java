package it.univaq.business;
import it.univaq.model.Recipe;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.File;
import java.io.IOException;

public class RecipeService extends DataModelSalvabile<Recipe>{
    private final ObjectMapper objectMapper;
public RecipeService(){
    this.objectMapper=new ObjectMapper();
}
    @Override 
    public boolean salva(Recipe recipe){
        if(recipe==null){
            log("Errore:impossibile salvare una ricetta ineistente");
        }
        log("Salvataggio in corso della ricetta "+recipe.getTitle());
        String nomeFile = recipe.getTitle().toLowerCase().replaceAll("\\s+", "_") + ".json";
        File fileOutput = new File(nomeFile);
        try {
            // Scrittura dell'oggetto Java su file JSON tramite Jackson
            objectMapper.writeValue(fileOutput, recipe);
            log("Ricetta salvata con successo nel file: " + fileOutput.getName());
            return true;

        } catch (IOException e) {
            log("Errore durante il salvataggio su file: " + e.getMessage());
            return false;
        }
    }
    
}
