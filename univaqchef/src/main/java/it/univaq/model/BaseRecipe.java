package it.univaq.model;
import java.util.List;
/**
 * la classe BaseRecipe è una classe astratta utilizzata per indicare una ricetta base.
 */
public abstract class  BaseRecipe {
    public String title,description;
    public List<IngredientRecipe> list;
    public int timePreparation,timeToBeCooked,numberPortions,valutation;
    public Difficulty difficulty;
    public PlateCategory category;
    public PreparationStep steps;
/**
 * Metodo costruttore della classe BaseRecipe
 * @param title il titolo della ricetta
 * @param description una descrizione della ricetta
 * @param list la lista degli ingredienti necessari alla preparazione
 * @param timePreparation il tempo da impiegare per la preparazione della ricetta
 * @param timeToBeCooked il tempo necessario per la cottura del cibo
 * @param numberPortions il numero di porzioni da specificare per la ricetta al fine di poter modificare la quantità di ingredienti necessaria
 * @param valutation la valutazione della ricetta da 1 a 5 stelle
 * @param difficulty la difficoltà della ricetta
 * @param category la categoria di appartenenza del piatto da realizzare
 *@param steps gli step da seguire per la preparazione della ricetta
 @return una nuova istanza di BaseRecipe 
 */
public BaseRecipe(String title,String description,List<IngredientRecipe> list,int timePreparation,int timeToBeCooked,int numberPortions,int valutation,Difficulty difficulty,PlateCategory category,PreparationStep steps){
    this.title=title;
    this.description=description;
    this.list=list;
    this.timePreparation=timePreparation;
    this.timeToBeCooked=timeToBeCooked;
    this.numberPortions=numberPortions;
    this.valutation=valutation;
    this.difficulty=difficulty;
    this.category=category;
    this.steps=steps;
}
@Override 
public String toString(){
    return "La ricetta: "+getTitle()+" ha la seguente descrizione: "+getDescription()+".Gli ingredienti necessari alla preparazione sono: "+getListIngredients()+
    ". Per la preparazione di questa ricetta saranno necessari "+getTimePreparation()+ " minuti e "+getTimeToBeCooked()+" minuti per la cottura. Questa ricetta è ottima per "+getNumberPortions()+" persone.Ha una valutazione di "+getValutation()+" stelle su 5. Ha una difficoltà "+getDifficulty()+".Il piatto appartiene alla categoria"
}
/**
 * Metodo getter per il titolo
 * @return il titolo della ricetta
 */
public String getTitle(){
return title;
}
/**
 * Metodo getter per la descrizione
 * @return la descrizione della ricetta
 */
public String getDescription(){
    return description;
}
/**
 * Metodo getter per la lista degli ingredienti
 * @return la lista degli ingredienti
 */
public List<IngredientRecipe> getListIngredients(){
    return list;
}
/** 
 * Metodo getter per il tempo necessario per la preparazione
 * @return il tempo necessario per la preparazione
 */
public int getTimePreparation(){
    return timePreparation;
}
/**
 * Metodo getter per il tempo necessario alla cottura
 * @return il tempo necessario alla cottura
 */
public int getTimeToBeCooked(){
    return timeToBeCooked;
}
/**
 * Metodo setter per il titolo della ricetta
 * @param titolo per il titolo della ricetta
 */
public void setTitle(String titolo){
    this.title=titolo;
}
/**
 * Metodo setter per la descrizione della ricetta
 * @param descrizione la descrizione della ricetta
 */
public void setDescription(String descrizione){
    this.description=descrizione;
}
/**
 * Metodo setter per il tempo necessario alla preparazione della ricetta
 * @param tempoPreparazione il tempo necessario alla preparazione
 */
public void setTimePreparation(int tempoPreparazione){
    this.timePreparation=tempoPreparazione;
}
/**
 * Metodo setter per il tempo necessario alla cottura del cibo
 *@param tempoCottura il tempo necessario alla cottura 
 */
public void setTimeToBeCooked(int tempoCottura){
    this.timeToBeCooked=tempoCottura;
}
/**
 * Metodo che restituisce il conteggio totale della calorie per la ricetta scelta
 * @return il numero totale di calorie espresso in kcal.
 */
public String getTotalCalories(){
    int count=0;
    for(IngredientRecipe ingredient:list){
        count+=ingredient.getCalories();
}
System.out.println("Questa ricetta contiene un totale di "+count+" kcal");
}
}
