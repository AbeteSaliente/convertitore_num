package it.edu.iisgubbio.github;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class convertitore extends Application{
	
	Label lCon = new Label("Convertitore");
	Label lNum = new Label("Num da convertire:");
	TextField tNum = new TextField();
	Label lBase = new Label("Base di conversione:");
	TextField tBase = new TextField();
	Label lNumCon = new Label("Num convertito:");
	Label lRisu = new Label();
	Button pConverti = new Button("Converti");
	
	public void start(Stage finestra) {
		GridPane griglia = new GridPane();
		Scene scena = new Scene(griglia, 300, 180);
		finestra.setScene(scena);
		finestra.setTitle("Convertitore Num da Base x a Base y");
		finestra.show();
		
		griglia.add(lCon, 0, 0);
		griglia.add(lNum, 0, 1);
		griglia.add(tNum, 1, 1);
		griglia.add(lBase, 0, 2);
		griglia.add(tBase, 1, 2);
		griglia.add(lNumCon, 0, 3);
		griglia.add(lRisu, 1, 3);
		griglia.add(pConverti, 0, 4);
		griglia.setPadding(new Insets(10, 10, 10, 10));
		griglia.setHgap(10);
		griglia.setVgap(10);
		
		lCon.setTranslateX(100);
		pConverti.setTranslateX(100);
		
		pConverti.setOnAction(e->Converti());
	}
	
	public void Converti() {
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
