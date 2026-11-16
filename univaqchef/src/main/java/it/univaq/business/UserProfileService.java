package it.univaq.business;

import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import it.univaq.model.Allergy;
import it.univaq.model.Ingredient;
import it.univaq.model.TypeDiet;
import it.univaq.model.UserProfile;

/** 
 * Servizio per la gestione del profilo utente.
*/

public class UserProfileService {
    private final UserProfileRepository userRepo;

    public UserProfileService(UserProfileRepository userRepo) {
        if (userRepo == null) {
            throw new IllegalArgumentException("Repository non valida");
        }
        this.userRepo = userRepo;
    }

    public UserProfile createProfile(String name, String surname, int numberOfPeople) {
        if (name == null || name.isBlank() || surname == null || surname.isBlank()) {
            throw new IllegalArgumentException("Nome e cognome non validi");
        }
        if (numberOfPeople <= 0) {
            throw new IllegalArgumentException("Il numero di persone dev'essere positivo");
        }

         return new UserProfile(name.trim(), surname.trim(), new ArrayList<>(), new ArrayList<>(), numberOfPeople, new ArrayList<>());
    }

    public void editName(UserProfile profile, String name, String surname) {
        checkProfile(profile);

        if (name == null || name.isBlank() || surname == null || surname.isBlank()) {
            throw new IllegalArgumentException("Nome e cognome non validi.");
        }

        profile.setName(name.trim());
        profile.setSurname(surname.trim());
    }

    public void changeTotalOfPeople(UserProfile profile, int numberOfPeople) {
        checkProfile(profile);

        if (numberOfPeople <= 0) {
            throw new IllegalArgumentException("Il numero di persone dev'essere positivo.");
        }
        profile.setNumberOfPeople(numberOfPeople);
    }

    public boolean addAllergy(UserProfile profile, Allergy allergy) {
        checkProfile(profile);

        if (allergy == null) {
            throw new IllegalArgumentException("Allergia non valida");
        }

        if (profile.getAllergies().contains(allergy)) {
            return false;
        }
        return profile.getAllergies().add(allergy);
    }

     public boolean removeAllergy(UserProfile profile, Allergy allergy) {
        checkProfile(profile);
        return profile.getAllergies().remove(allergy);
    }

     public boolean addDiet(UserProfile profile, TypeDiet diet) {
        checkProfile(profile);
        if (diet == null) {
            throw new IllegalArgumentException("Dieta non valida");
        }

        if (profile.getTypeDiet().contains(diet)) {
            return false;
        }

        return profile.getTypeDiet().add(diet);
    }

    public boolean removeDiet(UserProfile profile, TypeDiet diet) {
        checkProfile(profile);
        return profile.getTypeDiet().remove(diet);
    }

     public boolean addFavoriteIngredient(UserProfile profile, Ingredient ingredient) {
        checkProfile(profile);

        if (ingredient == null) {
            throw new IllegalArgumentException("Ingrediente non valido");
        }

        if (profile.getSweetTreats().contains(ingredient)) {
            return false;
        }

        return profile.getSweetTreats().add(ingredient);
    }

    public boolean removeFavoriteIngredient(UserProfile profile, Ingredient ingredient) {

        checkProfile(profile);
        return profile.getSweetTreats().remove(ingredient);
    }

    public boolean saveProfile(UserProfile profile) {
        checkProfile(profile);
        return userRepo.salva(profile);
    }
    
    /**
    * Carica il profilo utente salvato.
    *
    * @return il profilo oppure null
    *         se non è ancora stato creato
    */
    public UserProfile loadProfile() throws IOException {
    return userRepo.carica();
    }
    

    private void checkProfile(UserProfile profile) {
        if (profile == null) {
            throw new IllegalArgumentException("Profilo utente non valido");
        }
    }

}
