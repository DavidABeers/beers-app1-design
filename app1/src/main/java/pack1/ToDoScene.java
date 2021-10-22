package pack1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ToDoScene {

    public void start() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("todolists.fxml"));
        Stage stage = new Stage();
        /*
        To display a GUI, you must attach it to a Scene, then attach the
        Scene to the Stage.
        */
        Scene scene = new Scene(root);
        stage.setScene(scene);

        stage.setTitle("Enhanced Tip Calculator"); // Displayed in window's title bar
        stage.show(); // Display the stage
    }

    /**
     *
     * @param args
     */

}
