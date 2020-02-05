/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oef9;

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
public class FXML9Controller implements Initializable {

    @FXML
    private TextField txtIngave;
    @FXML
    private Button btnOmzetten;
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
    private void Clicked_Omzetten(MouseEvent event) {

        char cLetter = '0';
        int iGetal = 0;
        
        System.out.println("Geef een romeins getal in: ");
        cLetter =(txtIngave.getText()).charAt(0);
        
        switch (cLetter)
        {
             case 'I':
                 int iGetal0 = 1;
                 break;
             case 'V':
                 iGetal = 5;
                 break;
             case 'X':
                 iGetal = 10;
                 break;
             case 'L':
                 iGetal = 50;
                 break;
             case 'C':
                 iGetal = 100;
                 break;
             case 'D':
                 iGetal = 500;
                 break;
             case 'M':
                 iGetal = 1000;
                 break;
             default: 
                 iGetal = -1;
                 break;
          }
        
        lblResultaat.setText("Het Romeins getal " + cLetter + " komt overeen met het getal "+ iGetal);
    

    }
    
}
