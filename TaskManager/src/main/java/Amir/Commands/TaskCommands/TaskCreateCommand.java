package Amir.Commands.TaskCommands;
/**
 * создание нового таска
 */

import Amir.Commands.AbstractCommand;
import Amir.Entity.Project;
import Amir.Entity.Task;
import Amir.Storage;
import Amir.Utils.ConsoleHelper;
import Amir.servise.TaskService;

import java.time.LocalDateTime;

public class TaskCreateCommand extends AbstractCommand {
    @Override
    protected String getName() {
        return "task-create";
    }

    @Override
    protected String getDescription() {
        return "создание нового таска";
    }

    @Override
    protected boolean isNeedAuthorization() {
        return false;
    }

    public static void execute(TaskService taskService) {
        System.out.println("[TASK-CREATE]");
        System.out.println("ENTER NAME:");
        String name = ConsoleHelper.scanner();
        System.out.println("[OK]");
        System.out.println("enter description");
        String description = ConsoleHelper.scanner();
        System.out.println("ok");
        System.out.println("enter ID");
        Integer id = ConsoleHelper.scannerInt();
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("введите id пользователя которому хотите присвоить такс");
        Integer userId = ConsoleHelper.scannerInt();
        System.out.println("введите имя проекта");
        String projectName = ConsoleHelper.scanner();
        for (Project project : Storage.getProjectList()) {
            if (project.getName().equals(projectName)) {
                Task task = new Task(name, description, dateTime, project, id, userId);
                taskService.save(task);
                System.out.println("ok");
            }
        }
    }
}
