package Amir.Commands.ProjectCommands;
/**
 * удаление проектов
 */

import Amir.Commands.AbstractCommand;
import Amir.Entity.Project;
import Amir.Utils.ConsoleHelper;
import Amir.servise.ProjectService;
import Amir.servise.TaskService;

public class ProjectDeleteCommand extends AbstractCommand {
    @Override
    protected String getName() {
        return "project-delete";
    }

    @Override
    protected String getDescription() {
        return "удаление проектов";
    }

    @Override
    protected boolean isNeedAuthorization() {
        return false;
    }

    public static void execute(ProjectService projectService, TaskService taskService) {
        System.out.println("ведите имя проекта для удаления");
        String name = ConsoleHelper.scanner();
        System.out.println("вы точно хотите удалить " + "<" + name + ">? да/нет");
        String answer = ConsoleHelper.scanner();
        Project project = projectService.findByName(name);
        if (answer.equals("да") && project != null) {
            projectService.delete(name);
            taskService.deleteAllTaskByProjectName(name);
            System.out.println("удалено");
        } else {
            System.out.println("не удалено или такого проекта не существует");
        }
    }
}
