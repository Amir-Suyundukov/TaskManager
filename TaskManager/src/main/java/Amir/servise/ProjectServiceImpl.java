package Amir.servise;
/**
 * сервис проекта импл
 */
import Amir.Entity.Project;
import Amir.Repository.ProjectRepository;
import Amir.Repository.TaskRepository;

import java.util.List;

public class ProjectServiceImpl implements ProjectService{
    private ProjectRepository projectRepository;
    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public void save(Project project) {
        projectRepository.save(project);
    }

    @Override
    public Project findOne(Integer id) {
        return projectRepository.findOne(id);
    }

    @Override
    public Project findByName(String name) {
        return projectRepository.findByName(name);
    }

    @Override
    public List<Project> findAll() {
        return projectRepository.findAll();
    }

    @Override
    public void delete(String name) {
        projectRepository.delete(name);
    }

    @Override
    public boolean exist(Integer id) {
        return false;
    }
}
