package com.example.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import java.util.Map;
import java.util.TreeMap;

public class ListUserControl {

    @FXML
    private TableView<User> userTable;

    @FXML
    private TableColumn<User, String> nameColumn;

    @FXML
    private TableColumn<User, String> emailColumn;

    @FXML
    private Label userlabel;

    private Stage stage;
    private TreeMap<String, User> userdata = new TreeMap<>();
    private ObservableList<User> userList = FXCollections.observableArrayList();

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setUserMap(Map<String, User> userdata) {
        this.userdata = new TreeMap<>(userdata);
        userList.setAll(this.userdata.values());
        userTable.setItems(userList);
    }

    @FXML
    public void initialize() {
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));

        userTable.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            if (newSelection != null) {
                userlabel.setText("User Name " + newSelection.getName() + " "  + "Email " + newSelection.getEmail()  );
            }
        });
    }

    @FXML
    private void handleReturn() {
        Stage currentStage = (Stage) userTable.getScene().getWindow();
        currentStage.close();
    }
}
