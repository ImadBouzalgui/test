/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oef5;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author vando
 */
public class FXML5Controller implements Initializable {

    @FXML
    private Label lblResultaat;
    @FXML
    private ComboBox cmbSelectie;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

        cmbSelectie.getItems().addAll("int 1x = 10", "int w = 10", "float x = 10.0f", "string x = \"10\"");
    }

    @FXML
    private void Clicked_oplossing(MouseEvent event) {

        String sAntwoord;
        
/*
        //met textarea
        sAntwoord = txtIngave.getSelectedText();

        //if (String.valueOf(cmbSelectie.getValue()).equals("null") || txtIngave.getSelectedText().equals("")) {
         if ( txtIngave.getSelectedText().equals("")) {
            lblResultaat.setText("je hebt niets geselecteerd");
        } else {
            switch (sAntwoord) {
                case "int 1x = 10":
                    lblResultaat.setText("foutief");
                    break;
                case "int w = 10":
                    lblResultaat.setText("correct");
                    break;
                case "float x = 10.0f":
                    lblResultaat.setText("foutief");
                    break;
                case "string x = \"10\"":
                    lblResultaat.setText("foutief");
                    break;
                default:
                    System.out.println("niet ingegeven!");
            }
            */


            //met combobox
             sAntwoord = String.valueOf(cmbSelectie.getValue());

         if ( String.valueOf(cmbSelectie.getValue()).equals("null")) {
            lblResultaat.setText("je hebt niets geselecteerd");
        } else {
            switch (sAntwoord) {
                case "int 1x = 10":
                    lblResultaat.setText("foutief");
                    break;
                case "int w = 10":
                    lblResultaat.setText("correct");
                    break;
                case "float x = 10.0f":
                    lblResultaat.setText("foutief");
                    break;
                case "string x = \"10\"":
                    lblResultaat.setText("foutief");
                    break;
                default:
                    System.out.println("niet ingegeven!");
            }

        }
    }

}
