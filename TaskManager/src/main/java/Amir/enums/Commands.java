package Amir.enums;
/**
 * команды
 */
public enum Commands {
    HELP("help","Show all commands."),
    PROJECT_CREATE("project-create","Create new project"),
    PROJECT_CLEAR("project-clear","Remove all project"),
    PROJECT_LIST("project-list","Show all project"),
    PROJECT_DELETE("project-delete","Remove selected project"),
    PROJECT_EDIT("project-edit","Project description change"),
    PROJECT_SELECT("project-select","Select project"),
    TASK_CREATE("task-create","Create new task"),
    TASK_CLEAR("task-clear","Remove all task"),
    TASK_LIST("task-list","Show all task"),
    TASK_DELETE("task-delete","Remove selected task"),
    TASK_EDIT("task-edit","Task description change"),
    TASK_SELECT("task-select","Select task"),
    SIGN_UP("sign-up","Creating a new user"),
    SIGN_IN("sign-in","Account login"),
    SIGN_OUT("sign-out","Exit from account"),
    USER_SELECT("user-select","User view"),
    USER_EDIT("user-edit","Data changes");
    private final String title;
    private String description;
    Commands(String title, String description){
        this.title = title;
        this.description = description;
    }

}
