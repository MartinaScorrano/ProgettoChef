package it.univaq.model;
import java.util.ArrayList;
import java.util.List;
/**
 * Classe ShoppingList utilizzata per modellare la lista della spesa
 * contenente gli ItemToBuy
 */
public class ShoppingList {
    public List<ItemToBuy> shoppingList;
    public WeeklyPlan choosenPlan;
/**
 * Metodo costruttore della classe ShoppingList
 * @param choosenPlan il piano settimanale scelto da cui generare una lista della spesa
 * @return una nuova istanza di ShoppingList
 */
public ShoppingList(WeeklyPlan choosenPlan){
    this.choosenPlan=choosenPlan;
    this.shoppingList=new ArrayList<>();
}
/**
 * Metodo getter per la lista della spesa
 * @return la lista della spesa
 */
public List<ItemToBuy> getShoppingList(){
    return shoppingList;
}
/**
 * Metodo getter per il piano settimanale
 * @return il piano settimanale scelto
 */
public WeeklyPlan getWeeklyPlan(){
    return choosenPlan;
}
/**
 * Metodo setter per il piano scelto
 * @param piano il piano settimanale scelto da cui generare una lista della spesa
 */
public void setWeeklyPlan(WeeklyPlan piano){
    this.choosenPlan=piano;
}
@Override 
public String toString(){
    return "Per il piano settimanale iniziato il giorno "+choosenPlan.getStartDate()+
    "hai bisogno dei seguenti ingredienti: "+shoppingList;
}
@Override 
public boolean equals(Object obj){
    if(this==obj) return true;
    if(!(obj instanceof ShoppingList)) return false;
    ShoppingList shop=(ShoppingList) obj;
    return this.shoppingList.equals(shop.getShoppingList());
}
    
}
