package it.univaq.buisness;
import it.univaq.model.ShoppingList;
import it.univaq.model.ItemToBuy;
import it.univaq.model.WeeklyPlan;
import it.univaq.model.BaseRecipe;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import it.univaq.model.Meal;
/**
 * Classe ShoppingListService utilizzata per modellare i metodi di gestione 
 * delle liste della spesa
 */
public class ShoppingListService {
/**
 * Metodo per generare una lista della spesa a partire da un pano settimanale
 * @param piano il piano settimanale di cui vogliamo generare una lista della spesa
 * @return un oggetto di tipo ShoppingList
 */
    public ShoppingList generateShoppingList(WeeklyPlan piano){
        ShoppingList shop=new ShoppingList(piano);
        for(Map<Meal,List<BaseRecipe>> mappa:piano.getPlan().values()){
            for(List<BaseRecipe> recipeList:mappa.values()){
                for(BaseRecipe br:recipeList){
                    shop.getShoppingList().addAll(br.getListIngredients());
                }
            }

        }
        return shop;
}
/**
 * Metodo per raggruppare gli stessi ingredienti ripetuti in più ricette presenti
 * nellon stesso piano settimanale DA COMPLETARE
 * @param piano il piano settimanale
 */
public Map ingredientTogether(ShoppingList listaNonModificata,WeeklyPlan piano){
Map<ItemToBuy,Integer> mappa=new TreeMap<>();


}
}
