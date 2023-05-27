package Amir.Repository;
/**
 * таск репоситору импл
 */
import Amir.Entity.Task;
import Amir.Storage;

import java.util.List;

public class TaskRepositoryImp implements TaskRepository{
    @Override
    public void deleteAllTaskByProjectName(String projectName) {
        Storage.getTaskList().removeIf(task -> task.getProject().getName().equals(projectName));
    }

    @Override
    public void save(Task task) {
        Storage.getTaskList().add(task);
    }

    @Override
    public Task findOne(Integer id) {
        for (Task task : Storage.getTaskList()){
            if (task.getId().equals(id)){
                return task;
            }
        }
        return null;
    }

    @Override
    public Task findByName(String name) {
        for (Task task : Storage.getTaskList()){
            if (task.getName().equals(name)) {
                return task;
            }
        }
        return null;
    }

    @Override
    public List<Task> findAll() {
        return Storage.getTaskList();
    }

    @Override
    public void delete(String name) {
        Storage.getTaskList().removeIf(task -> task.getName().equals(name));
    }

    @Override
    public boolean exist(Integer id) {
        return false;
    }

}
