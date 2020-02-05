/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oef4;

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
public class FXML4Controller implements Initializable {

    @FXML
    private TextField txtGetal;
    @FXML
    private Button btnBerekenen;
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
        
        int iGetal;

        try {
            iGetal = Integer.parseInt(txtGetal.getText());

            if (iGetal % 2 == 0) {
                lblResultaat.setText(iGetal + " is even");
            } else {
                lblResultaat.setText(iGetal + " is oneven");
            }
        }
        catch (NumberFormatException ex)
        {
            lblResultaat.setText("geen correcte input. Deze moet een geheel getal zijn");
        }
    }
    
}
