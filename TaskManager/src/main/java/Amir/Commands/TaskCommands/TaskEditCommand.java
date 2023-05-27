package Amir.Commands.TaskCommands;
/**
 * изменение описания таска
 */

import Amir.Commands.AbstractCommand;
import Amir.Entity.Task;
import Amir.Utils.ConsoleHelper;
import Amir.servise.TaskService;

public class TaskEditCommand extends AbstractCommand {
    @Override
    protected String getName() {
        return "task-edit";
    }

    @Override
    protected String getDescription() {
        return "изменение описания таска";
    }

    @Override
    protected boolean isNeedAuthorization() {
        return false;
    }

    public static void execute(TaskService taskService) {
        System.out.println("[EDIT-TASK]");
        System.out.println("ENTER PROJECT NAME");
        String name = ConsoleHelper.scanner();
        Task task = taskService.findByName(name);
        if (task != null) {
            System.out.println("enter new description");
            String description = ConsoleHelper.scanner();
            task.setDescription(description);
            System.out.println("ok");
        } else {
            System.out.println("такого проекта нет");
        }
    }
}
