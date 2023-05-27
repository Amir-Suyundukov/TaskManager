package Amir.Entity;
/**
 * проект
 */
import java.time.LocalDateTime;

public class Project extends AbstractEntity {
    private final String name;
    private String description;
    private final LocalDateTime createDate;
    private final Integer id;
    private final Integer userId;


    public Project(String name, String description, LocalDateTime createDate, Integer id, Integer userId) {
        this.name = name;
        this.description = description;
        this.createDate = createDate;
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

    public Integer getUserId() {
        return userId;
    }

}


