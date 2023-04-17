package OOP.seminar5.model;

import view.UserView;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<User> accounts;

    public Bank() {
        readDatabase();
    }

    public int getSize(){
        return accounts.size();
    }

    public void addUser(User user){
        accounts.add(user);
    }

    public boolean userIdExist(int id){
        return id < getSize();
    }
    public User getUserById(int id){
        return accounts.get(id);
    }

    public void readDatabase(){
        accounts = new ArrayList<User>();
        File file = new File("database.txt");
        if(!file.exists()){
            return;
        }
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] param = line.split(";");
                addUser(new User(Integer.parseInt(param[0]),param[1],Integer.parseInt(param[2])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveDataBase(){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("database.txt",false);
            for(User user:accounts){
                String userString = "" + user.getId() + ";" + user.getName() + ";" + user.getBalance()+ "\n";
                fileWriter.write(userString);
            }
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void removeUser(User user) {
        accounts.remove(user);
    }
}
