package Amir.enums;
/**
 * тип роли
 */
public enum RoleType {
    ADMIN("admin"),
    USER("user");
    private String name;
    RoleType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
