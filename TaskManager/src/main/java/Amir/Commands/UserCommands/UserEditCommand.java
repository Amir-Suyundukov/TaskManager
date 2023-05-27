package Amir.Commands.UserCommands;
/**
 * ИЗМЕНЕНИЯ ПОРОЛЯ И ИМЯНИ
 */
import Amir.Entity.User;
import Amir.Utils.ConsoleHelper;
import Amir.servise.UserService;

public class UserEditCommand {
    public static void UserEdit(UserService userService){
        System.out.println("ИЗМЕНЕНИЯ ПОРОЛЯ И ИМЯНИ");
        System.out.println("ВВЕДИТЕ ЛОГИН");
        String login = ConsoleHelper.scanner();
        User user = userService.findByLogin(login);
        if(user != null){
            System.out.println("ВЫ ХОТИТЕ ИЗМЕНИТЬ ПАРОЛЬ? +/-");
            String answer = ConsoleHelper.scanner();
            if (answer.equals("+")) {
                System.out.println("МЕНЯЙТЕ ПАРОЛЬ");
                Integer password = ConsoleHelper.scannerInt();
                user.setPassword(password);
                System.out.println("OK");
            }else {
                System.out.println("ИЗМЕНИТЕ ИМЯ");
                String name = ConsoleHelper.scanner();
                user.setName(name);
                System.out.println("OK");
            }
        }else {
            System.out.println("НЕПРАВИЛЬНЫЙ ЛОГИН");
        }

    }

}
