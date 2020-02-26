package sample;
import javafx.fxml.Initializable;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable{

    public void setProject(Project project) {
        this.project = project;
    }

    private Project project;

    public void initialize(URL location, ResourceBundle resources){

    }
    public void addProjectHandler() throws IOException {
        AddProjectController addPC = new AddProjectController();
        System.out.println("WAs here");
        addPC.displayController(this);
        System.out.println("Got here");




    }
}
