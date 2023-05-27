package Amir.Commands.ProjectCommands;
/**
 * создание проекта
 */
import Amir.Commands.AbstractCommand;
import Amir.Entity.Project;
import Amir.Utils.ConsoleHelper;
import Amir.servise.ProjectService;

import java.time.LocalDateTime;

public class ProjectCreateCommand extends AbstractCommand {


    @Override
    public String getName() {
        return "project-create";
    }

    @Override
    public String getDescription() {
        return "создание нового проекта";
    }

    @Override
    protected boolean isNeedAuthorization() {
        return false;
    }

    public static void execute(ProjectService projectService) {
        System.out.println("[PROJECT-CREATE]");
        System.out.println("ENTER NAME:");
        String name = ConsoleHelper.scanner();
        System.out.println("[OK]");
        System.out.println("enter description");
        String description = ConsoleHelper.scanner();
        System.out.println("ok");
        System.out.println("enter ID");
        Integer id = ConsoleHelper.scannerInt();
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("введите id пользователя которого хотите присвоить проект");
        Integer userId = ConsoleHelper.scannerInt();
        Project project = new Project(name, description, dateTime, id, userId);
        projectService.save(project);
        System.out.println("проект создан");
    }
}
