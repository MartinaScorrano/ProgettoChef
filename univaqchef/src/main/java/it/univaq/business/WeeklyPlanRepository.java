package it.univaq.business;
import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import it.univaq.model.WeeklyPlan;

public class WeeklyPlanRepository extends DataModelSalvabile<WeeklyPlan>{
    private final ObjectMapper objectMapper;
public WeeklyPlanRepository(){
    this.objectMapper=new ObjectMapper();
}
    @Override 
    public boolean salva(WeeklyPlan weeklyPlan){
        if(weeklyPlan==null){
            log("Errore:impossibile salvare un piano settimanale inesistente");
            return false;
        }
        log("Salvataggio in corso del piano settimanale "+weeklyPlan.getStartDate());
        String nomeFile = weeklyPlan.getStartDate().toLowerCase().replaceAll("\\s+", "_") + ".json";
        File fileOutput = new File(nomeFile);
        try {
            // Scrittura dell'oggetto Java su file JSON tramite Jackson
            objectMapper.writeValue(fileOutput, weeklyPlan);
            log("Piano settimanale salvato con successo nel file: " + fileOutput.getName());
            return true;

        } catch (IOException e) {
            log("Errore durante il salvataggio su file: " + e.getMessage());
            return false;
        }
    }
}
