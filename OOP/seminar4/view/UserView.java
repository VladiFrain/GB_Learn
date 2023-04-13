package OOP.seminar4.view;


import org.example.homework.h10oop.data.Student;
import org.example.homework.h10oop.data.User;

import java.util.List;

public interface UserView<T extends User>{

    T sendOnConsole(List<User> userListlist);
}