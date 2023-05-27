package Amir.Repository;
/**
 * таск репоситору
 */
import Amir.Entity.Task;

import java.util.List;

public interface TaskRepository {
    void save(Task task);
    Task findOne(Integer id);
    Task findByName(String name);
    List<Task> findAll();
    void delete(String name);
    boolean exist(Integer id);
    void deleteAllTaskByProjectName(String projectName);
}
