/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oef10;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author vando
 */
public class FXML10Controller implements Initializable {

    @FXML
    private CheckBox chkOmtrek;
    @FXML
    private CheckBox chkOpp;
    @FXML
    private ComboBox cmbFiguur;
    @FXML
    private Button btnBerekenen;
    @FXML
    private Pane pnlPanel;
    @FXML
    private Label lblWaarde1;
    @FXML
    private Label lblWaarde2;
    @FXML
    private Label lblWaarde3;
    @FXML
    private TextField txtWaarde1;
    @FXML
    private TextField txtWaarde2;
    @FXML
    private TextField txtWaarde3;
    @FXML
    private TextArea txtResultaat;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //verwijder alle items
        cmbFiguur.getItems().removeAll(cmbFiguur.getItems());
        //voeg items toe
        cmbFiguur.getItems().addAll("cirkel", "vierkant", "rechthoek");
        //selecteer het item ...
        cmbFiguur.getSelectionModel().select("cirkel");

        lblWaarde1.setText("diameter");

    }

    String sKeuzeVorm, sVorm;
    String sKeuzeBerekening, sBerekening;
    String sResultaat;

    float fOmtrek, fOpp;

    float fLengte, fBreedte, fDiameter;


    //afronden 2 cijfers na de komma
    private static DecimalFormat df2 = new DecimalFormat(".##");

    @FXML
    private void Clicked_Berekenen(MouseEvent event) {

        sKeuzeVorm = String.valueOf(cmbFiguur.getValue());
        sKeuzeBerekening = (chkOmtrek.isSelected() ? chkOmtrek.getText() : chkOpp.getText());


        switch (sKeuzeBerekening) {
            case "Omtrek":
                sBerekening = "omtrek";
                break;
            case "Oppervlakte":
                sBerekening = "opp";
                break;
            default:
                sBerekening = "Onbekend";
                break;
        }

        switch (sKeuzeVorm) {
            case "cirkel":
                sVorm = "cirkel";
                fDiameter = Float.parseFloat(txtWaarde1.getText());
                fOmtrek = (float) (2 * (fDiameter / 2) * Math.PI);
                fOpp = ((float) (Math.pow((fDiameter / 2), 2) * Math.PI));
                break;
            case "vierkant":
                sVorm = "vierkant";
                fLengte = Float.parseFloat(txtWaarde1.getText());

                fOmtrek = 4 * fLengte;
                fOpp = (float) (Math.pow(fLengte, 2));

                break;
            case "rechthoek":
                sVorm = "rechthoek";
                fLengte = Float.parseFloat(txtWaarde1.getText());
                fBreedte = Float.parseFloat(txtWaarde2.getText());

                fOmtrek = 2 * (fLengte + fBreedte);
                fOpp = fLengte * fBreedte;

                break;
            default:
                sVorm = "Onbekend";
                break;

        }

        if (!sVorm.equals("Onbekend") && !sBerekening.equals("Onbekend")) {
            txtResultaat.setText("Je hebt gekozen om de " + sBerekening + " van een " + sVorm + " te bepalen \r\n"
                    + "Je hebt hierbij gekozen voor volgende gegevens \r\n");

            switch (sVorm) {
                case "cirkel":
                    txtResultaat.setText(txtResultaat.getText() + "Diameter: " + fDiameter);
                    break;
                case "rechthoek":
                    txtResultaat.setText(txtResultaat.getText() + "Lengte: " + fLengte + "\r\n"
                            + "breedte: " + fBreedte);
                    break;
                case "vierkant":
                    txtResultaat.setText(txtResultaat.getText() + "Lengte: " + fLengte);
                    break;
                default:
            }

            switch (sBerekening) {
                case "omtrek":
                    txtResultaat.setText(txtResultaat.getText() + "\r\nDe Omtrek is: " + df2.format(fOmtrek));

                    break;
                case "opp":
                    txtResultaat.setText(txtResultaat.getText() + "\r\nDe oppervlakte is: " + df2.format(fOpp));
                    break;
            }
        } else {
            txtResultaat.setText("De opgegeven waarden zijn niet correct.\nHet was onmogelijk om de omtrek of de oppervlakte te berekenen.\n");
        }

    }

    @FXML
    private void KeuzeVorm(ActionEvent event) {

        pnlPanel.setVisible(true);

        sKeuzeVorm = String.valueOf(cmbFiguur.getValue());

        switch (sKeuzeVorm) {
            case "cirkel":
                lblWaarde1.setText("diameter");
                lblWaarde2.setVisible(false);
                lblWaarde3.setVisible(false);
                txtWaarde2.setVisible(false);
                txtWaarde3.setVisible(false);
                break;
            case "vierkant":
                lblWaarde1.setText("lengte");
                lblWaarde2.setVisible(false);
                lblWaarde3.setVisible(false);
                txtWaarde2.setVisible(false);
                txtWaarde3.setVisible(false);
                break;
            case "rechthoek":
                lblWaarde1.setText("lengte");
                lblWaarde2.setText("breedte");
                lblWaarde2.setVisible(true);
                txtWaarde2.setVisible(true);
                lblWaarde3.setVisible(false);
                txtWaarde3.setVisible(false);
                break;
            default:
                break;

        }

    }

}
