package it.univaq.model;

public class Ingredient implements Filterable {
    private String name;
    private Measurement measure;
    private double calories;
    private IngredientCategory category;
    private Set<Allergy> allergies;

    @Override public String getName() { return name; }
    @Override public boolean equals(Object o) {
        return o instanceof Ingredient i && name =! null && name.equalsIgnoreCase(i.name);
    }
    @Override public int hashCode() { return name != null ? name.toLowerCase().hashCode(): 0; }    
}
