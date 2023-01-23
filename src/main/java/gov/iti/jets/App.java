package gov.iti.jets;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
    private static Scene scene;
    @Override
    public void start(Stage stage) throws IOException {

    Parent root = FXMLLoader.load(getClass().getResource("resources\fileBrowsing.fxml"));
    scene = new Scene(root);
    stage.setMaximized(false);
    stage.setScene(scene);
    stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}