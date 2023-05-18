import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

// for the login validation
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class LoginController {

    @FXML
    TextField mytextfield;
    @FXML
    PasswordField mypasswordfield;
    @FXML
    Button mybutton;
    public void login(ActionEvent event) throws IOException {
        
        // get textfield input
        String username = mytextfield.getText();
        
        // get password input
        String password = mypasswordfield.getText();

        // if username and password matches
        if (username.equals("_myc1111") && password.equals("maycee")){
            
            // load Scene.fxml
            Parent root = FXMLLoader.load(getClass().getResource("Scene.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        
        }

    }
}
