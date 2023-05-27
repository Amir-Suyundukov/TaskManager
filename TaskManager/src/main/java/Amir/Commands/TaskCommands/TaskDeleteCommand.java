package Amir.Commands.TaskCommands;
/**
 * удаление такса
 */

import Amir.Commands.AbstractCommand;
import Amir.Entity.Task;
import Amir.Utils.ConsoleHelper;
import Amir.servise.TaskService;

public class TaskDeleteCommand extends AbstractCommand {
    @Override
    protected String getName() {
        return "task-delete";
    }

    @Override
    protected String getDescription() {
        return "удаление такса";
    }

    @Override
    protected boolean isNeedAuthorization() {
        return false;
    }

    public static void execute(TaskService taskService) {
        System.out.println("ведите имя таска для удаления");
        String name = ConsoleHelper.scanner();
        System.out.println("вы точно хотите удалить " + "<" + name + ">? да/нет");
        String answer = ConsoleHelper.scanner();
        Task task = taskService.findByName(name);
        if (answer.equals("да") && task != null) {
            taskService.delete(name);
            System.out.println("удалено");
        } else {
            System.out.println("не удалено или такого проекта нет");
        }
    }
}
