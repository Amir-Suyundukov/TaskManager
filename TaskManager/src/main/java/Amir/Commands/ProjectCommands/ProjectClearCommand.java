package Amir.Commands.ProjectCommands;
/**
 * очистка проектов
 */

import Amir.Commands.AbstractCommand;
import Amir.servise.ProjectService;

public class ProjectClearCommand extends AbstractCommand {

    @Override
    protected String getName() {
        return "project-clear";
    }

    @Override
    protected String getDescription() {
        return "очистка проектов";
    }

    @Override
    protected boolean isNeedAuthorization() {
        return false;
    }

    public static void execute(ProjectService projectService) {
        System.out.println("удаление проектов");
        projectService.findAll().clear();
    }
}
