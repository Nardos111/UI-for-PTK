package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class AddProjectController {

    public TextField projectName;
    public TextField projectDescription;
    public ColorPicker projectColor;
    private Project project;
    private Stage stage;
    private Controller controller;


    public void displayController(Controller controller) throws IOException {
        this.controller = controller;
        stage = new Stage();
     Parent root = FXMLLoader.load(getClass().getResource("addProject.fxml"));
     stage.setScene(new Scene(root, 950, 650));
     stage.setResizable(false);
     stage.initModality(Modality.APPLICATION_MODAL);
     stage.showAndWait();

    }

    public void addHandler(ActionEvent actionEvent) {
        project = new Project(projectName.getText(), projectDescription.getText(), projectColor.getValue());
        controller.setProject(project);
        ((Stage)((Button)actionEvent.getSource()).getScene().getWindow()).close();


    }
}
