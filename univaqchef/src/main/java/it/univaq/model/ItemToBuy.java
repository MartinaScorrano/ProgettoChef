package it.univaq.model;
/**
 * Classe ItemoToBuy utilizzata per modellare l'elemento da acquistare 
 * per una ricetta e in generale modella ciò che occorre comprare 
 * all'interno di una shoppingList
 */
public class ItemToBuy {
    public Ingredient ingredient;
    public double quantityToPurchase;
    public Measurement measure;
    public boolean purchased;
/**
 * Metodo costruttore della classe ItemToBuy
 * @param ingredient l'ingrediente da acquistare
 * @param quantityToPurchase la quantità da acquistare
 * @return una nuova istanza di ItemToBuy
 */
public ItemToBuy(Ingredient ingredient,double quantityToPurchase,Measurement measure){
    this.ingredient=ingredient;
    this.quantityToPurchase=quantityToPurchase;
    this.purchased=false;
    this.measure=measure;
}
@Override 
public boolean equals(Object obj){
    if(this==obj) return true;
    if(!(obj instanceof ItemToBuy)) return false;
    Ingredient ingrediente=(Ingredient) obj;
    return this.ingredient.getName().equals(ingrediente.getName());
}
@Override 
public String toString(){
    return "C'è bisogno di acquistare "+quantityToPurchase+ 
    measure+"di "+ingredient
    +". L'acquisto al momento risulta "+purchased;
}
/**
 * Metodo getter per l'ingrediente
 * @return l'ingrediente da acquistare
 */
public Ingredient getIngredient(){
    return ingredient;
}
/**
 * Metodo getter per la quantità da acquistare
 * @return la quantità da acquistare
 */
public double getQuantityToPurchase(){
    return quantityToPurchase;
}

}
