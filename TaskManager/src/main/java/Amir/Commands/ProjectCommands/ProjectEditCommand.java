package Amir.Commands.ProjectCommands;
/**
 * изменение описание проекта
 */
import Amir.Commands.AbstractCommand;
import Amir.Entity.Project;
import Amir.Utils.ConsoleHelper;
import Amir.servise.ProjectService;

public class ProjectEditCommand extends AbstractCommand {
    @Override
    protected String getName() {
        return "project-edit";
    }

    @Override
    protected String getDescription() {
        return "изменение описания проекта";
    }

    @Override
    protected boolean isNeedAuthorization() {
        return false;
    }

    public static void execute(ProjectService projectService) {
        System.out.println("[PROJECT-EDIT]");
        System.out.println("ENTER PROJECT NAME");
        String name = ConsoleHelper.scanner();
        Project project = projectService.findByName(name);
        if (project != null) {
            System.out.println("enter new description");
            String description = ConsoleHelper.scanner();
            project.setDescription(description);
            System.out.println("ok");
        } else {
            System.out.println("такого проекта не существует");
        }
    }
}
