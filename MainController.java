package com.example.weatherapp.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
    @FXML
    private TextField cityInput;
    @FXML
    private Button getWeatherButton;
    @FXML
    private Label weatherOutput;

    @FXML
    protected void onGetWeatherClicked() {
        weatherOutput.setText("Fetching weather for: " + cityInput.getText());
    }
}
