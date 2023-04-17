package OOP.seminar5.service;

import java.util.Scanner;

public class ConsoleTools {
    public static String  AskString(String message){
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    public static int  AskInt(String message){
        System.out.print(message);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
