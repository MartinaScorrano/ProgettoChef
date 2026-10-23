package it.univaq.buisness;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.ObjectMapper;

import it.univaq.exceptions.ElementNotFoundException;
import it.univaq.model.Ingredient;

/**
 * Classe IngredientRepository utilizzata per salvare tutti gli ingredienti
 * presenti
 */
public class IngredientRepository extends DataModelSalvabile<List<Ingredient>> {
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final List<Ingredient> ingredienti = new ArrayList<>();

    @Override
    public boolean salva(List<Ingredient> ingredienti) {
        if (ingredienti.isEmpty()) {
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

    /**
     * Metodo getter per l'intera lista degli ingredienti
     * 
     * @return la lista degli ingredienti creati
     */
    public List<Ingredient> getAllIngredient() {
        return ingredienti;
    }

    /**
     * Metodo per il filtraggio della repo di Ingredient
     * 
     * @param criterio il criterio di filtraggio
     * @return la lista degli ingredienti che hanno superato il criterio del
     *         Predicate
     */
    public List<Ingredient> filterIngredient(Predicate<Ingredient> criterio) {
        return ingredienti.stream().filter(criterio).collect(Collectors.toList());
    }

    /**
     * Metodo per eliminare un ingrediente dalla relativa lista
     * 
     * @param ingredienteDaEliminare l'ingrediente da eliminare dall'archivio
     * @return true se l'elemento è stato trovato e l'eliminazione è andata a buon
     *         fine,false altrimenti
     * @throws ElementNotFoundException se l'ingrediente da eliminare non è presente
     *                                  nell'archivio
     */
    public boolean deleteIngredient(Ingredient ingredienteDaEliminare) throws ElementNotFoundException {
        if (ingredienti.contains(ingredienteDaEliminare)) {
            ingredienti.remove(ingredienteDaEliminare);
            return true;

        }
        return false;
    }

    /**
     * Metodo per l'aggiunta di un ingrediente se non già presente nell'archivio
     * 
     * @param ingredienteDaAggiungere l'ingrediente da aggiungere dall'archivio
     * @return true se l'elemento da aggiungere non era già presente e l'aggiunta è
     *         andata a buon fine,false altrimenti
     */
    public boolean addIngredient(Ingredient ingredienteDaAggiungere) {
        if (!(ingredienti.contains(ingredienteDaAggiungere))) {
            ingredienti.add(ingredienteDaAggiungere);
            return true;
        }
        return false;
    }
}
