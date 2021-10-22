package pack1;

public class Application {
    public static void main(String[] args) {
        ToDoScene tds = new ToDoScene();
        try {
            tds.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
