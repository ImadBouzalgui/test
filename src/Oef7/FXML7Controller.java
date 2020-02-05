/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oef7;

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
public class FXML7Controller implements Initializable {

    @FXML
    private TextField txtMaand;
    @FXML
    private TextField txtJaar;
    @FXML
    private Label lblResultaat;
    @FXML
    private Button btnBerekenen;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    byte bMaand;
    short bJaar;
    byte bAantaldagen;

    @FXML
    private void Clicked_Berekenen(MouseEvent event) {

        try {
            bMaand = Byte.parseByte(txtMaand.getText());
            bJaar = Short.parseShort(txtJaar.getText());


            bAantaldagen = 0;

            switch (bMaand) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    bAantaldagen = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    bAantaldagen = 30;
                    break;
                case 2:
                    if (((bJaar % 4 == 0) && !(bJaar % 100 == 0)) || (bJaar % 400 == 0)) {
                        bAantaldagen = 29;
                    } else {
                        bAantaldagen = 28;
                    }
                    break;
                default:
                    lblResultaat.setText("ongeldige ingave");
                    break;
            }
        } catch (Exception e) {
            lblResultaat.setText("ongeldige ingave");
            bMaand = 0;
        }

        lblResultaat.setText(lblResultaat.getText().equals("ongeldige ingave") ?"ongeldige ingave":"aantal dagen in de maand: "+bAantaldagen);
}

}
