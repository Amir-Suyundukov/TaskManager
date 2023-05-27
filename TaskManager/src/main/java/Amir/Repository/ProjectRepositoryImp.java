package Amir.Repository;
/**
 * репосипория проекта импл
 */
import Amir.Entity.Project;
import Amir.Storage;

import java.util.List;

public class ProjectRepositoryImp implements ProjectRepository {
    @Override
    public void save(Project project) {
        Storage.getProjectList().add(project);
    }

    @Override
    public Project findOne(Integer id) {
        for (Project project : Storage.getProjectList()){
            if (project.getId().equals(id)){
                return project;
            }
        }
        return null;
    }

    @Override
    public Project findByName(String name) {
        for (Project project : Storage.getProjectList()){
            if (project.getName().equals(name)){
                return project;
            }
        }
        return null;
    }

    @Override
    public List<Project> findAll() {
        return Storage.getProjectList();
    }

    @Override
    public void delete(String name) {
        Storage.getProjectList().removeIf(project -> project.getName().equals(name));
    }

    @Override
    public boolean exist(Integer id) {
        return false;
    }
}
