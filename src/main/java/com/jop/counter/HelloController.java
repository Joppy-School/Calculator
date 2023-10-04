package com.jop.counter;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {


    @FXML
    private TextField Result;
    @FXML
    private TextField numOne;
    @FXML
    private TextField numTwo;
    @FXML
    private Button Plus;
    @FXML
    private Button Minus;

    @FXML
    protected void Plus() {
        String numOneText = numOne.getText().toLowerCase();
        String numTwoText = numTwo.getText().toLowerCase();
        try{
            int v = (int)(Integer.parseInt(numOneText));
            int v1 = (int)(Integer.parseInt(numTwoText));
            Result.setText((v + v1) + " ");
        }catch (Exception e){
            Result.setText("Not Number");
        }
    }

    @FXML
    protected void Minus() {
        String numOneText = numOne.getText().toLowerCase();
        String numTwoText = numTwo.getText().toLowerCase();
        try{
            int v = (int)(Integer.parseInt(numOneText));
            int v1 = (int)(Integer.parseInt(numTwoText));
            Result.setText((v - v1) + " ");
        }catch (Exception e){
            Result.setText("Not Number");
        }
    }
 }