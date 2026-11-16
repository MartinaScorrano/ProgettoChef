package it.univaq.business;

import java.util.ArrayList;
import java.util.List;
import it.univaq.model.Allergy;
import it.univaq.model.Ingredient;
import it.univaq.model.IngredientCategory;
import it.univaq.model.Measurement;
import it.univaq.model.TypeDiet;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;

import it.univaq.model.UserProfile;

public class UserProfileRepository extends DataModelSalvabile<UserProfile> {
    private final ObjectMapper objectMapper;

    public UserProfileRepository() {
        this.objectMapper = new ObjectMapper();
    }

    @Override
    public boolean salva(UserProfile userProfile) {
        if (userProfile == null) {
            log("Errore:impossibile salvare un profilo utente inesistente");
            return false;
        }
        log("Salvataggio in corso del profilo utente di " + userProfile.getName());
        File fileOutput = new File("profilo_utente.json");
        try {
            // Scrittura dell'oggetto Java su file JSON tramite Jackson
            objectMapper.writeValue(fileOutput, userProfile);
            log("Profilo utente salvato con successo nel file: " + fileOutput.getName());
            return true;

        } catch (IOException e) {
            log("Errore durante il salvataggio su file: " + e.getMessage());
            return false;
        }
    }

    public UserProfile carica() throws IOException {
        File file = new File("profilo_utente.json");

        if (!file.exists()) {
            return null;
        }

        JsonNode root = objectMapper.readTree(file);

        if (root == null || !root.isObject()) {
            throw new IOException("File del profilo non valido");
        }

    String name = root.path("name").asText();
    String surname = root.path("surname").asText();
    int numberOfPeople = root.path("numberOfPeople").asInt();

     List<Allergy> allergies = new ArrayList<>();

    for (JsonNode node : root.path("allergies")) {
        allergies.add(
            Allergy.valueOf(node.asText())
        );
    }

    List<TypeDiet> diets = new ArrayList<>();

    for (JsonNode node : root.path("typeDiet")) {
        diets.add(TypeDiet.valueOf(node.asText())
        );
    }

    List<Ingredient> favorites = new ArrayList<>();

    for (JsonNode node : root.path("sweetTreats")) {
        Ingredient ingrediente = new Ingredient(node.path("name").asText(), Measurement.valueOf(node.path("measure").asText()), node.path("calories").asDouble(), IngredientCategory.valueOf(node.path("category").asText()));
    }

    for (JsonNode allergy : node.path("allergies")) {
            ingrediente.allergies.add(Allergy.valueOf(allergy.asText()));
        }
        favorites.add(ingrediente);
    }
    
    // Ricostruisce il profilo utente
    return new UserProfile(
        name,
        surname,
        allergies,
        diets,
        numberOfPeople,
        favorites
    );
}
