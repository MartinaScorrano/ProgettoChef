package it.univaq.model;

public class WeeklyPlan implements Exportable {
    private LocalDate startDate;
    private final Map<DayOfWeek, Map<Meal, List<BaseRecipe>>> plan;

    public WeeklyPlan(LocalDate startDate) {
        if (startDate == null) {
            throw new IllegalArgumentsException("Data di inizio non valida.")
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
}
