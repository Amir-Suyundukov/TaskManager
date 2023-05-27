package Amir.Repository;
/**
 * репоситория проекта
 */

import Amir.Entity.Project;

import java.util.List;

 public interface ProjectRepository {
     void save(Project project);
     Project findOne(Integer id);
     Project findByName(String name);
     List<Project> findAll();
     void delete(String name);
     boolean exist(Integer id);
}
