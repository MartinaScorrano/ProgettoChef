package it.univaq.business;

import it.univaq.model.ShoppingList;
import it.univaq.model.ItemToBuy;
import it.univaq.model.WeeklyPlan;
import it.univaq.model.BaseRecipe;
import java.util.List;
import java.util.Map;
import it.univaq.model.Meal;
import it.univaq.model.IngredientRecipe;
import java.util.ArrayList;
import java.time.DayOfWeek;
import java.util.TreeMap;
import it.univaq.model.Ingredient;
import it.univaq.model.Measurement;
public class ShoppingListService {
    /**
     * Metodo per generare una lista della spesa giornaliera
     * @param piano il piano settimanale da cui generare la lista 
     * @param day il giorno della settimana da cui generare la lista
     * @return la lista della spesa giornaliera;
     */
    public ShoppingList generateShoppingListPerDay(WeeklyPlan piano,DayOfWeek day) {
        ShoppingList shop = new ShoppingList(piano);
        Map<Meal,List<BaseRecipe>> mappa=new TreeMap<>(piano.getPlan().get(day));
        for(List<BaseRecipe> listaRicette:mappa.values()){
            for(BaseRecipe b:listaRicette){
                for(IngredientRecipe ingredient:b.getListIngredients()){
                    for(Map.Entry<Double,Measurement> entry:ingredient.quantity.entrySet()){
                        double quantita=entry.getKey();
                        Measurement misura=entry.getValue();
                        ItemToBuy item=new ItemToBuy(ingredient,quantita,misura);
                        shop.getShoppingList().add(item);
                    }

                }
            }
            
        }
        return shop;

    }
/**
 * Metodo per la generazione di liste della spesa per l'intera settimana del piano
 * @param piano il piano settimanale scelto da cui generare la lista 
 * @return la lista della spesa per l'intera settimana
 */
public ShoppingList generateShoppingListPerWeek(WeeklyPlan piano){
    ShoppingList shop = new ShoppingList(piano);
        for(Map<Meal,List<BaseRecipe>> mappaRicette:piano.getPlan().values()){
        for(List<BaseRecipe> listaRicette:mappaRicette.values()){
            for(BaseRecipe b:listaRicette){
                for(IngredientRecipe ingredient:b.getListIngredients()){
                    for(Map.Entry<Double,Measurement> entry:ingredient.quantity.entrySet()){
                        double quantita=entry.getKey();
                        Measurement misura=entry.getValue();
                        ItemToBuy item=new ItemToBuy(ingredient,quantita,misura);
                        shop.getShoppingList().add(item);
                    }

                }
            }
            
        }
    }
        return ingredientsTogether(shop);
}
/**
 * Metodo che genera una nuova lista accorpando insieme gli ingredienti necessari
 * @param lista la lista da modificare
 * @return la nuova lista modificata
 */
public ShoppingList ingredientsTogether(ShoppingList lista){
    List<ItemToBuy> elenco=new ArrayList(lista.getShoppingList());
    


}
}
