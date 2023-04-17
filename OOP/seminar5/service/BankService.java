package OOP.seminar5.service;

import OOP.seminar5.model.Bank;
import OOP.seminar5.model.User;
import OOP.seminar5.view.Messages;

public class BankService {
    private Bank bank;
    private UserService userService;

    public BankService() {
        bank = new Bank();
        userService = new UserService();
    }
    public void saveDataBase(){
        bank.saveDataBase();
    }

    public boolean userIdExist(int id){
        return bank.userIdExist(id);
    }
    public User getUserById(int id){
        if (userIdExist(id)){
            return bank.getUserById(id);
        }
        return null;
    }

    public int getNewId(){
        return bank.getSize();
    }
    public User addUser(String name) {
        User newUser = userService.createUser(bank.getSize(), name);
        bank.addUser(newUser);
        return newUser;
    }
    public User registerUser(){
        String newUserName = ConsoleTools.AskString("Введите имя пользователя:");
        if(newUserName.isEmpty()){
            Messages.wrongName("Имя не может быть пустым");
            return null;
        } else if (newUserName.contains(";")){
            Messages.wrongName("Имя не может содержать ';'");
            return null;
        }

        return addUser(newUserName);
    }

    public int getBalance(User user){
        return user.getBalance();
    }
    public void deposit(User user, int amount){
        userService.changeBalance(user, amount);
    }
    public void withdraw(User user, int amount){
        if(getBalance(user) < amount){
            Messages.SayNoMoney();
        }
        else {
            userService.changeBalance(user, -amount);
        }

    }

    public void deleteUser(User user) {
        bank.removeUser(user);
    }
}
