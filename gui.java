package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;

import javafx.scene.text.Text;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button = new Button("azazaaazaza");
        Text text = new Text(10, 20, "java sux");
        text.setFont(new Font(20));

        BorderPane pane = new BorderPane();
        pane.setCenter(button);
        pane.setTop(text);

        Scene scene = new Scene(pane, 500, 600);

        primaryStage.setTitle("CODOLOGIA");
        primaryStage.setScene(scene);
        primaryStage.show();
}
    public static void main(String[] args) {
        launch(args);
    }
}
