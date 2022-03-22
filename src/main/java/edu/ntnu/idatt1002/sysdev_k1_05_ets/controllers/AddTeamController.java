package edu.ntnu.idatt1002.sysdev_k1_05_ets.controllers;
import edu.ntnu.idatt1002.sysdev_k1_05_ets.MainApplication;
import edu.ntnu.idatt1002.sysdev_k1_05_ets.tournament.Team;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddTeamController {
    ArrayList<Team> allTeams = new ArrayList<>();

    private Scene scene;
    private Parent root;
    private Stage stage;

    @FXML
    TextField teamNameField;

    @FXML
    TextArea playersNameField;

    @FXML
    Label warningLabel;


    @FXML
    public void setMainScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(MainApplication.class.getResource("eight_team_bracket.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void addTeam(ActionEvent actionEvent){
        if (teamNameField.getText().strip().equals("")){
            warningLabel.setText("Invalid team name.");
        }

        else {
            warningLabel.setText("");
            if (playersNameField.getText().isBlank()){
                allTeams.add(new Team(teamNameField.getText()));
                teamNameField.setText("");
            } else {
                String[] players = playersNameField.getText().split("\n");
                List<String> returnList = Arrays.asList(players);
                ArrayList<String> returnListFinal = new ArrayList<String>();
                returnListFinal.addAll(returnList);
                allTeams.add(new Team(returnListFinal, teamNameField.getText()));
                System.out.println(teamNameField.getText());
                for (String string : players){
                    System.out.println(string);
                }
                playersNameField.setText("");
                teamNameField.setText("");

            }

        }

    }

    public void openMainScene(ActionEvent actionEvent) {
        Stage primaryStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
    }
}