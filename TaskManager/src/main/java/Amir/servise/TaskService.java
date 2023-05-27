package Amir.servise;
/**
 * сервис таск
 */
import Amir.Entity.Task;

import java.util.List;

public interface TaskService {
    void save(Task task);
    Task findOne(Integer id);
    Task findByName(String name);
    List<Task> findAll();
    void delete(String name);
    boolean exist(Integer id);
    void deleteAllTaskByProjectName(String projectName);
}
