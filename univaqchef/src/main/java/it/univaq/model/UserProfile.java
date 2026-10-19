package it.univaq.model;
import java.util.List;
/**
 * Classe UserProfile utilizzata per la creazione del profilo utente
 * 
 */
public class UserProfile {
    public String name,surname;
    public List<Allergy> allergies;
    public List<TypeDiet> typeDiet;
    public int numberOfPeople;
    public List<Ingredient> sweetTreats;
/**
 * Metodo costruttore della classe UserProfile
 * @param name il nome dell'utente
 * @param surname il cognome dell'utente
 * @param allergies la lista delle eventuali allergie dell'utente
 * @param typeDiet lista degli eventuali tipi di dieta seguiti dall'utente
 * @param numberOfPeople il numero di persone che compongono il nucleo familiare dell'utente(in modo da avere le quantià settate già per il numbero di persone predefinito)
 * @param sweetTreats la lista degli ingredienti particolarmente amati dall'utente
 * @return una nuova istanza di UserProfile
 */
public UserProfile(String name,String surname,List<Allergy> allergies,List<TypeDiet> typeDiet,int numberOfPeople,List<Ingredient> sweetTreats){
    this.name=name;
    this.surname=surname;
    this.allergies=allergies;
    this.typeDiet=typeDiet;
    this.numberOfPeople=numberOfPeople;
    this.sweetTreats=sweetTreats;
}
}
