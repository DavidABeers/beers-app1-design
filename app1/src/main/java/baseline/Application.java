package pack1;

import javafx.stage.Stage;

public class Application {
    public static void main(String[] args) {
        ToDoScene tds = new ToDoScene();
        Stage stage = new Stage();
        try {
            tds.start(stage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
