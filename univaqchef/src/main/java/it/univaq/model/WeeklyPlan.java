package it.univaq.model;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.time.DayOfWeek;
/**
 * Classe WeeklyPlan utilizzata per la creazione di piani settimanali
 */
public class WeeklyPlan implements Exportable {
    private final LocalDate startDate;
    private final Map<DayOfWeek, Map<Meal, List<BaseRecipe>>> plan;

    public WeeklyPlan(LocalDate startDate) {
        if (startDate == null) {
            throw new IllegalArgumentsException("Data di inizio non valida.");
        }
        this.startDate = startDate;
        this.plan = new EnumMap<>(DayOfWeek.class);
        solEmptyPlan();
    }

    private void solEmptyPlan() {
        for (DayOfWeek day : DayOfWeek.values()) {
            Map<Meal, List<BaseRecipe>> mealMap = new EnumMap<>(Meal.class);
            for (Meal meal : Meal.values()) {
                mealMap.put(meal, new ArrayList<>());
            }
            this.plan.put(day, mealMap);
        }
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
    if (startDate == null) {
        throw new IllegalArgumentsException("Data di inizio non valida.")
    }
    this.startDate = startDate;
    }

    public void addRecipe(DayOfWeek day, Meal meal, BaseRecipe recipe) {
        if (day == null || meal == null || recipe == null) {
            return;
        }
        this.plan.get(day).get(meal).add(recipe);
    }

    public boolean removeRecipe(DayOfWeek day, Meal meal, BaseRecipe recipe) {
        if (day == null || meal == null || recipe == null) {
            return false;
        }
        return this.plan.get(day).get(meal).remove(recipe);
    }

    public List<BaseRecipe> getRecipes(DayOfWeek day, Meal meal) {
        if (day == null || meal == null) {
            return new ArrayList<>();
        }
        return this.plan.get(day).get(meal);
    }

    public Map<DayOfWeek, Map<Meal, List<BaseRecipe>>> getPlan() {
        return this.plan;
    }

}
