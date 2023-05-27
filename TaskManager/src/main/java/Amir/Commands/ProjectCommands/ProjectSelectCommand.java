package Amir.Commands.ProjectCommands;
/**
 * все о проекте
 */
import Amir.Commands.AbstractCommand;
import Amir.Entity.Project;
import Amir.Utils.ConsoleHelper;
import Amir.Utils.DateHelper;
import Amir.servise.ProjectService;

public class ProjectSelectCommand extends AbstractCommand {
    @Override
    protected String getName() {
        return "project-select";
    }

    @Override
    protected String getDescription() {
        return "все о проекте";
    }

    @Override
    protected boolean isNeedAuthorization() {
        return false;
    }

    public static void execute(ProjectService projectService) {
        System.out.println("[PROJECT-SELECT]");
        System.out.println("ENTER PROJECT NAME");
        String name = ConsoleHelper.scanner();
        Project project = projectService.findByName(name);
        if (project != null) {
            System.out.println("[PROJECT-NAME] - " + name);
            System.out.println("[PROJECT-DESCRIPTION] - " + project.getDescription());
            System.out.println("[DATE] - " + DateHelper.dateFormat(project.getCreateDate()));
            System.out.println("[ID] - " + project.getId());
            System.out.println("[USERID] - " + project.getUserId());
        } else {
            System.out.println("нет такого проекта");
        }
    }
}