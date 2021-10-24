package baseline;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Application extends javafx.application.Application {

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("todolists.fxml"));

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);

        primaryStage.setTitle("Todo List Manager");
        primaryStage.show();
    }
}
