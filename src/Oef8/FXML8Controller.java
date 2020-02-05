/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oef8;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author vando
 */
public class FXML8Controller implements Initializable {

    @FXML
    private TextField txtLeeftijd;
    @FXML
    private Button btnBereken;
    @FXML
    private Label lblResultaat;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void Clicked_berekenen(MouseEvent event) {

        float fTeBetalen;
        byte bLeeftijd = 0;
        byte bKortingsPercentage = 0;
        String sResultaat= "";


        try {

            bLeeftijd = Byte.parseByte(txtLeeftijd.getText());

            if (bLeeftijd < 11) {
                fTeBetalen = 1;
                //kortingsPercentage=0;
                sResultaat = "je bent " + bLeeftijd + " jaar en je betaalt " + fTeBetalen;
            } else {
                fTeBetalen = 3;

                if (bLeeftijd < 15) {
                    bKortingsPercentage = 15;
                } else if (bLeeftijd < 18) {
                    bKortingsPercentage = 10;
                } else if (bLeeftijd < 21) {
                    bKortingsPercentage = 5;
                } else {
                    bKortingsPercentage = 0;
                }
                fTeBetalen -= (fTeBetalen * bKortingsPercentage / 100);


                sResultaat = ("Je bent " + bLeeftijd + " jaar je krijgt " + bKortingsPercentage + "% korting dus je betaalt nog " + fTeBetalen + "€");
            }


        } catch (NumberFormatException ex) {
            sResultaat = ("je hebt geen getal als leeftijd ingegeven");
        }
        finally {
            lblResultaat.setText(sResultaat);
        }
    }


}
