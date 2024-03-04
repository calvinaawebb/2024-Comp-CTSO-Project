import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

// Main information class
class Main {
    String name;
    String organizationType;
    String resources;
    String contactInfo;

    // Constructor, getters and setters
    public Main(String name, String organizationType, String resources, String contactInfo) {
        this.name = name;
        this.organizationType = organizationType;
        this.resources = resources;
        this.contactInfo = contactInfo;
     }

    @Override
    public String toString() {
        // This will determine how each Main is displayed in the ListView
        return String.format("%s - %s", name, organizationType);
    }
}
