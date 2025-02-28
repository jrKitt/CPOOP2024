package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/demo/hello-view.fxml"));
        Scene scene = new Scene(loader.load(), 500, 300);

        HelloController controller = loader.getController();
        controller.setStage(stage);

        Map<String, User> userMap = new HashMap<>();
        controller.setUserMap(userMap);

        stage.setTitle("Eieieieieie");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
