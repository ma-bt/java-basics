package org.example.javafxdemo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Complete Form Example");

        // Create a GridPane layout for the form
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.setVgap(10);
        grid.setHgap(10);

        // Add TextFields, PasswordField, RadioButton, CheckBox, ComboBox, and Button to the GridPane
        TextField nameField = new TextField();
        grid.add(new Label("Name:"), 0, 0);
        grid.add(nameField, 1, 0);

        PasswordField passwordField = new PasswordField();
        grid.add(new Label("Password:"), 0, 1);
        grid.add(passwordField, 1, 1);

        RadioButton maleRadioButton = new RadioButton("Male");
        RadioButton femaleRadioButton = new RadioButton("Female");
        ToggleGroup genderToggleGroup = new ToggleGroup();
        maleRadioButton.setToggleGroup(genderToggleGroup);
        femaleRadioButton.setToggleGroup(genderToggleGroup);
        grid.add(new Label("Gender:"), 0, 2);
        grid.add(maleRadioButton, 1, 2);
        grid.add(femaleRadioButton, 2, 2);

        CheckBox subscribeCheckBox = new CheckBox("Subscribe to Newsletter");
        grid.add(subscribeCheckBox, 1, 3);

        ComboBox<String> countryComboBox = new ComboBox<>();
        countryComboBox.getItems().addAll("Select Country", "USA", "Canada", "UK", "Australia");
        countryComboBox.setValue("Select Country");
        grid.add(new Label("Country:"), 0, 4);
        grid.add(countryComboBox, 1, 4);

        Button submitButton = new Button("Submit");
        grid.add(submitButton, 1, 5);

        // Set action for the button
        submitButton.setOnAction(e -> {
            // Perform actions when the button is clicked
            System.out.println("Name: " + nameField.getText());
            System.out.println("Password: " + passwordField.getText());
            System.out.println("Gender: " + (maleRadioButton.isSelected() ? "Male" : "Female"));
            System.out.println("Subscribe: " + (subscribeCheckBox.isSelected() ? "Yes" : "No"));
            System.out.println("Country: " + countryComboBox.getValue());
        });

        // Create a scene and set it in the stage
        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}