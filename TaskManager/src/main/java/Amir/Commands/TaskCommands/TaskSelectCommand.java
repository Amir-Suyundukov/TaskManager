package Amir.Commands.TaskCommands;
/**
 * все о таске
 */
import Amir.Commands.AbstractCommand;
import Amir.Entity.Task;
import Amir.Utils.ConsoleHelper;
import Amir.Utils.DateHelper;
import Amir.servise.TaskService;

public class TaskSelectCommand extends AbstractCommand {
    @Override
    protected String getName() {
        return "task-select";
    }

    @Override
    protected String getDescription() {
        return "все о таске";
    }

    @Override
    protected boolean isNeedAuthorization() {
        return false;
    }

    public static void execute(TaskService taskService) {
        System.out.println("[TASK-SELECT]");
        System.out.println("ENTER TASK NAME");
        String name = ConsoleHelper.scanner();
        Task task = taskService.findByName(name);
        if (task != null) {
            System.out.println("[TASK-NAME] - " + task.getName());
            System.out.println("[TASK-DESCRIPTION] - " + task.getDescription());
            System.out.println("[DATE] - " + DateHelper.dateFormat(task.getCreateDate()));
            System.out.println("[PROJECT] - " + task.getProject().getName());
            System.out.println("[ID] - " + task.getId());
            System.out.println("[USERID] - " + task.getUserId());
        } else {
            System.out.println("такого проекта нет");
        }
    }
}
