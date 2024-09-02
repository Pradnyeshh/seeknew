import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonEventHandlerExample extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Button Example");

        // Create a button
        Button btn = new Button();
        btn.setText("Click me!");

        // Create an event handler for the button
        EventHandler<ActionEvent> eventHandler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Button Clicked!");
            }
        };

        // Add the event handler to the button
        btn.setOnAction(eventHandler);

        // Create a layout and add the button to it
        StackPane root = new StackPane();
        root.getChildren().add(btn);

        // Create a scene and set it on the stage
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);

        // Show the stage
        primaryStage.show();
    }
}
