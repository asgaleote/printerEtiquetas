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

@Controller
public class PrinterController implements Initializable{
	
	private ConfigurableApplicationContext springContext;
	private Parent rootNode;
	
	@FXML
	private void  printTags(ActionEvent event) {
		System.out.println("acionou botão de impressao");
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
