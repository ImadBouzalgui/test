/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oef2;

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
public class FXML2Controller implements Initializable {

    @FXML
    private Label lblResultaat;
    @FXML
    private TextField txtGetal1;
    @FXML
    private TextField txtGetal2;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void Clicked_Berekenen(MouseEvent event) {
        int iGetal1, iGetal2;
        double fGetal1, fGetal2;
        boolean xOK=false;

        try {
            iGetal1 = Integer.parseInt(txtGetal1.getText());
            iGetal2 = Integer.parseInt(txtGetal2.getText());

            if (iGetal1 == iGetal2 )
            {
                lblResultaat.setText( "de ingegeven getallen zijn dezelfde");
            }
            else
            {
                lblResultaat.setText( "de ingegeven getallen zijn verschillend");
            }
        }
        catch (Exception ex)
        {
            lblResultaat.setText("geen correcte ingave");
        }

    }
}
