package com.printeretiquetas.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;

import com.printeretiquetas.Main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

@Controller
public class MainController implements Initializable{
	
	private ConfigurableApplicationContext springContext;
	private Parent rootNode;
	
	@FXML
	private void  handleButtonAction(ActionEvent event) {
		System.out.println("you cliked me, cunt");
	}

	@FXML 
	private void openPrinterFormAction() throws IOException {		
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/PrinterForm.fxml"));
		fxmlLoader.setControllerFactory(springContext::getBean);
		rootNode = fxmlLoader.load();
		Stage stage = new Stage();
		stage.setScene(new Scene(rootNode));
		stage.show();
	}
	
	@FXML
	public void initialize() {
		// método ignorado
		System.out.println("inicializando form");
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		System.out.println("inicializando o form com parametros");
		System.out.println("location " + location.toString());
		// System.out.println("resources " + resources.toString());
	}
	
	
}
