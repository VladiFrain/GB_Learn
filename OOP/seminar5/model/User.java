package OOP.seminar5.model;

public class User {
    private int id;
    private int balance;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.balance=0;
    }
    public User(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance=balance;
    }

    @Override
    public String toString() {
        return String.format("id: %d name: %s",id,name);
    }

    public int getBalance() {
        return balance;
    }

    public void changeBalance(int amount) {
        this.balance += amount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void showBalance() {
        System.out.printf("User: %d %s balance: %s\n",id,name,balance);
    }
}
