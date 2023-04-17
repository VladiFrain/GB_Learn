package OOP.seminar5.view;

public class Messages {
    public static void SayNoMoney(){
        System.out.println("Недостаточно средств");
    }
    public static void ShowOperation(int amount){
        if(amount > 0){
            System.out.println("Добавлено: " + amount);
        } else if (amount < 0){
            System.out.println("Выдано: " + amount);
        }
    }

    public static void wrongName(String message){
        System.out.println("Неверное имя пользователя");
        if(!message.isEmpty()){
            System.out.println(message);
        }
    }
    public static void noUser(){
        System.out.println("Пользователь не найден");
    }
}
