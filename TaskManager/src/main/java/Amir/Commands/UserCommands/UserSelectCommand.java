package Amir.Commands.UserCommands;
/**
 * просмотр пользователя
 */
import Amir.Entity.User;
import Amir.enums.RoleType;
import Amir.Utils.ConsoleHelper;
import Amir.Utils.DateHelper;
import Amir.servise.UserService;

public class UserSelectCommand {
    public static void userSelect(UserService userService){
        System.out.println("просмотр пользователя");
        System.out.println("введите имя пользователя, которого хотите посмотреть");
        String name = ConsoleHelper.scanner();
        User user = userService.findByName(name);
        if (user != null && user.getRoleType().equals(RoleType.ADMIN)){
            System.out.println("[ИМЯ] " + user.getName());
            System.out.println("[ЛОГИН] " + user.getLogin());
            System.out.println("[ПАРОЛЬ] " + user.getPassword());
            System.out.println("[ID] " + user.getId());
            System.out.println("[ВРЕМЯ СОЗДАНИЯ] " + DateHelper.dateFormat(user.getCreateDate()));
            System.out.println("[РОЛЬ] " + user.getRoleType());
        }else {
            System.out.println("НЕТ ДОСТУПА ИЛИ НЕ СУЩЕСТВУЕТ ТАКОГО ПОЛЬЗОВАТЕЛЯ");
        }
    }
}
