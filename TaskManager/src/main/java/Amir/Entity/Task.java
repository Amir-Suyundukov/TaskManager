package Amir.Entity;
/**
 * таск
 */
import java.time.LocalDateTime;

public class Task extends AbstractEntity {
    private final String name;

    private String description;

    private final LocalDateTime createDate;
    private final Project project;
    private final Integer id;
    private final Integer userId;

    public Task(String name, String description, LocalDateTime createDate, Project project, Integer id, Integer userId) {
        this.name = name;
        this.description = description;
        this.createDate = createDate;
        this.project = project;
        this.id = id;
        this.userId = userId;
    }


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String newDescription) {
        this.description = newDescription;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public Project getProject() {
        return project;
    }

    public Integer getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createDate=" + createDate +
                ", project=" + project +
                ", id=" + id +
                ", userId=" + userId +
                '}';
    }
}

