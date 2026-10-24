package it.univaq.model;
import java.util.Set;
/**
 * La classe Ingredient viene utilizzata per la creazione di ingredienti 
 * necessari nelle liste della spesa e nelle ricette
 */
public class Ingredient implements Filterable {
    private String name;
    private Measurement measure;
    private double calories;
    private IngredientCategory category;
    private Set<Allergy> allergies;
/**
 * Metodo costruttore della classe Ingredient
 * @param name il nome dell'ingrediente
 * @param measure il tipo di unità di misura dell'ingrediente
 * @param calories le calorie associate all'ingrediente
 * @param category la categoria associata all'ingrediente
 * @param allergies un set di allergie legate all'ingrediente
 * @return una nuova istanza di Ingredient
 */
public Ingredient(String name,Measurement measure,double calories,IngredientCategory category,Set<Allergy> allergies){
this.name=name;
this.measure=measure;
this.calories=calories;
this.category=category;
this.allergies=allergies;
}
/**
 * Metodo getter per il nome dell'ingrediente
 * @return il nome dell'ingrediente
 */
public String getName() { 
    return name; 
}
/**(non-Javadoc)
 * Non sarebbe meglio scriverlo in maniera esplicita,tipo in questo modo:
 * public boolean equals(Object o){
 * if(this==o) return true;
 * if(!(o instanceof Ingredient)) return false;
 * Ingredient i=(Ingredient) o;
 * return this.getName().equals(i.getName())&& this.getCategory().equals(i.getCategory());
 * }
 * 
 */
@Override
public boolean equals(Object o) {
    if (this == o) return true;
    return o instanceof Ingredient i 
            && name != null 
            && name.equalsIgnoreCase(i.name);
}

@Override
public int hashCode() {
    return name != null ? name.toLowerCase().hashCode() : 0;
}

@Override 
public String toString(){
    return "L'ingrediente "+name+" solitamente espresso in "+measure
    +" contiene un totale di "+
    calories+
    " kcal. Appartiene alla categoria "+category+
    " e contiene le seguenti allergie: "+allergies;
}
}
