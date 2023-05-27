package Amir;
/**
 * хранение
 */
import Amir.Entity.Project;
import Amir.Entity.Task;
import Amir.Entity.User;

import java.util.ArrayList;


public class Storage {
    private static final ArrayList<Project> projectList = new ArrayList<>();
    private static final ArrayList<Task> taskList = new ArrayList<>();
    private static final ArrayList<User> UserList = new ArrayList<>();

    public static ArrayList<Project> getProjectList() {
        return projectList;
    }

    public static ArrayList<Task> getTaskList() {
        return taskList;
    }
    public static ArrayList<User> getUserList(){
        return UserList;
    }
}
