/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * FXML Controller class
 *
 * @author vando
 */
public class FXML1Controller implements Initializable {

    @FXML
    private TextField txtGetal;
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
        short iGetal, iResultaat;

        try {
            iGetal = Short.parseShort(txtGetal.getText());

            if (iGetal < 0) {
                iResultaat = (short) (iGetal * -1);
            } else {
                iResultaat = iGetal;
            }

            lblResultaat.setText(String.valueOf(iResultaat));
        }
        catch (NumberFormatException ex)
        {
            lblResultaat.setText("Geef gehele cijfers in ipv tekst of kommagetallen");
        }

    }
    
}
