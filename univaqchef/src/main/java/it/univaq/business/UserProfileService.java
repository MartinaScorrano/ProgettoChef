package it.univaq.business;

import java.util.ArrayList;
import java.util.List;
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

    public UserProfile createProfile(String name, String lastname, int people) {
        if (name == null || name.isBlank() || lastname == null || lastname.isBlank()) {
            throw new IllegalArgumentException("Nome e cognome non validi");
        }
        if (people <= 0) {
            throw new IllegalArgumentException("Il numero di persone dev'essere positivo");
        }

         return new UserProfile(name.trim(), lastname.trim(), new ArrayList<>(), new ArrayList<>(), people, new ArrayList<>());
    }

    public void editName(UserProfile profile, String name, String lastname) {
        checkProfile(profile);

        if (name == null || name.isBlank() || lastname == null || lastname.isBlank()) {
            throw new IllegalArgumentException("Nome e cognome non validi.");
        }

        profile.setName(name.trim());
        profile.setLastName(lastname.trim());
    }

    public void changeTotalOfPeople(UserProfile profile, int people) {
        checkProfile(profile);

        if (people <= 0) {
            throw new IllegalArgumentException("Il numero di persone dev'essere positivo.");
        }
        profile.setTotalOfPeople(people);
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
}
