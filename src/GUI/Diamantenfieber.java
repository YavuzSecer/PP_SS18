package GUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import Logic.*;

/**
 *
 * @author Yavuz
 */
public class Diamantenfieber extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("DiamantenfieberFXML.fxml"));
        primaryStage.setScene(new Scene(root, 800, 600));
        // Set min Size
        primaryStage.setMinHeight(400);
        primaryStage.setMinWidth(600);

        primaryStage.show();
    }


    public static void main(String[] args) {

        launch(args);
    }
}
