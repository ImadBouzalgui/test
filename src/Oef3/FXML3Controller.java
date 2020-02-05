/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oef3;

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
public class FXML3Controller implements Initializable {

    @FXML
    private Label lblResultaat;
    @FXML
    private Button btnBerekenen;
    @FXML
    private TextField txtGetal1;
    @FXML
    private TextField txtGetal2;
    @FXML
    private TextField txtGetal3;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void clicked_Berekenen(MouseEvent event) {

        int iGetal1, iGetal2, iGetal3, iGrootste;

        try {
            iGetal1 = Integer.parseInt(txtGetal1.getText());
            iGetal2 = Integer.parseInt(txtGetal2.getText());
            iGetal3 = Integer.parseInt(txtGetal3.getText());

            if (iGetal1 > iGetal2) {
                iGrootste = iGetal1;
            } else {
                iGrootste = iGetal2;
            }

            if (iGrootste > iGetal3) {
                iGrootste = iGrootste;
            } else {
                iGrootste = iGetal3;
            }

            lblResultaat.setText("het grootste getal is: " + iGrootste);
        }
        catch (NumberFormatException ex)
        {
            lblResultaat.setText("geen correcte ingave");
        }

    }

}
