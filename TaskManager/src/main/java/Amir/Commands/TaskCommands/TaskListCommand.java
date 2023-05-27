package Amir.Commands.TaskCommands;
/**
 * список тасков
 */

import Amir.Commands.AbstractCommand;
import Amir.Entity.Task;
import Amir.Entity.User;
import Amir.servise.TaskService;
import Amir.servise.UserService;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class TaskListCommand extends AbstractCommand {
    @Override
    protected String getName() {
        return "task-list";
    }

    @Override
    protected String getDescription() {
        return "список тасков";
    }

    @Override
    protected boolean isNeedAuthorization() {
        return false;
    }

    public static void execute(TaskService taskService, UserService userService) {
        System.out.println("TASK-LIST");
        User userOnline = userService.getUserOnline();
        List<Task> listId = taskService.findAll().stream()
                .filter(x -> Objects.equals(x.getUserId(), userOnline.getId()))
                .sorted(Comparator.comparing(Task::getName)).toList();
        if (listId.isEmpty()) {
            System.out.println("пусто");
        }
        for (int i = 0; i < listId.size(); i++) {
            System.out.println(i + 1 + ". " + listId.get(i).getName());
        }
    }
}
