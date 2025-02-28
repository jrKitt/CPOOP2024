package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class HelloController {

    @FXML
    private TextField nameField;

    @FXML
    private TextField emailField;

    private Stage stage;
    private Map<String, User> userdata = new HashMap<>();

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setUserMap(Map<String, User> userdata) {
        this.userdata = userdata;
    }

    @FXML
    public void handleSubmit(ActionEvent event) throws IOException {
        String name = nameField.getText();
        String email = emailField.getText();
        System.out.println("Submit");
        User user = new User(name, email);
        System.out.println("[ " + user.getName() + ", " + user.getEmail() + "]");
        System.out.println();
        userdata.put(email, user);
        nameField.clear();
        emailField.clear();
//        userdata.add(user);
//        handleViewList(event);

    }

    @FXML
    private void handleViewList(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/demo/list.fxml"));
        Scene listScene = new Scene(loader.load());

        ListUserControl controller = loader.getController();
        controller.setStage(stage);
        controller.setUserMap(userdata);

        stage.setScene(listScene);
        stage.show();
    }
}
