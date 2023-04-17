package OOP.seminar5.view;

import OOP.seminar5.model.User;
import OOP.seminar5.service.BankService;
import OOP.seminar5.service.ConsoleTools;

import java.util.Scanner;

public class BankView {
    private UserView userView;
    private BankService bankService;

    public BankView() {
        userView = new UserView();
        bankService = new BankService();
    }

    public void BankMenu() {
        int userChoice = -1;
        Scanner sc = new Scanner(System.in);
        while (userChoice != 0) {
            showMenu();
            userChoice = sc.nextInt();
            processUserChoice(userChoice);
        }
    }

    private void processUserChoice(int userChoice) {
        if (userView.isAuthorized()) {
            switch (userChoice) {
                case 0 -> bankService.saveDataBase();
                case 1 -> checkBalance();
                case 2 -> deposit();
                case 3 -> withdraw();
                case 4 -> unautorize();
                case 5 -> deleteUser();
            }
        } else {
            switch (userChoice) {
                case 0 -> bankService.saveDataBase();
                case 1 -> addNewUser();
                case 2 -> authorize();
            }
        }
    }

    private void deleteUser() {
        bankService.deleteUser(userView.getCurrentUser());
        unautorize();
    }

    private void unautorize() {
        userView.unauthorize();
    }

    private void withdraw() {
        int amount = ConsoleTools.AskInt("Введите сумму: ");
        bankService.withdraw(userView.getCurrentUser(), amount);
    }

    private void deposit() {
        int amount = ConsoleTools.AskInt("Введите сумму: ");
        bankService.deposit(userView.getCurrentUser(), amount);
    }

    private void authorize() {
        int id = ConsoleTools.AskInt("Введите ID пользователя: ");
        if (bankService.userIdExist(id)) {
            userView.authorize(bankService.getUserById(id));
        } else {
            Messages.noUser();
        }
    }


    private void addNewUser() {
        User result = bankService.registerUser();
        if (result != null) {
            System.out.printf("User %s registered\n",result);
            userView.authorize(result);
        } else {
            System.out.println("User NOT registered");
        }
    }

    private void showMenu() {
        System.out.println("0 - выход");
        if (userView.isAuthorized()) {
            System.out.println("1 - проверить баланс");
            System.out.println("2 - внести деньги");
            System.out.println("3 - выдать деньги");
            System.out.println("4 - сменить пользователя");
            System.out.println("5 - удалить пользователя");
        } else {
            System.out.println("1 - новый пользователь");
            System.out.println("2 - авторизироваться");
        }
        System.out.print("Выберите пункт меню: ");
    }


    private void checkBalance() {
        userView.showBalance();
    }
}
