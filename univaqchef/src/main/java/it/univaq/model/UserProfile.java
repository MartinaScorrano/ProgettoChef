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
/**
 * Metodo getter per il nome dell'utente
 * @return il nome dell'utente
 */
public String getName(){
    return name;
}
/**
 * Metodo getter per il cognome dell'utente
 * @return il cognome dell'utente
 */
public String getSurname(){
    return surname;
}
/**
 * Metodo getter per le allergie
 * @return la lista delle allergie dell'utente
 */
public List<Allergy> getAllergies(){
    return allergies;
}
/**
 * Metodo getter per i tipi di dieta seguite dall'utente
 * @return il tipo di diete seguite dall'utente
 */
public List<TypeDiet> getTypeDiet(){
    return typeDiet;
}
/**
 * Metodo getter per gli sweet treats dell'utente
 * @return la lista degli sweet treats
 */
public List<Ingredient> getSweetTreats(){
    return sweetTreats;
}
/**
 * Metodo getter per il numero di persone
 * @return il numero di persone del nucleo familiare dell'utente
 */
public int getNumberOfPeople(){
    return numberOfPeople;
}
/**
 * Metodo setter per il nome dell'utente
 * @param nome il nome dell'utente
 */
public void setName(String nome){
    this.name=nome;
}
/**
 * Metoo setter per il cognome dell'utente
 * @param cognome il cognome dell'utente
 */
public void setSurname(String cognome){
    this.surname=cognome;
}
/**
 * Metodo setter per il numero di persone
 * @param numero il numero di persone che compongono il nucleo familiare dell'utente
 */
public void setNumberOfPeople(int numero){
    this.numberOfPeople=numero;
}

}
