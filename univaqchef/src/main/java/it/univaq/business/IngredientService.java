package it.univaq.business;
import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import it.univaq.model.Ingredient;

public class IngredientService extends DataModelSalvabile<Ingredient>{
    private final ObjectMapper objectMapper;
/**
 * Metodo costruttore della classe IngredientService
 * @return una nuova istanza di IngredientService
 */
public IngredientService(){
    this.objectMapper=new ObjectMapper();
}
    @Override 
    public boolean salva(Ingredient ingredient){
        if(ingredient==null){
            log("Errore:impossibile salvare un ingrediente inesistente");
            return false;
        }
        log("Salvataggio in corso dell'ingrediente "+ingredient.getName());
        String nomeFile = ingredient.getName().toLowerCase().replaceAll("\\s+", "_") + ".json";
        File fileOutput = new File(nomeFile);
        try {
            // Scrittura dell'oggetto Java su file JSON tramite Jackson
            objectMapper.writeValue(fileOutput, ingredient);
            log("Ingrediente salvato con successo nel file: " + fileOutput.getName());
            return true;

        } catch (IOException e) {
            log("Errore durante il salvataggio su file: " + e.getMessage());
            return false;
        }
    }
    
}
