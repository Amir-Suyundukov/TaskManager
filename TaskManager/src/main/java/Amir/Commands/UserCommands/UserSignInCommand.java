package Amir.Commands.UserCommands;
/**
 * вход в систему
 */
import Amir.Entity.User;
import Amir.Utils.ConsoleHelper;
import Amir.servise.UserService;

public class UserSignInCommand {
    public static void signIn(UserService userService){
        System.out.println("войдите с помощью логина и пароля");
        System.out.println("введите логин");
        String login = ConsoleHelper.scanner();
        System.out.println("введите пароль");
        Integer password = ConsoleHelper.scannerInt();
        User user = userService.findByLogin(login);
        if(user.getLogin().equals(login) && user.getPassword().equals(password)){
            userService.setUserOnline(user);
            System.out.println("вы зашли в профиль");
        } else {
            System.out.println("ведите логин и пароль правильно");
        }
    }
}
