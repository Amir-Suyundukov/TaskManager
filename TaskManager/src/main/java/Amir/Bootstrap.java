package Amir;
/**
 * логика
 */

import Amir.Commands.AbstractCommand;
import Amir.Commands.OtherClass.Exit;
import Amir.Commands.OtherClass.Help;
import Amir.Commands.ProjectCommands.*;
import Amir.Commands.TaskCommands.*;
import Amir.Commands.UserCommands.*;
import Amir.Entity.Project;
import Amir.Entity.Task;
import Amir.Entity.User;
import Amir.Repository.*;
import Amir.enums.RoleType;
import Amir.Utils.ConsoleHelper;
import Amir.servise.*;

import java.time.LocalDateTime;
import java.util.HashMap;


public class Bootstrap {
    public void start() {
        ProjectRepository projectRepository = new ProjectRepositoryImp();
        ProjectService projectService = new ProjectServiceImpl(projectRepository);
        TaskRepository taskRepository = new TaskRepositoryImp();
        TaskService taskService = new TaskServiceImpl(taskRepository);
        UserRepository userRepository = new UserRepositoryImp();
        UserService userService = new  UserServiceImpl(userRepository);
        HashMap<String, AbstractCommand> hashMap = new HashMap<>();
        addDefaultData(projectService, taskService, userService);
        System.out.println("*** WELCOME TO TASK MANAGER ***");
        while (true) {
            String str = ConsoleHelper.scanner();
            switch (str) {
                case "project-create" -> {
                    ProjectCreateCommand.execute(projectService);
                }
                case "task-create" -> {
                    TaskCreateCommand.execute(taskService);
                }
                case "project-edit" -> {
                    ProjectEditCommand.execute(projectService);
                }
                case "project-select" -> {
                    ProjectSelectCommand.execute(projectService);
                }
                case "task-edit" -> {
                    TaskEditCommand.execute(taskService);
                }
                case "task-select" -> {
                    TaskSelectCommand.execute(taskService);
                }
                case "project-list" -> {
                    ProjectListCommand.execute(projectService, userService);
                }
                case "task-list" -> {
                    TaskListCommand.execute(taskService,userService);
                }
                case "project-clear" -> {
                    ProjectClearCommand.execute(projectService);
                }
                case "task-clear" -> {
                    TaskClearCommand.execute(taskService);
                }
                case "project-delete" -> {
                    ProjectDeleteCommand.execute(projectService,taskService);
                }
                case "task-delete" -> {
                    TaskDeleteCommand.execute(taskService);
                }
                case "sign-up" -> {
                    UserSignUpCommand.signUp(userService);
                }
                case "sign-in" -> {
                    UserSignInCommand.signIn(userService);
                }
                case "user-select" -> {
                    UserSelectCommand.userSelect(userService);
                }
                case "user-edit" -> {
                    UserEditCommand.UserEdit(userService);
                }
                case "sign-out" -> {
                    UserSignOutCommand.signOut(userService);
                }
                case "help" -> {
                    Help.help();
                }
                case "exit" -> {
                    Exit.exit();
                }
                default -> System.out.println("нет такой команды используйте help для просмотра команд");
            }
        }
    }

    private static void addDefaultData(ProjectService projectService, TaskService taskService, UserService userService) {
        User user = new User(0, "user", 0, "user", RoleType.USER, LocalDateTime.now());
        Project projectU = new Project("projectU", "qwe", LocalDateTime.now(), 1, 0);
        Task taskU = new Task("taskU", "qwe", LocalDateTime.now(), projectU, 3, 0);
        userService.save(user);
        projectService.save(projectU);
        taskService.save(taskU);
        User admin = new User(1, "admin", 1, "admin", RoleType.ADMIN, LocalDateTime.now());
        Project projectA = new Project("ProjectA", "qwe", LocalDateTime.now(),2, 1);
        Task taskA = new Task("taskA", "qwe", LocalDateTime.now(), projectA, 4, 1);
        userService.save(admin);
        projectService.save(projectA);
        taskService.save(taskA);
    }
}