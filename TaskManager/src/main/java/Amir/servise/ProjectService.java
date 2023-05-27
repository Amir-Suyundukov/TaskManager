package Amir.servise;
/**
 * сервис проекта
 */
import Amir.Entity.Project;

import java.util.List;

public interface ProjectService {
    void save(Project project);
    Project findOne(Integer id);
    Project findByName(String name);
    List<Project> findAll();
    void delete(String name);
    boolean exist(Integer id);
}
