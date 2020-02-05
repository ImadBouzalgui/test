/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oef6;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author vando
 */
public class FXML6Controller implements Initializable {

    @FXML
    private ComboBox cmbSelectie;
    @FXML
    private Label lblResultaat;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        cmbSelectie.getItems().addAll(1, 2, 3, 4, 5, 6, 7);
    }

    @FXML
    private void ChangeSelection(ActionEvent event) {
        String sAntwoord;
        sAntwoord =String.valueOf(cmbSelectie.getValue());

        //if selectie niet nodig, aangezien het event pas uitgevoerd wordt als er iets geslecteeerd is
        if ( String.valueOf(cmbSelectie.getValue()).equals("null")) {
            lblResultaat.setText("je hebt niets geselecteerd");
        } else {
            switch (sAntwoord) {
                case "1":
                    lblResultaat.setText("Maandag");
                    break;
                case "2":
                    lblResultaat.setText("Dinsdag");
                    break;
                case "3":
                    lblResultaat.setText("Woensdag");
                    break;
                case "4":
                    lblResultaat.setText("Donderdag");
                    break;
                case "5":
                    lblResultaat.setText("Vrijdag");
                    break;
                case "6":
                    lblResultaat.setText("Zaterdag");
                    break;
                case "7":
                    lblResultaat.setText("Zondag");
                    break;
                default:
                    lblResultaat.setText("geen selectie");
                    break;
            }
        }
        System.out.println("klaar");
    }

}
