/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oef11;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author vando
 */
public class FXML11Controller implements Initializable {

        @FXML
    private Label lblResultaat;
    @FXML
    private Spinner nudMinBegin;
    @FXML
    private Spinner nudUurBegin;
    @FXML
    private Spinner nudMinDuurtijd;
    @FXML
    private Spinner nudUurDuurtijd;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

         SpinnerValueFactory<Integer> valueSpinnerUurDuurtijd = new SpinnerValueFactory.IntegerSpinnerValueFactory(0,23,10);
        this.nudUurDuurtijd.setValueFactory(valueSpinnerUurDuurtijd);
         SpinnerValueFactory<Integer> valueSpinnerMinDuurtijd = new SpinnerValueFactory.IntegerSpinnerValueFactory(0,59,10);
        this.nudMinDuurtijd.setValueFactory(valueSpinnerMinDuurtijd);
            SpinnerValueFactory<Integer> valueSpinnerUurBegin = new SpinnerValueFactory.IntegerSpinnerValueFactory(0,23,10);
        this.nudUurBegin.setValueFactory(valueSpinnerUurBegin);
         SpinnerValueFactory<Integer> valueSpinnerMinBegin = new SpinnerValueFactory.IntegerSpinnerValueFactory(0,59,10);
        this.nudMinBegin.setValueFactory(valueSpinnerMinBegin);
    }    

    int iEindMin, iEindUUr, iBeginUur, iBeginMin, iDuurUur, iDuurMin;
    
    @FXML
    private void Clicked_Berekenen(MouseEvent event) {
        iBeginUur = (int)(nudUurBegin.getValue());
        iBeginMin = (int)(nudMinBegin.getValue());
        
        iDuurUur = (int)(nudUurDuurtijd.getValue());
         iDuurMin = (int)(nudMinDuurtijd.getValue());
         
         iEindMin =( iBeginMin + iDuurMin);
         iEindUUr = (iBeginUur + iDuurUur);
         
         if (iEindMin >=60)
         {
             iEindUUr += (iEindMin/60);
             iEindMin %=60;
         }
         
         lblResultaat.setText("Eindtijd: " + iEindUUr + "U " + iEindMin + "M");
    }
    
}
