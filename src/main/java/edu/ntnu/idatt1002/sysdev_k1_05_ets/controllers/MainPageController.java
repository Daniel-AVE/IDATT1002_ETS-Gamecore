package edu.ntnu.idatt1002.sysdev_k1_05_ets.controllers;

import edu.ntnu.idatt1002.sysdev_k1_05_ets.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

import java.io.IOException;

public class MainPageController {
    @FXML
    private Menu aboutButton;

    @FXML
    private Button createNewTournamentButton;

    @FXML
    private Menu homeButton;

    @FXML
    private MenuItem ongoingTournamentsButton;

    @FXML
    private MenuItem previousTournamentsButton;

    @FXML
    private Menu profileButton;

    @FXML
    private Menu tournamentsButton;

    @FXML
    void onAboutButtonPressed(ActionEvent event) {

    }

    @FXML
    void onCreateNewTournamentButtonPressed(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(MainApplication.class.getResource("scenes/create_tournament_scene.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void onHomeButtonPressed(ActionEvent event) {

    }

    @FXML
    void onOngoingTournamentsButtonPressed(ActionEvent event) {

    }

    @FXML
    void onPreviousTournamentsButtonPressed(ActionEvent event) {

    }

    @FXML
    void onProfileButtonPressed(ActionEvent event) {

    }
}
