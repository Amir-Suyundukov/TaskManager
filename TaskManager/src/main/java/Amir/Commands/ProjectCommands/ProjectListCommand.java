package Amir.Commands.ProjectCommands;
/**
 * список проектов
 */
import Amir.Commands.AbstractCommand;
import Amir.Entity.Project;
import Amir.Entity.User;
import Amir.servise.ProjectService;
import Amir.servise.UserService;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class ProjectListCommand extends AbstractCommand {
    @Override
    protected String getName() {
        return "project-list";
    }

    @Override
    protected String getDescription() {
        return "список проектов";
    }

    @Override
    protected boolean isNeedAuthorization() {
        return false;
    }

    public static void execute(ProjectService projectService, UserService userService) {
        System.out.println("PROJECT-LIST");
        User userOnline = userService.getUserOnline();
        List<Project> listId = projectService.findAll().stream()
                .filter(x -> Objects.equals(x.getUserId(), userOnline.getId()))
                .sorted(Comparator.comparing(Project::getName)).toList();
        if (listId.isEmpty()) {
            System.out.println("пусто");
        }
        for (int i = 0; i < listId.size(); i++) {
            System.out.println(i + 1 + ". " + listId.get(i).getName());
        }
    }
}
