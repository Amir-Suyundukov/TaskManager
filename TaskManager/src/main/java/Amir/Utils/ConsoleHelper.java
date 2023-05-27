package Amir.Utils;
/**
 * тут все хранится
 */

import java.util.Scanner;

public class ConsoleHelper {
    public static String scanner(){
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine().trim();
        return line;
    }
    public static Integer scannerInt(){
        Scanner scanner1 = new Scanner(System.in);
        Integer integer = scanner1.nextInt();
        return integer;
    }
}
