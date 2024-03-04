import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class app extends Application {
    private final List<Main> mains = new ArrayList<>();

    @Override
    public void start(Stage primaryStage) {
        initMains(); // Initialize mains with dummy data

        ObservableList<Main> mainItems = FXCollections.observableArrayList(mains);
        ListView<Main> listView = new ListView<>(mainItems);

        VBox vBox = new VBox(listView);
        Scene scene = new Scene(vBox, 300, 250);

        primaryStage.setTitle("CTE Mains Application");
        primaryStage.show();
        primaryStage.setScene(scene);
    }

    private void initMains() {
        // Initialize with some dummy mains - replace with actual data
        for (int i = 0; i < 25; i++) {
            mains.add(new Main("Main " + i, "Type " + i, "Resource " + i, "Contact " + i));
        }
    }

    public static void main(String[] args) {
        launch(args); // Launch the JavaFX application
    }
}
