package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class HelloController {

    @FXML
    private TextField nameField;

    @FXML
    private TextField emailField;

    @FXML
    private Button firstEntryButton;

    @FXML
    private Button prevEntryButton;

    @FXML
    private Button nextEntryButton;

    @FXML
    private Button lastEntryButton;

    private Stage stage;
    private TreeMap<String, User> userdata = new TreeMap<>();
    private Map.Entry<String, User> currentEntry;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setUserMap(Map<String, User> userdata) {
        this.userdata = new TreeMap<>(userdata);
        if (!this.userdata.isEmpty()) {
            currentEntry = this.userdata.firstEntry();
            updateFields();
        }
    }

    @FXML
    public void handleSubmit(ActionEvent event) {
        String name = nameField.getText();
        String email = emailField.getText();

        if (!name.isEmpty() && !email.isEmpty()) {
            User user = new User(name, email);
            userdata.put(email, user);
            currentEntry = userdata.floorEntry(email);
            updateFields();

            nameField.clear();
            emailField.clear();
        }
    }

    @FXML
    private void firstEntry() {
        if (!userdata.isEmpty()) {
            currentEntry = userdata.firstEntry();
            updateFields();
        }
    }

    @FXML
    private void lowerEntry() {
        if (currentEntry != null) {
            Map.Entry<String, User> prevEntry = userdata.lowerEntry(currentEntry.getKey());
            if (prevEntry != null) {
                currentEntry = prevEntry;
                updateFields();
            }
        }
    }

    @FXML
    private void higherEntry() {
        if (currentEntry != null) {
            Map.Entry<String, User> nextEntry = userdata.higherEntry(currentEntry.getKey());
            if (nextEntry != null) {
                currentEntry = nextEntry;
                updateFields();
            }
        }
    }

    @FXML
    private void lastEntry() {
        if (!userdata.isEmpty()) {
            currentEntry = userdata.lastEntry();
            updateFields();
        }
    }

    private void updateFields() {
        if (currentEntry != null) {
            nameField.setText(currentEntry.getValue().getName());
            emailField.setText(currentEntry.getValue().getEmail());
        }
    }

    @FXML
    private void listUser(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/demo/list.fxml"));
        Parent root = loader.load();

        ListUserControl controller = loader.getController();
        controller.setStage(stage);
        controller.setUserMap(userdata);

        Scene listScene = new Scene(root, 500, 300);
        Stage secondStage = new Stage();
        secondStage.setScene(listScene);
        secondStage.setTitle("User List");
        secondStage.show();
    }
}
