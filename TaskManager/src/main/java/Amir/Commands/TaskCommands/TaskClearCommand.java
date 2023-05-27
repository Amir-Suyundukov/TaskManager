package Amir.Commands.TaskCommands;
/**
 * очистка таска
 */

import Amir.Commands.AbstractCommand;
import Amir.servise.TaskService;

public class TaskClearCommand extends AbstractCommand {
    @Override
    protected String getName() {
        return "task-create";
    }

    @Override
    protected String getDescription() {
        return "очистка таска";
    }

    @Override
    protected boolean isNeedAuthorization() {
        return false;
    }

    public static void execute(TaskService taskService) {
        System.out.println("удаление таска");
        taskService.findAll().clear();
    }
}
