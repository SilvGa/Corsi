/**
 * Sample Skeleton for 'Corsi.fxml' Controller Class
 */

package it.polito.tdp.corsi;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import it.polito.tdp.corsi.model.Corso;
import it.polito.tdp.corsi.model.Model;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CorsiController {
	public Model model;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtcorsi"
    private TextField txtcorsi; // Value injected by FXMLLoader

    @FXML // fx:id="txtRis"
    private TextArea txtRis; // Value injected by FXMLLoader

    @FXML
    void onCerca(ActionEvent event) {
    	txtRis.clear();
    	
    	try {
        	int pd=Integer.parseInt(txtcorsi.getText());
        	if(pd!=1 && pd!=2) {
        		txtRis.setText("Inserire un periodo didattico (1 o 2)");
        	}
        	List<Corso> corsi=model.listaCorsiSemestre(pd);
        	for(Corso c:corsi) {
        		txtRis.appendText(c.toString()+ "\n");
        	}
    	}catch(NumberFormatException e) {
    		txtRis.setText("Inserire per periodo didattico il numero 1 o 2");
    	}
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtcorsi != null : "fx:id=\"txtcorsi\" was not injected: check your FXML file 'Corsi.fxml'.";
        assert txtRis != null : "fx:id=\"txtRis\" was not injected: check your FXML file 'Corsi.fxml'.";

    }

	public void setModel(Model model) {
		// TODO Auto-generated method stub
		this.model=model;
	}
}

