package Amir.Entity;
/**
 * юзер
 */
import Amir.enums.RoleType;

import java.time.LocalDateTime;

public class User {
    private final Integer id;
    private final String login;
    private Integer password;
    private String name;
    private RoleType roleType;
    private final LocalDateTime createDate;

    public User(Integer id, String login, Integer password, String name, RoleType roleType, LocalDateTime createDate) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.name = name;
        this.roleType = roleType;
        this.createDate = createDate;
    }

    public Integer getId() {
        return id;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    public String getLogin() {
        return login;
    }

    public Integer getPassword() {
        return password;
    }
    public void setPassword(Integer newPassword){
        this.password = newPassword;
    }


    public String getName() {
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }
}
