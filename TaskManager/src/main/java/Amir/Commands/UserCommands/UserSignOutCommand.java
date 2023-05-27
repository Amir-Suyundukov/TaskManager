package Amir.Commands.UserCommands;
/**
 * выход из системы
 */
import Amir.Utils.ConsoleHelper;
import Amir.servise.UserService;

public class UserSignOutCommand {
    public static void signOut(UserService userService){
        System.out.println("напишите exit чтобы выйте");
        String answer = ConsoleHelper.scanner();
        if (answer.equals("exit")){
            userService.setUserOnline(null);
        }
        System.out.println("завершение сеанса пользования");
    }
}
