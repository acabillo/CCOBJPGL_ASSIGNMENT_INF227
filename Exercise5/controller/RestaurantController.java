package controller;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import model.*;

public class RestaurantController {

    @FXML
    ImageView img1, img2, img3, img4, img5;

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    Jabi jabi = new Jabi();
    McDonaldo mcdo = new McDonaldo();
    PaseoRizal paseo = new PaseoRizal();
    Popeyes popeyes = new Popeyes();
    WyndellsAlFresco wyndells = new WyndellsAlFresco();

    public void initialize() {

        jabi.setColor("Red");
        jabi.setBestSeller("Chicken Joy");

        mcdo.setColor("Red");
        mcdo.setBestSeller("French Fries");

        paseo.setColor("Orange");
        paseo.setBestSeller("Bulalo");

        popeyes.setColor("Orange");
        popeyes.setBestSeller("Chicken Sandwich");

        wyndells.setColor("Brown");
        wyndells.setBestSeller("Kansi Bulalo");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Jabi is " + mcdo.getColor() + " and, its best seller is " + jabi.getBestSeller());
        }

        if (sourceButton == btn2) {
            alert.setContentText("Mcdo is " + jabi.getColor() + " and its best seller is " + mcdo.getBestSeller());
        }
        if (sourceButton == btn3) {
            alert.setContentText("Paseo Rizal is " + jabi.getColor() + " and its best seller is " + paseo.getBestSeller());
        }

        if (sourceButton == btn4) {
            alert.setContentText("Popeyes is " + jabi.getColor() + " and its best seller is " + popeyes.getBestSeller());
        }

        if (sourceButton == btn5) {
            alert.setContentText("Wyndell's Al Fresco is " + jabi.getColor() + " and its best seller is " + wyndells.getBestSeller());
        }



        alert.showAndWait();

    }
}
