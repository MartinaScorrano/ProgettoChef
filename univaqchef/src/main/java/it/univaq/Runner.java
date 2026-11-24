package it.univaq;
import it.univaq.business.IngredientRepository;
import it.univaq.business.Populate;
import it.univaq.business.RecipeRepository;

public class Runner {

	public static void main(String[] args) {
		Populate p=new Populate();
		RecipeRepository rRepo=new RecipeRepository();
		IngredientRepository iRepo=new IngredientRepository();
		p.popola(rRepo,iRepo);
		
		
	}

	
}
