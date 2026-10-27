package it.univaq.buisness;
import it.univaq.model.ShoppingList;
import it.univaq.model.ItemToBuy;
import it.univaq.model.WeeklyPlan;
import it.univaq.model.BaseRecipe;
import java.util.List;
import java.util.Map;
import it.univaq.model.Meal;
public class ShoppingListService {
/**
 * Da completare!!!!!!!
 * @param piano
 * @return
 */
    public ShoppingList generateShoppingList(WeeklyPlan piano){
        ShoppingList shop=new ShoppingList(piano);
        for(Map<Meal,List<BaseRecipe>> mappa:piano.getPlan().values()){
            for(List<BaseRecipe> recipeList:mappa.values()){
                for(BaseRecipe br:recipeList){
                    shop.getShoppingList().add(br.getListIngredients().keySet());
                }
            }

        }


    }
}
