/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.InputStream;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;

/**
 *
 * @author typem
 */
public class Project extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        //Button for breakfast
        Image image = new Image(getClass().getResourceAsStream("breakfast.jpg"));
        Button btnBreakfast = new Button("Breakfast");
        btnBreakfast.setGraphic(new ImageView(image));
        //btnBreakfast.setText("Breakfast");
        btnBreakfast.setStyle("-fx-font: 22 arial; -fx-base: #b6e7c9;");
        
        //Button for Dinner
        Image image1 = new Image(getClass().getResourceAsStream("dinner.jpg"));
        Button btnDinner = new Button("Dinner");
        btnDinner.setGraphic(new ImageView(image1));
        //btnDinner.setText("Dinner");
        btnDinner.setStyle("-fx-font: 22 arial; -fx-base: #b6e7c9;");
              
        //GridePane for main screen menu
        GridPane grid = new GridPane(); //Creates our gridpane
        grid.setAlignment(Pos.CENTER); //Align everything to the center of our gridpane     
        grid.setVgap(10); // the Vertical gap between the grid rows
        
        grid.add(btnBreakfast, 1, 2);
        grid.add(btnDinner, 1, 3);
        
        Scene scene = new Scene(grid, 600, 450);
        
        primaryStage.setTitle("Menu");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        
        
        //Breakfast Button Action
        btnBreakfast.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
         GridPane grid1 = new GridPane(); //Creates our gridpane
        grid1.setAlignment(Pos.CENTER); //Align everything to the center of our gridpane
        grid1.setHgap(10); //The Horizontal gap between grid columns
        grid1.setVgap(10); // the Vertical gap between the grid rows
        
        //New scene when Breakfast button is pressed
        Scene scene1 = new Scene(grid1, 600, 450);
        
        primaryStage.setTitle("Breakfast");
        primaryStage.setScene(scene1);
        primaryStage.show();
        
        //List of menu items
         ObservableList<String> BreakfastMenu = FXCollections.observableArrayList(
                "Full Irish   $7","Fresh Fruit   $4","Porridge   $4"
        );
        
        ListView<String> listView = new ListView();
        listView.setItems(BreakfastMenu);
        grid1.add(listView, 0, 2);

            }
        });
        
        
        //Dinner Button Action
         btnDinner.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
         GridPane grid1 = new GridPane(); //Creates our gridpane
        grid1.setAlignment(Pos.CENTER); //Align everything to the center of our gridpane
        grid1.setHgap(10); //The Horizontal gap between grid columns
        grid1.setVgap(10); // the Vertical gap between the grid rows
        
        //New scene when Dinner button is pressed
        Scene scene1 = new Scene(grid1, 600, 450);
        
        primaryStage.setTitle("Dinner");
        primaryStage.setScene(scene1);
        primaryStage.show();
        
        //List of Dinner menu items
         ObservableList<String> DinnerMenu = FXCollections.observableArrayList(
                "Curry   $7","Chicken   $4","Stir Fry   $4","Soup and Roll   $3"

        );
        //Displaying the list View
        ListView<String> listView = new ListView();
        listView.setItems(DinnerMenu);
        grid1.add(listView, 0, 2);
        
        
            }
        });
          
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
