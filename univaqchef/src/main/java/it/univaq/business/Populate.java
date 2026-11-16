package it.univaq.business;
import java.util.ArrayList;
import java.util.List;

import it.univaq.model.Allergy;
import it.univaq.model.BaseRecipe;
import it.univaq.model.Difficulty;
import it.univaq.model.Ingredient;
import it.univaq.model.IngredientCategory;
import it.univaq.model.Measurement;
import it.univaq.model.PlateCategory;
import it.univaq.model.PreparationStep;
import it.univaq.model.QuickRecipe;
import it.univaq.model.Recipe;
import it.univaq.model.Region;
import it.univaq.model.TraditionalRecipe;

/**
 * La classe Populate viene utilizzata per popolare il programma degli oggetti
 * necessari.
 * Conterrà tutti i new per la creazione degli oggetti in modo da non
 * appesantire
 * il main. Nel main poi verrà semplicemente richiamato il metodo "popola" della
 * classe.
 */
public class Populate {

  /**
   * Metodo per popolare il sistema
   * @param recipeRepo la repository per le ricette
   * @param ingredientRepo la repository per gli ingredienti
   */  
public static void popola(RecipeRepository recipeRepo, IngredientRepository ingredientRepo) {
        Ingredient i1=new Ingredient("Farina",Measurement.GRAMS,364.0,IngredientCategory.GRAINS_AND_CEREAL);
        i1.allergies.add(Allergy.GLUTEN);
        Ingredient i2=new Ingredient("Pasta di semola",Measurement.GRAMS,350.8,IngredientCategory.GRAINS_AND_CEREAL);
        i2.allergies.add(Allergy.GLUTEN);
        i2.allergies.add(Allergy.EGGS);
        Ingredient i3=new Ingredient("Riso arborio",Measurement.GRAMS,330.0,IngredientCategory.GRAINS_AND_CEREAL);
        Ingredient i4=new Ingredient("Petto di pollo",Measurement.GRAMS,165.4,IngredientCategory.MEAT);
        Ingredient i5=new Ingredient("Carne macinata di manzo",Measurement.GRAMS,250.0,IngredientCategory.MEAT);
        Ingredient i6=new Ingredient("Guanciale",Measurement.GRAMS,655.0,IngredientCategory.MEAT);
        Ingredient i7=new Ingredient("Prosciutto crudo",Measurement.GRAMS,650.0,IngredientCategory.MEAT);
        Ingredient i8=new Ingredient("Petto di pollo",Measurement.GRAMS,110.20,IngredientCategory.MEAT);
        Ingredient i9=new Ingredient("Filetto di manzo",Measurement.KILOGRAMS,220.6,IngredientCategory.MEAT);
        Ingredient i10=new Ingredient("Carne macinata",Measurement.KILOGRAMS,175.6,IngredientCategory.MEAT);
        Ingredient i11=new Ingredient("Prosciutto cotto",Measurement.GRAMS,123.6,IngredientCategory.MEAT);
        Ingredient i12=new Ingredient("Salmone",Measurement.GRAMS,206.8,IngredientCategory.SEAFOOD);
        i12.allergies.add(Allergy.FISH);
        Ingredient i13=new Ingredient("Tonno in scatola",Measurement.GRAMS,190.9,IngredientCategory.SEAFOOD);
        i13.allergies.add(Allergy.FISH);
        Ingredient i14=new Ingredient("Mozzarella di Bufala",Measurement.GRAMS,280.0,IngredientCategory.DAIRY);
        i14.allergies.add(Allergy.DAIRY);
        Ingredient i15=new Ingredient("Parmigiano",Measurement.GRAMS,431.0,IngredientCategory.DAIRY);
        i15.allergies.add(Allergy.DAIRY);
        Ingredient i16=new Ingredient("Burro",Measurement.GRAMS,717.8,IngredientCategory.DAIRY);
        i16.allergies.add(Allergy.DAIRY);
        Ingredient i17=new Ingredient("Pecorino",Measurement.GRAMS,300.0,IngredientCategory.DAIRY);
        i17.allergies.add(Allergy.DAIRY);
        Ingredient i18=new Ingredient("Stracchino",Measurement.GRAMS,240.0,IngredientCategory.DAIRY);
        i18.allergies.add(Allergy.DAIRY);
        Ingredient i19=new Ingredient("Scuacquerone",Measurement.GRAMS,209.0,IngredientCategory.DAIRY);
        i19.allergies.add(Allergy.DAIRY);
        Ingredient i20=new Ingredient("Yogurt greco",Measurement.GRAMS,97.8,IngredientCategory.DAIRY);
        i20.allergies.add(Allergy.DAIRY);
        Ingredient i21=new Ingredient("Latte",Measurement.LITERS,61.2,IngredientCategory.DRINK);
        i21.allergies.add(Allergy.DAIRY);
        Ingredient i22=new Ingredient("Passata di pomodoro",Measurement.LITERS,100.8,IngredientCategory.VEGETABLE);
        i22.allergies.add(Allergy.NICKEL);
        Ingredient i23=new Ingredient("Funghi",Measurement.GRAMS,30.5,IngredientCategory.VEGETABLE);
        Ingredient i24=new Ingredient("Finocchio",Measurement.GRAMS,25.8,IngredientCategory.VEGETABLE);
        Ingredient i25=new Ingredient("Arance",Measurement.GRAMS,35.9,IngredientCategory.FRUIT);
        Ingredient i26=new Ingredient("Melanzana",Measurement.GRAMS,27.9,IngredientCategory.VEGETABLE);
        Ingredient i27=new Ingredient("Peperoni",Measurement.GRAMS,37.0,IngredientCategory.VEGETABLE);
        Ingredient i28=new Ingredient("Aglio",Measurement.CLOVE,15.0,IngredientCategory.VEGETABLE);
        Ingredient i29=new Ingredient("Piadina",Measurement.GRAMS,265.7,IngredientCategory.GRAINS_AND_CEREAL);
        i29.allergies.add(Allergy.GLUTEN);
        i29.allergies.add(Allergy.DAIRY);
        Ingredient i30=new Ingredient("Pane",Measurement.KILOGRAMS,330.0,IngredientCategory.GRAINS_AND_CEREAL);
        i30.allergies.add(Allergy.GLUTEN);
        Ingredient i31=new Ingredient("Semola",Measurement.GRAMS,200.0,IngredientCategory.GRAINS_AND_CEREAL);
        i31.allergies.add(Allergy.GLUTEN);
        Ingredient i32=new Ingredient("Lievito per dolci",Measurement.TEASPOON,30.0,IngredientCategory.GRAINS_AND_CEREAL);
        i32.allergies.add(Allergy.GLUTEN);
        Ingredient i33=new Ingredient("Pasta sfoglia",Measurement.GRAMS,254.0,IngredientCategory.GRAINS_AND_CEREAL);
        i33.allergies.add(Allergy.GLUTEN);
        i33.allergies.add(Allergy.DAIRY);
        i33.allergies.add(Allergy.EGGS);
        Ingredient i34=new Ingredient("Aceto",Measurement.TABLESPOON,34.0,IngredientCategory.SEASONINGS);
        i34.allergies.add(Allergy.SOLFITES);
        Ingredient i35=new Ingredient("Aceto balsamico",Measurement.TABLESPOON,29.8,IngredientCategory.SEASONINGS);
        i35.allergies.add(Allergy.SOLFITES);
        Ingredient i36=new Ingredient("Zucchero",Measurement.TEASPOON,4.5,IngredientCategory.SEASONINGS);
        Ingredient i37=new Ingredient("Zucchero di canna",Measurement.TEASPOON,3.5,IngredientCategory.SEASONINGS);
        Ingredient i38=new Ingredient("Zucchero a velo",Measurement.TEASPOON,2.8,IngredientCategory.SEASONINGS);
        Ingredient i39=new Ingredient("Cacao amaro",Measurement.GRAMS,10.0,IngredientCategory.FRUIT);
        i39.allergies.add(Allergy.SOY);
        i39.allergies.add(Allergy.DAIRY);
        Ingredient i40=new Ingredient("Cannella",Measurement.TEASPOON,2.1,IngredientCategory.SEASONINGS);
        Ingredient i41=new Ingredient("Miele millefiori",Measurement.TABLESPOON,45.9,IngredientCategory.SEASONINGS);
        Ingredient i42=new Ingredient("Brodo",Measurement.LITERS,154.9,IngredientCategory.DRINK);
        Ingredient i43=new Ingredient("Castagne",Measurement.GRAMS,234.5,IngredientCategory.VEGETABLE);
        Ingredient i44=new Ingredient("Frutti di bosco",Measurement.GRAMS,145.7,IngredientCategory.FRUIT);
        Ingredient i45=new Ingredient("Mela",Measurement.GRAMS,34.6,IngredientCategory.FRUIT);
        Ingredient i46=new Ingredient("Sciroppo d'acero",Measurement.TABLESPOON,324.8,IngredientCategory.SEASONINGS);
        Ingredient i47=new Ingredient("Marmellata",Measurement.GRAMS,156.9,IngredientCategory.SEASONINGS);
        Ingredient i48=new Ingredient("Mandorle",Measurement.GRAMS,21.9,IngredientCategory.FRUIT);
        i48.allergies.add(Allergy.NUTS);
        Ingredient i49=new Ingredient("Cioccolato",Measurement.GRAMS,540.9,IngredientCategory.OILS_AND_FATS);
        i49.allergies.add(Allergy.SOY);
        i49.allergies.add(Allergy.DAIRY);
        i49.allergies.add(Allergy.NUTS);
        Ingredient i50=new Ingredient("Menta",Measurement.GRAMS,2.1,IngredientCategory.SEASONINGS);
        Ingredient i51=new Ingredient("Gelato",Measurement.GRAMS,300.9,IngredientCategory.DAIRY);
        i51.allergies.add(Allergy.DAIRY);
        Ingredient i52=new Ingredient("Panna spray",Measurement.GRAMS,450.0,IngredientCategory.DAIRY);
        i52.allergies.add(Allergy.DAIRY);
        Ingredient i53=new Ingredient("Banana",Measurement.GRAMS,89.0,IngredientCategory.FRUIT);
        Ingredient i54=new Ingredient("Fragole",Measurement.GRAMS,32.7,IngredientCategory.FRUIT);
        Ingredient i55=new Ingredient("Limone",Measurement.CLOVE,29.0,IngredientCategory.FRUIT);
        Ingredient i56=new Ingredient("Pomodori",Measurement.GRAMS,32.8,IngredientCategory.VEGETABLE);
        i56.allergies.add(Allergy.NICKEL);
        Ingredient i57=new Ingredient("Zucchine",Measurement.GRAMS,17.0,IngredientCategory.VEGETABLE);
        Ingredient i58=new Ingredient("Patate",Measurement.GRAMS,77.8,IngredientCategory.VEGETABLE);
        Ingredient i59=new Ingredient("Insalata",Measurement.GRAMS,15.4,IngredientCategory.VEGETABLE);
        Ingredient i60=new Ingredient("Cipolla",Measurement.GRAMS,40.7,IngredientCategory.VEGETABLE);
        Ingredient i61=new Ingredient("Sale fino",Measurement.PINCH,0.0,IngredientCategory.SEASONINGS);
        Ingredient i62=new Ingredient("Pepe nero",Measurement.PINCH,251.3,IngredientCategory.SEASONINGS);
        Ingredient i63=new Ingredient("Basilico",Measurement.TO_TASTE,23.7,IngredientCategory.SEASONINGS);
        Ingredient i64=new Ingredient("Rosmarino",Measurement.TO_TASTE,131.2,IngredientCategory.SEASONINGS);
        Ingredient i65=new Ingredient("Uova",Measurement.CLOVE,143.0,IngredientCategory.EGGS);
        i64.allergies.add(Allergy.EGGS);
        Ingredient i66=new Ingredient("Olio extravergine d'oliva",Measurement.TABLESPOON,884.6,IngredientCategory.OILS_AND_FATS);
        Ingredient i67=new Ingredient("Acqua",Measurement.LITERS,0.0,IngredientCategory.DRINK);
        Ingredient i68=new Ingredient("Vino bianco",Measurement.MILLILITERS,82.4,IngredientCategory.DRINK);
        i68.allergies.add(Allergy.SOLFITES);
        List<Ingredient> lista=new ArrayList<>(List.of(i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15,i16,i17,i18,i19,i20,i21,i22,i23,i24,i25,i26,i27,i28,i29,i30,i31,i32,i33,i34,i35,i36,i37,i38,i39,i40,i41,i42,i43,i44,i45,i46,i47,i48,i49,i50,i51,i52,i53,i54,i55,i56,i57,i58,i59,i60,i61,i62,i63,i64,i65,i66,i67,i68));
        ingredientRepo.salva(lista);
        BaseRecipe r1=new TraditionalRecipe("Spaghetti alla carbonara","Un grande classico della cucina romana",10,12,2,5,Difficulty.MEDIUM,PlateCategory.FIRST_COURSE,Region.LAZIO,
            "Nata a Roma, è legata alla tradizione dei carbonai e alla semplicità degli ingredienti","Frascati Superiore");
        PreparationStep c1=new PreparationStep(1,"Taglia il guanciale a listarelle e rosolalo in padella senza grassi aggiunti.",4);
        PreparationStep c2=new PreparationStep(2, "Fai bollire gli spaghetti, sbatti i tuorli con il pecorino e un pizzico di pepe", 7);
        PreparationStep c3=new PreparationStep(3,"Appena pronta scola la pasta e unisci il composto nella padella,mescolando a fuoco spento fino ad ottenere una gustosa cremina", 5);
        PreparationStep c4=new PreparationStep(4,"Infine impiatta aggiungendo il guanciale rosolato per quel tocco di croccantezza in più",1);
        List<PreparationStep> lista1=new ArrayList<>(List.of(c1,c2,c3,c4));
        r1.steps.addAll(lista1);
        BaseRecipe r2=new TraditionalRecipe("Risotto ai funghi porcini e castagne","Un piatto cremoso e super autunnale",15,18,3,4,Difficulty.MEDIUM,PlateCategory.FIRST_COURSE,Region.LOMBARDIA,"Piatto simbolo della tradizione culinaria del nord Italia, in particolare delle zone boschive lombarde.","Chardonnay");
        PreparationStep c5=new PreparationStep(1, "Tosta il riso in padella con un filo d'olio o burro, poi sfuma con del brodo di carne o del vino bianco.",12);
        PreparationStep c6=new PreparationStep(2,"In un pentolino a parte metti a rosolare le castagne precedentemente bollite",3);
        PreparationStep c7=new PreparationStep(3,"In una padella metti i funghi tagliati e puliti con un filo d'olio e lasciali rosolare con un goccio di brodo caldo",5);
        PreparationStep c8=new PreparationStep(4,"Unisci i funghi al risotto e manteca fino ad ottenere un composto omogeneo",2);
        PreparationStep c9=new PreparationStep(5,"Impiatta infine aggiungendo in superficie le castagne",1);
        List<PreparationStep> lista2=new ArrayList<>(List.of(c5,c6,c7,c8,c9));
        r2.steps.addAll(lista2);
        BaseRecipe r3=new TraditionalRecipe("Piadina Romagnola con crudo e squacquerone","La tradizione romagnola per eccellenza",5,5,1,3,Difficulty.EASY,PlateCategory.SECOND_COURSE,Region.EMILIA_ROMAGNA,"Antico pane piatto della Romagna, storicamente riconosciuto come il pane dei poveri contadini.","Sangiovese di Romagna giovane");
        PreparationStep c10=new PreparationStep(1,"Scalda la piadina su una teglia caldissima per un paio di minuti per lato.",2);
        PreparationStep c11=new PreparationStep(2,"Farcisci all'interno con stracchino o squacquerone e prosciutto crudo, quindi chiudi a metà.",1);
        List<PreparationStep>lista3=new ArrayList<>(List.of(c10,c11));
        r3.steps.addAll(lista3);
        BaseRecipe r4=new Recipe("Salmone al forno con erbe aromatiche","Trancio di salmone saporito cotto al forno",10,15,2,4,Difficulty.HARD,PlateCategory.SECOND_COURSE);
        PreparationStep c12=new PreparationStep(1,"Disponi il trancio di salmone su una teglia e condisci con olio, sale e timo.",5);
        PreparationStep c13=new PreparationStep(2,"Inforna a 180 gradi fino a completa cottura.",15);
        PreparationStep c14=new PreparationStep(3,"Guarnisci con del limone a piacimento e un filo d'olio crudo.",2);
        List<PreparationStep> lista4=new ArrayList<>(List.of(c12,c13,c14));
        r4.steps.addAll(lista4);
        BaseRecipe r5=new Recipe("Pasta al pomodoro","Un classico della cucina italiana",5,10,4,5,Difficulty.EASY,PlateCategory.FIRST_COURSE);
        PreparationStep c15=new PreparationStep(1,"Cuoci la pasta in abbondante acqua salata",10);
        PreparationStep c16=new PreparationStep(2,"In un pentolino a parte fai soffriggere della cipolla,metà carota e una foglia di basilico con un filo d'olio:quando sentirai sfrigolare la cipolla aggiungi la passata di pomodoro e lascia cuocere fin quando non avrai ottenuto un gustoso sughetto",15);
        PreparationStep c17=new PreparationStep(3,"Unisci il composto in una padella insieme alla pasta. Poi impiatta con abbondante formaggio e una fogliolina di basilico",1);
        List<PreparationStep> lista5=new ArrayList<>(List.of(c15,c14,c16));
        r5.steps.addAll(lista5);
        BaseRecipe r6=new Recipe("Frittata di zucchine","Saporita frittata cotta in padella con zucchine fresche.",10,10,2,3,Difficulty.MEDIUM,PlateCategory.SECOND_COURSE);
        PreparationStep c18=new PreparationStep(1,"Taglia le zucchine a rondelle sottili e rosolale in padella con un filo d'olio.",7);
        PreparationStep c19=new PreparationStep(2,"Sbatti le uova con sale e formaggio grattugiato, versale sulle zucchine e cuoci ambo i lati, girando la frittata ogni 4 minuti circa.",8);
        List<PreparationStep> lista6=new ArrayList<>(List.of(c18,c19));
        r6.steps.addAll(lista6);
        BaseRecipe r7=new Recipe("Zuppa di patate e verdure","Una calda e confortevole zuppa rustica",15,30,4,4,Difficulty.HARD,PlateCategory.FIRST_COURSE);
        PreparationStep c20=new PreparationStep(1,"Pela e taglia a cubetti le patate e le verdure miste.",3);
        PreparationStep c21=new PreparationStep(2,"Metti tutto in una pentola con acqua o brodo vegetale e fai cuocere a fuoco lento fino a renderle tenere.",30);
        PreparationStep c22=new PreparationStep(3,"Taglia due fettine di pane bianco e lasciale tostare a tuo piacimento su ambo i lati per aggiungere un tocco croccante alla ricetta",3);
        PreparationStep c23=new PreparationStep(4,"Impiatta con abbondante formaggio e un filo d'olio a crudo,aggiungendo il pane tostato.",1);
        List<PreparationStep> lista7=new ArrayList<>(List.of(c20,c21,c22,c23));
        r7.steps.addAll(lista7);
        BaseRecipe r8=new QuickRecipe("Toast al formaggio","Snack caldo e filante pronto in un attimo.",2,3,1,3,Difficulty.EASY,PlateCategory.SNACK,5);
        PreparationStep c24=new PreparationStep(1,"Farcisci il pane in cassetta con prosciutto cotto e formaggio a fette.", 2);
        PreparationStep c25=new PreparationStep(2,"Metti il toast sulla piastra calda fino a doratura.",3);
        List<PreparationStep> lista8=new ArrayList<>(List.of(c24,c25));
        r8.steps.addAll(lista8);
        BaseRecipe r9=new QuickRecipe("Instalata caprese","Piatto estivo perfetto per quando hai zero voglia di accendere i fornelli",5,0,2,3,Difficulty.EASY,PlateCategory.SIDE_DISH,3);
        PreparationStep c26=new PreparationStep(1,"Taglia a fette regolari i pomodori e la mozzarella.",4);
        PreparationStep c27=new PreparationStep(2,"Alterna le fette su un piatto, guarnisci con foglie di basilico, sale e un filo d'olio d'oliva.",1);
        List<PreparationStep> lista9=new ArrayList<>(List.of(c26,c27));
        r9.steps.addAll(lista9);
        BaseRecipe r10=new Recipe("Petto di pollo con insalata","Leggero, proteico e facilissimo da preparare.",15,10,1,3,Difficulty.MEDIUM,PlateCategory.SECOND_COURSE);
        PreparationStep c28=new PreparationStep(1,"Cuoci il petto di pollo su una griglia ben calda con un pizzico di sale e rosmarino.",10);
        PreparationStep c29=new PreparationStep(2,"Servi accompagnato da un contorno di insalata mista condita con olio,limone e un goccio di aceto.",2);
        List<PreparationStep> lista10=new ArrayList<>(List.of(c28,c29));
        r10.steps.addAll(lista10);
        BaseRecipe r11=new Recipe("Pancake soffici","Deliziosi pancake dorati perfetti per la colazione.",10,5,2,5,Difficulty.EASY,PlateCategory.DESSERT);
        PreparationStep c30=new PreparationStep(1,"In una ciotola unisci farina, uova, latte e un pizzico di lievito, mescolando fino ad ottenere una pastella liscia.",7);
        PreparationStep c31=new PreparationStep(2,"Cuoci un mestolo di pastella alla volta su una padella antiaderente calda fino a doratura su entrambi i lati.",4);
        PreparationStep c32=new PreparationStep(3,"Impiatta decorandoli con frutta a piacere,sciroppo d'acero o marmellate a tuo piacimento.",1);
        List<PreparationStep> lista11=new ArrayList<>(List.of(c30,c31,c32));
        r11.steps.addAll(lista11);
        BaseRecipe r12=new TraditionalRecipe("Bruschetta rustica","Pane cafone abbrustolito con pomodorini freschi, aglio e basilico.",8,3,2,3,Difficulty.EASY,PlateCategory.APPETIZER,Region.TOSCANA,"Antico piatto povero della tradizione contadina per recuperare il pane raffermo.","Chianti giovane");
        PreparationStep c33=new PreparationStep(1,"Taglia il pane a fette e abbrustoliscilo sulla griglia o in forno.",3);
        PreparationStep c34=new PreparationStep(2,"Taglia i pomodorini e condiscili con sale,olio e basilico.",2);
        PreparationStep c35=new PreparationStep(3,"Strofina dell'aglio sulle bruschette e guarniscile con i pomodori precedentemente conditi.",3);
        List<PreparationStep> lista12=new ArrayList<>(List.of(c33,c34,c35));
        r12.steps.addAll(lista12);
        BaseRecipe r13=new QuickRecipe("Smoothie banana e cacao","Uno snack cremoso, energetico e pronto in un lampo",5,0,1,2,Difficulty.EASY,PlateCategory.DRINK,6);
        PreparationStep c36=new PreparationStep(1,"Metti nel frullatore una banana congelata, un bicchiere di latte, un cucchiaio di cacao amaro e un pizzico di cannella.",3);
        PreparationStep c37=new PreparationStep(2,"Frulla alla massima velocità fino a ottenere una consistenza liscia e cremosa, poi servi subito.",2);
        List<PreparationStep> lista13=new ArrayList<>(List.of(c36,c37));
        r13.steps.addAll(lista13);
        BaseRecipe r14=new Recipe("Torta al cioccolato","Un dolce ricco e intenso per gli amanti del vero cioccolato.",15,25,6,5,Difficulty.MEDIUM,PlateCategory.DESSERT);
        PreparationStep c38=new PreparationStep(1,"Sciogli il cioccolato fondente a bagnomaria insieme al burro.",10);
        PreparationStep c39=new PreparationStep(2,"Unisci uova, zucchero e farina, incorpora il cioccolato fuso e cuoci in forno a 180 gradi.",23);
        PreparationStep c40=new PreparationStep(3,"Decora infine la torta con dello zucchero a velo e delle scaglie di cioccolato.",2);
        List<PreparationStep> lista14=new ArrayList(List.of(c38,c39,c40));
        r14.steps.addAll(lista14);
        BaseRecipe r15=new Recipe("Limonata alla menta","Dissetante, profumata e ricca di vitamina C.",5,0,4,3,Difficulty.EASY,PlateCategory.DRINK);
        PreparationStep c41=new PreparationStep(1,"Spremi il succo dei limoni freschi e filtralo in una caraffa.",3);
        PreparationStep c42=new PreparationStep(2,"Aggiungi acqua fredda, zucchero di canna a piacere, cubetti di ghiaccio e foglioline di menta fresca.",2);
        List<PreparationStep> lista15=new ArrayList(List.of(c41,c42));
        r15.steps.addAll(lista15);
        BaseRecipe r16=new Recipe("Involtini di zucchine e formaggio","Deliziosi involtini di zucchine grigliate ripieni di formaggio fresco ed erbe.",12,5,2,3,Difficulty.MEDIUM,PlateCategory.APPETIZER);
        PreparationStep c43=new PreparationStep(1,"Taglia le zucchine a fettine sottili nel senso della lunghezza e grigliale su piastra calda.",5);
        PreparationStep c44=new PreparationStep(2,"Spalma il formaggio fresco aromatizzato con erbe su ogni fetta, arrotola per formare gli involtini e servi freddi.",7);
        List<PreparationStep> lista16=new ArrayList(List.of(c43,c44));
        r16.steps.addAll(lista16);
        BaseRecipe r17=new QuickRecipe("Coppette di yogurt e frutti di bosco","Un dessert leggero, fresco e velocissimo da comporre.",5,0,1,4,Difficulty.EASY,PlateCategory.DESSERT,5);
        PreparationStep c45=new PreparationStep(1,"Versa lo yogurt greco cremoso all'interno di una coppetta e lascia riposare in frigo per mezza giornata.",2);
        PreparationStep c46=new PreparationStep(2,"Guarnisci con una manciata di frutti di bosco freschi, un filo di miele millefiori e granella di mandorle.",3);
        List<PreparationStep> lista17=new ArrayList(List.of(c45,c46));
        r17.steps.addAll(lista17);
        BaseRecipe r18=new Recipe("Patate al forno croccanti","Patate dorate e croccanti fuori, morbide dentro, aromatizzate al rosmarino.",10,35,4,4,Difficulty.MEDIUM,PlateCategory.SIDE_DISH);
        PreparationStep c47=new PreparationStep(1,"Pela le patate, tagliale a spicchi e lasciale riposare in acqua fredda per 15 minuti, poi asciugale bene.",15);
        PreparationStep c48=new PreparationStep(2,"Condisci con olio, sale, aglio in camicia e rosmarino, quindi cuoci in forno a 200 gradi fino a doratura.",35);
        List<PreparationStep> lista18=new ArrayList(List.of(c47,c48));
        r18.steps.addAll(lista18);
        BaseRecipe r19=new TraditionalRecipe("Insalata di Finocchi e Arance","Un contorno fresco, agrumato e tipico della tradizione siciliana.",10,0,2,3,Difficulty.EASY,PlateCategory.SIDE_DISH,Region.SICILIA,"Piatto tipico invernale della cucina siciliana che unisce la freschezza del finocchio alla dolcezza delle arance rosse.","Sicilia DOC Bianco");
        PreparationStep c49=new PreparationStep(1,"Taglia i finocchi a fettine sottilissime con una mandolina e pela a vivo le arance tagliandole a spicchi.",6);
        PreparationStep c50=new PreparationStep(2,"Unisci in una ciotola, aggiungi le olive nere, un pizzico di sale, olio extravergine d'oliva,pepe e mescola delicatamente.",4);
        List<PreparationStep> lista19=new ArrayList(List.of(c49,c50));
        r19.steps.addAll(lista19);
        BaseRecipe r20=new Recipe("Verdure Miste Grigliate","Zucchine, melanzane e peperoni cotti alla griglia e conditi con un'emulsione profumata.",5,10,3,3,Difficulty.MEDIUM,PlateCategory.SIDE_DISH);
        PreparationStep c51=new PreparationStep(1,"Taglia melanzane, zucchine e peperoni a fette o listarelle regolari.",5);
        PreparationStep c52=new PreparationStep(2,"Griglia le verdure su una piastra ben calda su entrambi i lati, poi condisci con olio, sale, prezzemolo e un goccio d'aceto balsamico.",10);
        List<PreparationStep> lista20=new ArrayList(List.of(c51,c52));
        r20.steps.addAll(lista20);
        BaseRecipe r21=new Recipe("Filetto in crosta alla Wellington","Pregiato filetto di manzo avvolto in prosciutto crudo, duxelles di funghi e pasta sfoglia croccante.",45,35,4,5,Difficulty.HARD,PlateCategory.SECOND_COURSE);
        PreparationStep c53=new PreparationStep(1,"Scottare rapidamente il filetto di manzo su tutti i lati, poi lasciarlo raffreddare.",5);
        PreparationStep c54=new PreparationStep(2,"Preparare la duxelles tritando finemente i funghi e facendoli cuocere finché tutta l'acqua sarà evaporata.",20);
        PreparationStep c55=new PreparationStep(3,"Avvolgere la carne con prosciutto crudo e la duxelles, chiudere ermeticamente nella pasta sfoglia e cuocere in forno a 200 gradi.",33);
        PreparationStep c56=new PreparationStep(4,"Impiattare il filetto aggiungengo una manciata di rosmarino.",2);
        List<PreparationStep> lista21=new ArrayList(List.of(c53,c54,c55,c56));
        r21.steps.addAll(lista21);
        BaseRecipe r22=new Recipe("Soufflé al Formaggio","Un capolavoro di leggerezza e tecnica della cucina francese, soffice e dorato.",30,25,3,3,Difficulty.HARD,PlateCategory.APPETIZER);
        PreparationStep c57=new PreparationStep(1,"Prepara una base di roux denso con burro e farina, aggiungendo latte caldo e incorporando con tuorli e formaggio grattugiato.",15);
        PreparationStep c58=new PreparationStep(2,"Monta gli albumi a neve fermissima e incorporali delicatamente dal basso verso l'alto senza smontarli.",10);
        PreparationStep c59=new PreparationStep(3,"Imburra e infarina gli stampini, riempirli per tre quarti e cuoci in forno statico a 190 gradi senza mai aprire lo sportello.",23);
        PreparationStep c60=new PreparationStep(4,"Infine estrai i soufflè dai pirottini e servi con la salsa roux.",2);
        List<PreparationStep> lista22=new ArrayList(List.of(c57,c58,c59,c60));
        r22.steps.addAll(lista22);
        BaseRecipe r23=new TraditionalRecipe("Chitarrina alla teramana","Primo piatto tradizionale abruzzese con pasta alla chitarra e minuscole polpettine di carne.",70,40,4,5,Difficulty.MEDIUM,PlateCategory.FIRST_COURSE,Region.ABRUZZO,"Nato nelle cucine contadine abruzzesi, prende il nome dall'attrezzo di legno e fili di ferro (la chitarra) usato per tagliare la sfoglia.","Montepulciano d'Abruzzo DOC");
        PreparationStep c61=new PreparationStep(1,"Prepara un impasto di semola e uova, stendi la sfoglia e tagliala usando la chitarra per ottenere i caratteristici maccheroni quadrati.",35);
        PreparationStep c62=new PreparationStep(2,"Forma centinaia di piccolissime polpettine (pallottine) con carne macinata, sale e un tocco di formaggio.",25);
        PreparationStep c63=new PreparationStep(3,"Fai soffriggere della cipolla con mezza carota e una foglia di basilico,poi versa la passata di pomodoro. Quindi cuoci il sugo aggiungendo le pallottine.",40);
        PreparationStep c64=new PreparationStep(4,"Far bollire la pasta e unire il tutto con il sugo precedentemente preparato.",10);
        List<PreparationStep> lista23=new ArrayList(List.of(c61,c62,c63,c64));
        r23.steps.addAll(lista23);
        BaseRecipe r24=new TraditionalRecipe("Torta di Mele della nonna","Sofficissima torta casalinga ricca di fette di mele fresche e un tocco di cannella.",20,40,8,5,Difficulty.MEDIUM,PlateCategory.DESSERT,Region.LOMBARDIA,"Il dolce casalingo per eccellenza, tramandato di generazione in generazione in ogni famiglia italiana.","Moscato d'Asti");
        PreparationStep c65=new PreparationStep(1,"Montare le uova con lo zucchero fino a renderle spumose, poi unire burro fuso, farina, latte e lievito.",12);
        PreparationStep c66=new PreparationStep(2,"Sbucciare e tagliare le mele a fettine, incorporandone metà nell'impasto e disponendo il resto a raggiera sulla superficie.",8);
        PreparationStep c67=new PreparationStep(3,"Spolverare con un cucchiaio di zucchero di canna e cuocere in forno statico a 180 gradi per 40 minuti.",39);
        PreparationStep c68=new PreparationStep(4,"Servire la torta con del gelato alla vaniglia o della panna spray a proprio piacimento.",1);
        List<PreparationStep> lista24=new ArrayList(List.of(c65,c66,c67,c68));
        r24.steps.addAll(lista24);
        BaseRecipe r25=new TraditionalRecipe("Parmigiana di Melanzane","Strati golosi di melanzane, salsa di pomodoro, mozzarella e Parmigiano gratinati al forno.",30,40,6,5,Difficulty.MEDIUM,PlateCategory.SECOND_COURSE,Region.CAMPANIA,"Piatto simbolo della cucina campana e mediterranea, famoso in tutto il mondo per la sua ricchezza di sapori.","Aglianico del Vulture o Chianti Classico");
        PreparationStep c69=new PreparationStep(1,"Tagliare le melanzane a fette, spurgarle con il sale se necessario, e friggerle o grigliarle fino a doratura.",25);
        PreparationStep c70=new PreparationStep(2,"Preparare un ricco sughetto di pomodoro fresco con aglio e basilico.",20);
        PreparationStep c71=new PreparationStep(3,"Assemblare la parmigiana in una teglia alternando strati di melanzane, salsa, mozzarella filante e abbondante Parmigiano, poi infornare.",40);
        List<PreparationStep> lista25=new ArrayList(List.of(c69,c70,c71));
        r25.steps.addAll(lista25);
        List<BaseRecipe> ricettario=new ArrayList(List.of(r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13,r14,r15,r16,r17,r18,r19,r20,r21,r22,r23,r24,r25));
        recipeRepo.salva(ricettario);









    }

}
