package Amir.servise;
/**
 * сервис таска импл
 */
import Amir.Entity.Project;
import Amir.Entity.Task;
import Amir.Repository.TaskRepository;

import java.util.List;

public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public void save(Task task) {
        taskRepository.save(task);
    }

    @Override
    public Task findOne(Integer id) {
        return taskRepository.findOne(id);
    }

    @Override
    public Task findByName(String name) {
        return taskRepository.findByName(name);
    }

    @Override
    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    @Override
    public void delete(String name) {
        taskRepository.delete(name);
    }

    @Override
    public void deleteAllTaskByProjectName(String projectName) {
        taskRepository.deleteAllTaskByProjectName(projectName);
    }

    @Override
    public boolean exist(Integer id) {
        return false;
    }
}

