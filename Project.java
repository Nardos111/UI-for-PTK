package sample;


import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Project {
    private static final Color RED = Color.RED ;
    private String name;
    private String projectId;
    private Color color;
    private List<Task> taskList;

    public Project() {
        this.name = "Unnamed";
        this.projectId = "Unamed";
        this.color = RED;
        this.taskList = new ArrayList<>();
    }

    public Project(String name, String projectId, Color color) {
        this.name = name;
        this.projectId = UUID.randomUUID().toString();
        this.color = color;
        this.taskList = new ArrayList<>();
    }

    public static Color getRED() {
        return RED;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public List<Task> getTaskList() {
        return taskList;
    }

    public void setTaskList(List<Task> taskList) {
        this.taskList = taskList;
    }

    public void addTask(Task task){
        taskList.add(task);
    }

    public List<Task> getTasks(){ return this.taskList; }

    public void removeTask(Task task){
        taskList.remove(task);
    }

}
