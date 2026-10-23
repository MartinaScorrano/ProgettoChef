package it.univaq.buisness;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

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
        String nomeFile = userProfile.getName().toLowerCase().replaceAll("\\s+", "_") + ".json";
        File fileOutput = new File(nomeFile);
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

}
