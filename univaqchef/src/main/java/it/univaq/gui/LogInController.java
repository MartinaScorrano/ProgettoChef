package it.univaq.gui;
import java.io.File;
import it.univaq.business.*;
import it.univaq.model.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import java.io.IOException;
/**
 * Classe LogInController utilizzata per la pagina iniziale del sistema.
 * Viene utilizzata dall'utente per iniziare la creazione e la personalizzazione
 * del profilo.
 */
public class LogInController {
    @FXML TextField textName;
    @FXML TextField textSurname;
private final UserProfileRepository repo=new UserProfileRepository();
@FXML
private void verifyAccess(){
    String nome=textName.getText().trim();
    String cognome=textSurname.getText().trim();

if(nome.isEmpty()||cognome.isEmpty()){
    showAlert("Attenzione: i campi 'nome' e 'cognome' sono obbligatori.Non puoi lasciarli vuoti",Alert.AlertType.WARNING);
    return;
}
try {
    UserProfile profilo=repo.carica();
    if(profilo!=null){
        if(profilo.getName().equalsIgnoreCase(nome) && profilo.getSurname().equalsIgnoreCase(cognome)){
            uploadWelcome();
        }
        else{
            showAlert("Il nome o il cognome non corrispondono ad un profilo presente. Registrati per continuare.",Alert.AlertType.ERROR);
        }
    }
    else{
            showAlert("Nessun profilo presente. Registrati per continuare.",Alert.AlertType.ERROR);
        }
} catch ( IOException e) {
    showAlert("Impossibile leggere il file del progilo:"+e.getMessage(),Alert.AlertType.ERROR);
}

}

private void showAlert(String errore,Alert.AlertType tipo){
    Alert alert=new Alert(tipo);
    alert.setHeaderText(null);
    alert.setContentText(errore);
    alert.showAndWait();
}
private void uploadWelcome(){
    try {
        Parent vista=FXMLLoader.load(getClass().getResource("/welcome.fxml"));
        textName.getScene().setRoot(vista);

        
    } catch (IOException e) {
    }
}

    
}
