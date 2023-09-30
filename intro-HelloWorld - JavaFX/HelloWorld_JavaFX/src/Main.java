import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }
    public void start(Stage stage) throws Exception{
        StackPane layout = new StackPane();

        Button button = new Button("Hello WOrld");

        button.setOnAction(actionEvent -> {
            System.out.println(System.getProperty("Java.version"));
        });

        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 300);
        stage.setScene(scene);
        stage.setTitle("JavaFX21");
        stage.show();
    }
}