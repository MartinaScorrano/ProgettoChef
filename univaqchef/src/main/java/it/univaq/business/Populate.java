package it.univaq.business;
import java.util.ArrayList;
import java.util.List;

import it.univaq.model.Allergy;
import it.univaq.model.Ingredient;
import it.univaq.model.IngredientCategory;
import it.univaq.model.Measurement;

/**
 * La classe Populate viene utilizzata per popolare il programma degli oggetti
 * necessari.
 * Conterrà tutti i new per la creazione degli oggetti in modo da non
 * appesantire
 * il main. Nel main poi verrà semplicemente richiamato il metodo "popola" della
 * classe.
 */
public class Populate {
    public static void popola(RecipeRepository recipeRepo, IngredientRepository ingredientRepo) {
        Ingredient i1=new Ingredient("farina",Measurement.GRAMS,364.0,IngredientCategory.GRAINS_AND_CEREAL);
        i1.allergies.add(Allergy.GLUTEN);
        Ingredient i2=new Ingredient("Pasta di semola",Measurement.GRAMS,350.8,IngredientCategory.GRAINS_AND_CEREAL);
        i2.allergies.add(Allergy.GLUTEN);
        Ingredient i3=new Ingredient("Riso arborio",Measurement.GRAMS,330.0,IngredientCategory.GRAINS_AND_CEREAL);
        Ingredient i4=new Ingredient("Petto di pollo",Measurement.GRAMS,165.4,IngredientCategory.MEAT);
        Ingredient i5=new Ingredient("Carne macinata di manzo",Measurement.GRAMS,250.0,IngredientCategory.MEAT);
        Ingredient i6=new Ingredient("Guanciale",Measurement.GRAMS,655.0,IngredientCategory.MEAT);
        Ingredient i7=new Ingredient("Salmone",Measurement.GRAMS,206.8,IngredientCategory.SEAFOOD);
        i7.allergies.add(Allergy.FISH);
        Ingredient i8=new Ingredient("Tonno in scatola",Measurement.GRAMS,190.9,IngredientCategory.SEAFOOD);
        i8.allergies.add(Allergy.FISH);
        Ingredient i9=new Ingredient("Mozzarella di Bufala",Measurement.GRAMS,280.0,IngredientCategory.DAIRY);
        i9.allergies.add(Allergy.DAIRY);
        Ingredient i10=new Ingredient("Parmigiano",Measurement.GRAMS,431.0,IngredientCategory.DAIRY);
        i10.allergies.add(Allergy.DAIRY);
        Ingredient i11=new Ingredient("Burro",Measurement.GRAMS,717.8,IngredientCategory.DAIRY);
        Ingredient i12=new Ingredient("Banana",Measurement.GRAMS,89.0,IngredientCategory.FRUIT);
        Ingredient i13=new Ingredient("Fragole",Measurement.GRAMS,32.7,IngredientCategory.FRUIT);
        Ingredient i14=new Ingredient("Limone",Measurement.CLOVE,29.0,IngredientCategory.FRUIT);
        Ingredient i15=new Ingredient("Pomodori",Measurement.GRAMS,32.8,IngredientCategory.VEGETABLE);
        i15.allergies.add(Allergy.NICKEL);
        Ingredient i16=new Ingredient("Zucchine",Measurement.GRAMS,17.0,IngredientCategory.VEGETABLE);
        Ingredient i17=new Ingredient("Patate",Measurement.GRAMS,77.8,IngredientCategory.VEGETABLE);
        Ingredient i18=new Ingredient("Insalata",Measurement.GRAMS,15.4,IngredientCategory.VEGETABLE);
        Ingredient i19=new Ingredient("Cipolla",Measurement.GRAMS,40.7,IngredientCategory.VEGETABLE);
        Ingredient i20=new Ingredient("Sale fino",Measurement.PINCH,0.0,IngredientCategory.SEASONINGS);
        Ingredient i21=new Ingredient("Pepe nero",Measurement.PINCH,251.3,IngredientCategory.SEASONINGS);
        Ingredient i22=new Ingredient("Basilico",Measurement.TO_TASTE,23.7,IngredientCategory.SEASONINGS);
        Ingredient i23=new Ingredient("Rosmarino",Measurement.TO_TASTE,131.2,IngredientCategory.SEASONINGS);
        Ingredient i24=new Ingredient("Uova",Measurement.CLOVE,143.0,IngredientCategory.EGGS);
        i24.allergies.add(Allergy.EGGS);
        Ingredient i25=new Ingredient("Olio extravergine d'oliva",Measurement.TABLESPOON,884.6,IngredientCategory.OILS_AND_FATS);
        Ingredient i26=new Ingredient("Acqua",Measurement.LITERS,0.0,IngredientCategory.DRINK);
        Ingredient i27=new Ingredient("Vino bianco",Measurement.MILLILITERS,82.4,IngredientCategory.DRINK);
        i27.allergies.add(Allergy.SOLFITES);
        List<Ingredient> lista=new ArrayList<>(List.of(i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15,i16,i17,i18,i19,i20,i21,i22,i23,i24,i25,i26,i27));
        ingredientRepo.salva(lista);

    }

}
