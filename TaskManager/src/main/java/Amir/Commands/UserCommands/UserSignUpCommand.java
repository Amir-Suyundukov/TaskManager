package Amir.Commands.UserCommands;
/**
 * создание нового пльзователя
 */
import Amir.Entity.User;
import Amir.enums.RoleType;
import Amir.Utils.ConsoleHelper;
import Amir.servise.UserService;

import java.time.LocalDateTime;

public class UserSignUpCommand {
    public static void signUp(UserService userService) {
        System.out.println("создание нового пльзователя");
        System.out.println("ведите имя");
        String name = ConsoleHelper.scanner();
        System.out.println("ведите логин");
        String login = ConsoleHelper.scanner();
        System.out.println("введите пароль цифрами");
        Integer password = ConsoleHelper.scannerInt();
        System.out.println("выберите тип роли user/admin");
        RoleType roleType;
        while (true) {
            String role = ConsoleHelper.scanner();
            if (role.equals("user")) {
                roleType = RoleType.USER;
                break;
            }else if (role.equals("admin")) {
                roleType = RoleType.ADMIN;
                break;
            }else {
                System.out.println("выберете роль/неправильно написали и тд/не тупите ^_^");
            }
        }
        System.out.println("создан роль");
        System.out.println("ведите ID");
        Integer id = ConsoleHelper.scannerInt();
        LocalDateTime createDate = LocalDateTime.now();
        User user = new User(id, login, password, name, roleType, createDate);
        userService.save(user);
        System.out.println("пользователь создан");
    }
}
